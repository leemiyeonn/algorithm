import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        if (h == 0) {
            h = 24;
        }

        int inputMinute = h * 60 + m;
        int alarm = inputMinute - 45;

        int alarmHour = (alarm) / 60;
        int alarmMinute = (alarm) % 60;
        
        if (alarmHour == 24) {
            alarmHour = 0;
        }

        System.out.print(alarmHour + " ");
        System.out.print(alarmMinute);
    }
}