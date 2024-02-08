class Solution {
    public int solution(int n, int[][] computers) {
        int count = 0;
        boolean[] visited = new boolean[n];
        
        // 모든 노드 순회
        for (int i = 0; i < n; i++) {
            // 노드를 방문하지 않았으면
            if (!visited[i]) {
                // 새로운 네트워크 시작
                count++;
                // 다음 노드 탐색
                dfs(i, computers, visited);
            }
        }
        
        return count;
    }
    
    private void dfs(int node, int[][] computers, boolean[] visited) {
        // 현재 노드 방문처리
        visited[node] = true;

        // 다음 노드 탐색
        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[node][i] != 0) {
                // 방문하지 않았고, 다음노드와 연결되어 있는 노드 탐색
                dfs(i, computers, visited);
            }
        }
    }
}