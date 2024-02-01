import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i < N; i++) {

            int sum = i;
            int number = i;

            while(number > 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum == N) {
                result = i;
                break;
            } else result = 0;

        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}