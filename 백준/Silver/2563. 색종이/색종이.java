import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        int[][] a = new int[100][100];

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            for (int j = n; j < n + 10; j++) {
                for (int k = m; k < m + 10; k++) {
                    a[j][k] = 1;
                }
            }
        }

        int blackArea = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (a[i][j] == 1) {
                    blackArea++;
                }
            }
        }

        bw.write(String.valueOf(blackArea));
        bw.close();
    }
}