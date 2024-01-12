import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        sc.close();

        if (n1 == n3 && n2 == n3) {
            System.out.println((10_000 + n1 * 1_000));
        } else if (n1 == n2) {
            System.out.println(1_000 + n1 * 100);
        } else if (n2 == n3) {
            System.out.println(1_000 + n2 * 100);
        } else if (n1 == n3) {
            System.out.println(1_000 + n1 * 100);
        } else {
            int maxNum = (Math.max(n1, (Math.max(n2, n3))));
            System.out.println(maxNum * 100);
        }
    }
}