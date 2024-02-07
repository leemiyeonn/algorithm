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

        int number = Integer.parseInt(st.nextToken());
        int round = Integer.parseInt(st.nextToken());

        int[] arr = new int[number];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[number];
        for (int i = 0; i < number; i++) {
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i - 1] + arr[i];
            }
        }

        for (int i = 0; i < round; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int resultSum = sum[end - 1];
            if (start != 1) {
                resultSum = sum[end - 1] - sum[start - 2];
            }

            bw.write(String.valueOf(resultSum));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}