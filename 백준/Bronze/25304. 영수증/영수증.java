import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int nItem = sc.nextInt();
        
        int result = 0;
        
        for (int i = 0; i < nItem; i++ ) {
            int price = sc.nextInt();
            int count = sc.nextInt();
            result = result + (price * count);
        }

        if (total == result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}