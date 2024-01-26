import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int round = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < round; i++) {
            int price = Integer.parseInt(br.readLine());

            while (price > 0) {
                int q = price / quarter;
                price %= quarter;

                int d = price / dime;
                price %= dime;

                int n = price / nickel;
                price %= nickel;

                int p = price / penny;
                price %= penny;

                bw.write(String.format("%d %d %d %d", q, d, n, p));
                bw.newLine();
            }
        }

        br.close();
        bw.close();
    }
}