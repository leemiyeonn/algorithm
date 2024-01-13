import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = bf.readLine();
            if (line.isEmpty() || line.equals("0 0")) {
                break;
            }
            
            String[] numbers = line.split(" ");
            int n1 = Integer.parseInt(numbers[0]);
            int n2 = Integer.parseInt(numbers[1]);
            int sum = n1 + n2;

            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.close();
    }
}