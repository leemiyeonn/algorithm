import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalSum = 0;
        double sum = 0;

        for (int i = 0; i < 20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            double gradeCredit = 0;
            switch (grade) {
                case "A+" :
                    gradeCredit = 4.5;
                    break;
                case "A0" :
                    gradeCredit = 4.0;
                    break;
                case "B+" :
                    gradeCredit = 3.5;
                    break;
                case "B0" :
                    gradeCredit = 3.0;
                    break;
                case "C+" :
                    gradeCredit = 2.5;
                    break;
                case "C0" :
                    gradeCredit = 2.0;
                    break;
                case "D+" :
                    gradeCredit = 1.5;
                    break;
                case "D0" :
                    gradeCredit = 1.0;
                    break;
                case "F" :
                    gradeCredit = 0.0;
                    break;
                case "P" :
                    sum -= score;
                    totalSum -= score * gradeCredit;
                    break;
            }

            totalSum += score * gradeCredit;
            sum += score;
        }

        double avg = totalSum / sum;

        bw.write(String.format("%.6f", avg));
        bw.close();
    }
}