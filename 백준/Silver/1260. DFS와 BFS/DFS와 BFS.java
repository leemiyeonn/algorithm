import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        A = new ArrayList[node + 1];

        for (int i = 1; i < node + 1; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            A[n1].add(n2);
            A[n2].add(n1);
        }

        for (int i = 1; i < node + 1; i++) {
            Collections.sort(A[i]);
        }

        StringBuilder sb1 = new StringBuilder();
        visited = new boolean[node + 1];
        bw.write(DFS(start, sb1));
        bw.newLine();

        StringBuilder sb2 = new StringBuilder();
        visited = new boolean[node + 1];
        bw.write(BFS(start, sb2));

        bw.close();
        br.close();
    }

    private static String DFS (int node, StringBuilder sb) {
        sb.append(node);
        sb.append(" ");
        visited[node] = true;

        for (int i : A[node]) {
            if (!visited[i]) {
                DFS(i, sb);
            }
        }

        return sb.toString();
    }

    private static String BFS (int node, StringBuilder sb) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;

        while (!queue.isEmpty()) {
            int nowNode = queue.poll();
            sb.append(nowNode);
            sb.append(" ");

            for (int i : A[nowNode]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }

        return sb.toString();
    }
}