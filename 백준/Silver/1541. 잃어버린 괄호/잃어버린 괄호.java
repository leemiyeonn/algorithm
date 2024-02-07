import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String[] splitInput = input.split("-");
        int sum = 0;

        for (int i = 0; i < splitInput.length; i++) {

            if (i == 0) {
                sum += plusSum(splitInput[0]);
            } else {
                sum -= plusSum(splitInput[i]);
            }
        }


        bw.write(String.valueOf(sum));

        bw.close();
        br.close();
    }
    
    private static int plusSum (String s) {
        int sum = 0;
        String[] plusArr = s.split("[+]");
        
        for (int i = 0; i < plusArr.length; i++) {
            sum += Integer.parseInt(plusArr[i]);
        }
        
        return sum;
    }
}