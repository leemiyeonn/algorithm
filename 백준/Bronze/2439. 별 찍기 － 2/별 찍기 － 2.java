import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            str.append("*");
            String format = String.format("%" + n + "s", str);

            bw.write(format);
            bw.newLine();
        }

        bw.flush();
    }
}