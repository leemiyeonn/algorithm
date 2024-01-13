import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] totalAndNumber = br.readLine().split(" ");
        int total = Integer.parseInt(totalAndNumber[0]);
        int number = Integer.parseInt(totalAndNumber[1]);

        List<Integer> numbers = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (Integer n : numbers) {
            if (n < number) {
                bw.write(String.valueOf(n));
                bw.write(" ");
            }
        }

        bw.close();
    }
}