import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketCount = Integer.parseInt(st.nextToken());
        int reverseCount = Integer.parseInt(st.nextToken());

        List<Integer> basketList = IntStream.rangeClosed(1, basketCount).boxed().collect(Collectors.toList());

        for (int i = 0; i < reverseCount; i++) {
            st = new StringTokenizer(br.readLine());
            int startBasket = Integer.parseInt(st.nextToken());
            int endBasket = Integer.parseInt(st.nextToken());

            for (int j = startBasket - 1, k = endBasket - 1; j < k; j++, k-- ) {
                int temp = basketList.get(j);
                basketList.set(j, basketList.get(k));
                basketList.set(k, temp);
            }
        }

        for (int i = 0; i < basketList.size(); i++) {
            bw.write(String.valueOf(basketList.get(i)));
            if (i < basketList.size() - 1) {
                bw.write(" ");
            }
        }

        bw.close();
    }
}