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
        char[] wordArr = word.toCharArray();
        
        int count = 0;
        
        for (int i = 0; i < wordArr.length; i++) {
            char currentChar = wordArr[i];

            if (currentChar == 'c' && i < wordArr.length - 1) {
                if (wordArr[i + 1] == '=' || wordArr[i + 1] == '-') {
                    i++;
                }
            } else if (currentChar == 'd' && i < wordArr.length - 1) {
                if (wordArr[i + 1] == '-') {
                    i++;
                } else if (i < wordArr.length - 2) {
                    if (wordArr[i + 1] == 'z' && wordArr[i + 2] == '='){
                        i+=2;
                    }
                }
            } else if (currentChar == 'l' && i < wordArr.length - 1) {
                if (wordArr[i + 1] == 'j') {
                    i++;
                }
            } else if (currentChar == 'n' && i < wordArr.length - 1) {
                if (wordArr[i + 1] == 'j') {
                    i++;
                }
            } else if (currentChar == 's' && i < wordArr.length - 1) {
                if (wordArr[i + 1] == '=') {
                    i++;
                }
            } else if (currentChar == 'z' && i < wordArr.length - 1) {
                if (wordArr[i + 1] == '=') {
                    i++;
                }
            }

            count++;
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
}