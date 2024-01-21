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

        String n1 = st.nextToken();
        String n2 = st.nextToken();

        Integer irn1 = Integer.parseInt(new StringBuilder(n1).reverse().toString());
        Integer irn2 = Integer.parseInt(new StringBuilder(n2).reverse().toString());

        int result = (irn1 < irn2) ? irn2 : irn1;

        bw.write(String.valueOf(result));
        bw.close();
    }
}