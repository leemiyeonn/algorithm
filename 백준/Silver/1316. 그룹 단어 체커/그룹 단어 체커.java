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
        Integer count = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            char[] wordArr = word.toCharArray();

            boolean isGroupWord = true;
            boolean[] visited = new boolean[26];

            for (int j = 0; j < wordArr.length; j++) {
                int currentIndex = wordArr[j] - 'a';
                if (j > 0 && visited[currentIndex] && wordArr[j - 1] != wordArr[j]){
                    isGroupWord = false;
                }
                visited[currentIndex] = true;
            }

            if (isGroupWord) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}