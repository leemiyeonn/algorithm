import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int line1 = n * (m % 10);
        int line2 = n * (m % 100 / 10);
        int line3 = n * (m / 100);
        int line4 = n * m;

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
    }
}