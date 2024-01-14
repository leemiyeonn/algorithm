import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.valueOf(br.readLine());


        for (int i = 0; i < testCase; i++) {
            String word = br.readLine();
            Character firstChar = word.charAt(0);
            Character endChar = word.charAt(word.length() - 1);

            bw.write(String.valueOf(firstChar) + String.valueOf(endChar));

            if (i < testCase - 1) {
                bw.newLine();
            }
        }
        bw.close();
    }
}