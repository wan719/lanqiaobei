package java_100.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class java_031 {
    static int n, m; // 迷宫的行数和列数
    static int[][] g;
    static int[][] dist;
    static int[] dx = { -1, 1, 0, 0, };
    static int[] dy = { 0, 0, -1, 1 };

    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int bfs(){
        if (g[0][0] == 1 || g[n - 1][m - 1] == 1) return -1;// 如果起点或终点是障碍物，直接返回-1更严谨
        Queue<Node> q =new LinkedList<>();
        Node start = new Node(0, 0);
        q.offer(start);
        dist[0][0] = 0;
        while (!q.isEmpty()){
            Node cur =q.poll();
            for(int i=0;i<4;i++){
                int nx=cur.x+dx[i];
                int ny=cur.y+dy[i];
                if(nx>=0&&nx<n&&ny>=0&&ny<m&&g[nx][ny]==0&&dist[nx][ny]==-1){
                    dist[nx][ny] =dist[cur.x][cur.y]+1;
                    q.offer(new Node(nx,ny));
                }
            }
            
        }
        return dist[n-1][m-1];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        g = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j] = -1;
            }
        }
        System.out.println(bfs());
    }
}
