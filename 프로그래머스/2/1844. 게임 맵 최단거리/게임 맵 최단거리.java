import java.util.*;

class Solution {
    
    private int[][] arr;
    private int[][] distance;
    private int[] dx = {1, 0, -1, 0};
    private int[] dy = {0, 1, 0, -1};
    
    private int n;
    private int m;
    
    public int solution(int[][] maps) {
        
        n = maps.length;
        m = maps[0].length;
        
        arr = maps;
        distance = new int[n][m];
        
        bfs(0, 0);
        
        return distance[n - 1][m - 1] == 0 ? -1 : distance[n - 1][m - 1] + 1;
    }
    
    private void bfs (int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i, j});
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
                        
            for (int k = 0; k < 4; k++) {
                int x = current[0] + dx[k];
                int y = current[1] + dy[k];
                
                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (arr[x][y] != 0 && distance[x][y] == 0){
                        distance[x][y] = distance[current[0]][current[1]] + 1;
                        
                        q.offer(new int[] {x, y});
                    }
                }
            }
        }
    }
}