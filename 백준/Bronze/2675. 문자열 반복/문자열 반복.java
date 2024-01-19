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
        StringBuilder sb = new StringBuilder();

        int round = Integer.parseInt(st.nextToken());

        for (int i = 0; i < round; i++) {
            st = new StringTokenizer(br.readLine());
            int repeatCount = Integer.parseInt(st.nextToken());
            String word = st.nextToken();

            for (char c : word.toCharArray()) {
                for (int j = 0; j < repeatCount; j++) {
                    sb.append(c);
                }
            }
            sb.append(System.lineSeparator());
        }

        bw.write(String.valueOf(sb));
        bw.close();
    }
}