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

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        for (int i = 2; i < N + 1; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i + i; j < N + 1; j = j + i) {
                arr[j] = 0;
            }
        }

        for (int i = M; i < N + 1; i++) {
            if (arr[i] != 0) {
                bw.write(String.valueOf(arr[i]));
                bw.newLine();
            }
        }

        bw.close();
        br.close();
    }
}