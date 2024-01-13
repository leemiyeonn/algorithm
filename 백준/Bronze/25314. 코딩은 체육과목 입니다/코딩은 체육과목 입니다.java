import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        StringBuilder str = new StringBuilder("int");

        for (int i = 0; i < n / 4; i++) {
            str.insert(0, "long ");
        }

        System.out.println(str);
    }
}