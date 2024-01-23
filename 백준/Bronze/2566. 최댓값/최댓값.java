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

        int n = 9;
        int m = 9;
        int[][] a = new int[n][m];

        int max = 0;
        int maxIndexN = 0;
        int maxIndexM = 0;

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(st.nextToken());

                if (a[i][j] > max) {
                    max = a[i][j];
                    maxIndexN = i;
                    maxIndexM = j;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf((maxIndexN + 1) + " " + (maxIndexM + 1)));

        bw.close();
    }
}