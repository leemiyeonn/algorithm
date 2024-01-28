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

        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                count++;

                if (count == n2) {
                    bw.write(String.valueOf(i));
                }
            }
        }

        if (count < n2) {
            bw.write("0");
        }

        bw.close();
        br.close();
    }
}