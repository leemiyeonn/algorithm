import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++ ) {
            int index = word.indexOf(alphabet);
            bw.write(String.valueOf(index));
            if (alphabet < 'z') {
                bw.write(" ");
            }
        }
        bw.close();
    }
}