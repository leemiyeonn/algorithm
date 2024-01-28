import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        int[] foundPrimes = findPrimes(start, end);

        if (foundPrimes.length != 0) {
            int sum = 0;
            int min = Integer.MAX_VALUE;

            for (int prime : foundPrimes) {
                sum += prime;
                min = Integer.min(prime, min);
            }

            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(min));

        } else {
            bw.write("-1");
        }

        bw.close();
        br.close();
    }

    private static int[] findPrimes(int start, int end) {
        boolean[] isPrime = new boolean[end + 1];

        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(end); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= end; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = start; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;

        for (int i = start; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes[index ++] = i;
            }
        }

        return primes;
    }
}