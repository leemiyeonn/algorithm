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

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());

        int range = up - down;
        int lastUp = total - down;
        int day = lastUp / range;

        if (lastUp % range != 0) {
            day += 1;
        }

        bw.write(String.valueOf(day));

        br.close();
        bw.close();
    }
}