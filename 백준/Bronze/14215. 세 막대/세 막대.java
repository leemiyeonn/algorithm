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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int n1 = arr[0];
        int n2 = arr[1];
        int n3 = arr[2];

        if (n3 < n1 + n2) {
            bw.write(String.valueOf((n1 + n2 + n3)));
        } else {
            bw.write(String.valueOf(n1 + n2 + n1 + n2 - 1));
        }

        br.close();
        bw.close();
    }
}