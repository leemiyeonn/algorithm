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

        int n = 5;
        int m = 15;
        char[][] a = new char[n][m];
        int maxLength = 0;

        for (int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] wordArr = st.nextToken().toCharArray();
            
            for (int j = 0; j < wordArr.length; j++) {
                a[i][j] = wordArr[j];
            }

            if (wordArr.length > maxLength) {
                maxLength = wordArr.length;
            }
        }

        for (int i = 0; i < maxLength; i++){
            for (int j = 0; j < n; j++){
                if (a[j][i] != '\0') { 
                    bw.write(a[j][i]);
                }
            }
        }
        bw.close();
    }
}