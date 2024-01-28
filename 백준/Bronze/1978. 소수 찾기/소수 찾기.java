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

        int round = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;

        for (int i = 0; i < round; i++) {
            int n = Integer.parseInt(st.nextToken());
            boolean isPerfect = (n > 1);

            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    isPerfect = false;
                    break;
                }
            }

            if (isPerfect) {
                count++;
            }
        }

        bw.write(String.valueOf(count));

        bw.close();
        br.close();
    }
}