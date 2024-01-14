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
        int basketCount = Integer.parseInt(st.nextToken());
        int changeCount = Integer.parseInt(st.nextToken());

        int[] basketArr = new int[basketCount];

        for (int k = 0; k < basketArr.length; k++) {
            basketArr[k] = k + 1;
        }

        for (int i = 0; i < changeCount; i++) {
            st = new StringTokenizer(br.readLine());
            int basket1 = Integer.parseInt(st.nextToken());
            int basket2 = Integer.parseInt(st.nextToken());

            int temp1 = basketArr[basket1 - 1];
            int temp2 = basketArr[basket2 - 1];

            basketArr[basket1 - 1] = temp2;
            basketArr[basket2 - 1] = temp1;
        }

        for (int j = 0; j < basketArr.length; j++) {
            bw.write(String.valueOf(basketArr[j]));
            if (j < basketArr.length - 1) {
                bw.write(" ");
            }
        }

        bw.close();
    }
}