import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input1 = br.readLine();
        String[] arr1 = input1.split(" ");
        int totalBasket = Integer.parseInt(arr1[0]);
        int totalCount = Integer.parseInt(arr1[1]);

        int[] basketArr = new int[totalBasket];

        for (int i = 0; i < totalCount; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");

            int startBasket = Integer.parseInt(arr[0]);
            int endBasket = Integer.parseInt(arr[1]);
            int ball = Integer.parseInt(arr[2]);

            for (int j = startBasket; j <= endBasket; j++) {
                basketArr[j - 1] = ball;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int k = 0; k < basketArr.length; k++) {
            result.append(basketArr[k]);
            if (k < basketArr.length - 1) {
                result.append(" ");
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}