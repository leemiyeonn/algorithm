import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();
        sc.close();

        int inputMinute = (hour * 60) + minute;
        int resultMinute = inputMinute + time;

        int finalHour = resultMinute / 60;
        int finalMinute = resultMinute % 60;

        if (finalHour == 24) {
            finalHour = 0;
        } else if (finalHour > 24) {
            finalHour = finalHour - 24;
        }

        System.out.println(finalHour + " " + finalMinute);
    }
}