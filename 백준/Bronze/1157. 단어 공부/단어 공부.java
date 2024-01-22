import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase();
        char[] wordArr = word.toCharArray();
        int[] frequencyArr = new int[26];

        for (char c : wordArr) {
            frequencyArr[c - 'A']++;
        }

        int maxIndex = 0;
        for (int i = 0; i < frequencyArr.length; i++) {
            if (frequencyArr[i] > frequencyArr[maxIndex]){
                maxIndex = i;
            }
        }

        int maxCount = 0;
        char mostFrequentChar = '?';

        for (char c = 'A'; c <= 'Z'; c++) {
            if (frequencyArr[c - 'A'] == frequencyArr[maxIndex]) {
                maxCount++;
                mostFrequentChar = c;
            }
        }

        if (maxCount > 1) {
            mostFrequentChar = '?';
        }

        bw.write(mostFrequentChar);
        bw.close();
    }
}