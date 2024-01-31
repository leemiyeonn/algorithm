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

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            int n3 = Integer.parseInt(st.nextToken());

            if (n1 == 0 && n2 == 0 && n3 == 0) {
                break;
            }

            int max = Math.max(n1, Math.max(n2, n3));
            int sum = n1 + n2 + n3;

            if (max >= (sum - max)) {
                bw.write("Invalid");
            } else if (n1 == n2 && n1 == n3 && n2 == n3) {
                bw.write("Equilateral");
            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                bw.write("Isosceles");
            } else bw.write("Scalene");

            bw.newLine();
        }

        br.close();
        bw.close();
    }
}