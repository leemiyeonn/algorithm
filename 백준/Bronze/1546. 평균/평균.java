import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int subjectCount = Integer.parseInt(st.nextToken());

        List<Integer> scoreList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            scoreList.add(Integer.parseInt(st.nextToken()));
        }

        int maxScore = Collections.max(scoreList);
        List<Double> calculatedList = scoreList.stream().map(s -> (double)s / maxScore * 100).collect(Collectors.toList());

        double average = calculatedList.stream().mapToDouble(value -> value).average().orElse(0.0);

        bw.write(String.valueOf(average));
        bw.close();
    }
}