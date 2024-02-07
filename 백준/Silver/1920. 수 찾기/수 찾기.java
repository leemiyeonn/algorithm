import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count1 = Integer.parseInt(br.readLine());
        int[] arr = new int[count1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < count1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count2 = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < count2; i++) {
            int target = Integer.parseInt(st.nextToken());
            boolean find = binarySearch(arr, target);

            if (find) {
                resultBuilder.append("1\n");
            } else {
                resultBuilder.append("0\n");
            }
        }

        bw.write(resultBuilder.toString());

        bw.close();
        br.close();
    }

    private static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midIndex = (start + end) / 2;
            int value = arr[midIndex];

            if (value < target) {
                start = midIndex + 1;
            } else if (value > target) {
                end = midIndex - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
