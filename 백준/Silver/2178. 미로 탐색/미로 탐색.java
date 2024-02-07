import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    private static int n;
    private static int m;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        bfs(0,0);

        bw.write(String.valueOf(arr[n - 1][m - 1]));

        bw.close();
        br.close();
    }

    private static void bfs (int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        // queue 에 현재 위치 (x, y)를 추가함
        q.offer(new int[] {i, j});

        // queue 가 비어 있지 않다면
        while(!q.isEmpty()) {
            // 현재 위치는 queue 에 저장 되어 있던 위치
            int[] current = q.poll();
            // 방문 했다고 표시
            visited[current[0]][current[1]] = true;

            // 현재 위치 에서 상하 좌우로 탐색
            for (int k = 0; k < 4; k++) {
                int x = current[0] + dx[k];
                int y = current[1] + dy[k];

                // 움직일 값이 범위 내에 있고
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    // 조건에 맞는 다면
                    if (!visited[x][y] && arr[x][y] != 0) {
                        // 그 위치로 이동
                        visited[x][y] = true;
                        // 이동한 위치의 값은 직전 위치의 값에 + 1
                        arr[x][y] = arr[current[0]][current[1]] + 1;

                        // queue 에 이동한 위치를 넣어줌
                        q.offer(new int[] {x, y});
                    }
                }
            }
        }
    }
}