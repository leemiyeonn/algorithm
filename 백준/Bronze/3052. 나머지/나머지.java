import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputCount = 10;
        List<Integer> numberList = new ArrayList();

        for (int i = 0; i < inputCount; i++) {
            int number = Integer.parseInt(br.readLine());
            numberList.add(number);
        }

        List<Integer> calculateList = numberList.stream()
                .map(n -> n % 42).collect(Collectors.toList());

        long result = calculateList.stream().distinct().count();

        bw.write(String.valueOf(result));
        bw.close();
    }
}