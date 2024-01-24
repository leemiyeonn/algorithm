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

        long n = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        StringBuilder result = new StringBuilder();

        while (n > 0) {
            long mod = n % b;
            char digit;

            if (mod < 10) {
                digit = (char) ('0' + mod);
            } else {
                digit = (char) ('A' + mod - 10);
            }

            result.append(digit);
            n /= b;
        }

        bw.write(result.reverse().toString());

        br.close();
        bw.close();
    }
}