import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;

        if (n == 1) {
            bw.write("1");
        } else {
            while (range <= n) {
                range = range + (6 * count);
                count++;
            }
            bw.write(String.valueOf(count));
        }
        
        br.close();
        bw.close();
    }
}