import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;

            if (n == -1) {
                break;
            }

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                bw.write(n + " = 1");
                for (int i = 2; i <= n/2; i++) {
                    if (n % i == 0) {
                        bw.write(" + " + i);
                    }
                }
            } else {
                bw.write(n + " is NOT perfect.");
            }

            bw.newLine();
        }



        bw.close();
        br.close();
    }
}