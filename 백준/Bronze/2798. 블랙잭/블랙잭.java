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
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int cardCount = Integer.parseInt(st1.nextToken());
        int number = Integer.parseInt(st1.nextToken());

        int[] cardArr = new int[cardCount];

        StringTokenizer st2 = new StringTokenizer((br.readLine()));
        for (int i = 0; i < cardCount; i++) {
            cardArr[i] = Integer.parseInt(st2.nextToken());
        }

        int result = 0;

        for (int i = 0; i < cardCount - 2; i++) {
            for (int j = i + 1; j < cardCount - 1; j++) {
                for (int k = j + 1; k < cardCount; k++) {
                    int sum = cardArr[i] + cardArr[j] + cardArr[k];

                    if (sum <= number && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.close();
    }
}