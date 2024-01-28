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

            if (n1 == 0 && n2 == 0) {
                break;
            }

            if (n2 % n1 == 0) {
                bw.write("factor");
            } else if (n1 % n2 == 0) {
                bw.write("multiple");
            } else {
                bw.write("neither");
            }

            bw.newLine();
        }

        bw.close();
        br.close();
    }
}