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
        StringBuilder sb = new StringBuilder(word);

        String reverseWord = sb.reverse().toString();

        if (word.equals(reverseWord)) {
            bw.write(String.valueOf("1"));
        } else bw.write(String.valueOf("0"));

        bw.close();
    }
}