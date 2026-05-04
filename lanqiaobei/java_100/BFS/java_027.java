package java_100.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
//BFS算法：在一个n行m列的网格中，0表示空地，1表示障碍物。请编写一个Java程序，
// 使用BFS算法计算从左上角(0,0)到右下角(n-1,m-1)的最短路径长度。如果无法到达目标位置，则输出-1。
/**
 * 使用BFS算法解决迷宫最短路径问题
 * 从起点(0,0)到终点(n-1,m-1)的最短步数
 */
public class java_027 {
    static int n, m;  // 迷宫的行数和列数
    static int[][] g; // 迷宫地图，0表示可走，1表示障碍
    static int[][] dist; // 记录从起点到各点的最短距离
    // 定义四个方向：上、下、左、右
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    /**
     * 内部类Node，表示迷宫中的一个点
     */
    static class Node {
        int x, y;  // 点的坐标
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * 使用BFS算法计算从起点到终点的最短路径
     * @return 终点到起点的最短步数，如果无法到达则返回-1
     */
    static int bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 0));  // 将起点加入队列
        dist[0][0] = 0;  // 起点到自身的距离为0

        while (!q.isEmpty()) {
            Node cur = q.poll();  // 取出队列中的第一个节点

            // 遍历四个方向
            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];  // 计算新位置的x坐标
                int ny = cur.y + dy[i];  // 计算新位置的y坐标

                // 检查新位置是否有效：在迷宫范围内、不是障碍、未被访问过
                if (nx >= 0 && nx < n && ny >= 0 && ny < m
                        && g[nx][ny] == 0 && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[cur.x][cur.y] + 1;  // 更新最短距离
                    q.offer(new Node(nx, ny));  // 将新位置加入队列
                }
            }
        }

        return dist[n - 1][m - 1];  // 返回终点的最短距离
    }

    /**
     * 主函数，处理输入并输出结果
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());  // 读取迷宫行数
        m = Integer.parseInt(st.nextToken());  // 读取迷宫列数

        g = new int[n][m];  // 初始化迷宫地图
        dist = new int[n][m];  // 初始化距离数组

        // 读取迷宫数据
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);  // 初始化距离为-1（表示未访问）
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                g[i][j] = Integer.parseInt(st.nextToken());  // 读取迷宫格子
            }
        }

        System.out.println(bfs());  // 输出最短路径长度
    }
    // static int n,m;
    // static int[][] g;//迷宫地图
    // static int[][] dist;//记录从起点到各点的最短距离
    // static int[] dx={-1,1,0,0,};
    // static int[] dy={0,0,-1,1};
    
    // static class Node{
    //     int x,y;
    //     Node(int x,int y){
    //         this.x=x;
    //         this.y=y;
    //     }
    // }
    // static int bfs(){
    //     Queue<Node> q=new LinkedList<>();
    //     q.offer(new Node(0,0));
    //     dist[0][0] =0;
    //     while(!q.isEmpty()){
    //         Node cur = q.poll();
    //         for(int i=0;i<4;i++){
    //             int nx =cur.x+dx[i];
    //             int ny =cur.y+dy[i];
    //             if(nx>=0&&nx<=n&&ny>=0&&ny<=m&&g[nx][ny]==0&&dist[nx][ny]==-1){
    //                 dist[nx][ny]=dist[cur.x][cur.y]+1;
    //                 q.offer(new Node(nx, ny));
    //             }
    //         }
    //     }
    //     return dist[n - 1][m - 1];
    // }
    // public static void main(String[] atgs) throws Exception{
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     StringTokenizer st = new StringTokenizer(br.readLine());
    //     n = Integer.parseInt(st.nextToken());
    //     m = Integer.parseInt(st.nextToken());
    //     g = new int[n][m];
    //     dist = new int[n][m];
    //     for(int i=0;i<n;i++){
    //         Arrays.fill(dist[i],-1);
    //         st = new StringTokenizer(br.readLine());
    //         for(int j=0;j<m;j++){
    //             g[i][j]=Integer.parseInt(st.nextToken());
    //         }
    //     }
    //     System.out.println(bfs());
    // }
}
