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

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        int result = 0;
        int power = 1;

        for (int i = n.length() - 1 ; i >= 0; i--) {
            char digit = n.charAt(i);
            int value;

            if (Character.isDigit(digit)) {
                value = Character.getNumericValue(digit);
            } else {
                value = digit - 'A' + 10;
            }

            result += value * power;
            power *= b;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}