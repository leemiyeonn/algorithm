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

        int total = Integer.parseInt(br.readLine());
        String numbers = br.readLine();
        int number = Integer.parseInt(br.readLine());
        
        List<Integer> integers = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        
        long result = integers.stream()
                .filter(s -> s == number)
                .count();

        bw.write(String.valueOf(result));
        bw.newLine();
        bw.close();
    }
}