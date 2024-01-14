import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int studentCount = 30;
        int absentStudentCount = 2;

        List<Integer> studentList = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            studentList.add(i + 1);
        }

        List<Integer> submittedStudentList = new ArrayList<>();

        for (int i = 0; i < studentCount - absentStudentCount; i++) {
            String student = br.readLine();
            submittedStudentList.add(Integer.parseInt(student));
        }

        List<Integer> absentStudentList = studentList.stream()
                .filter(student -> !submittedStudentList.contains(student))
                .sorted()
                .collect(Collectors.toList());

        for (int s : absentStudentList) {
            bw.write(String.valueOf(s));
            bw.newLine();
        }

        bw.close();
    }
}