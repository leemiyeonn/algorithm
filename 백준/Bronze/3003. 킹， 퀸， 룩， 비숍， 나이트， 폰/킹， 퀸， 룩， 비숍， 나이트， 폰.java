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

        int[] inputArr = new int[6];
        int[] chessArr = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < inputArr.length; i++) {
            result[i] = chessArr[i] - inputArr[i];
        }

        for (int i : result) {
            bw.write(String.valueOf(i));
            bw.write(" ");
        }

        bw.close();
    }
}