package java_100.前缀和;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 编写一个Java程序，要求用户输入一个整数N和一个整数M，然后输入一个N行M列的矩阵，接着输入Q行，每行包含四个整数x1、y1、x2、y2，
// 表示查询矩阵中以(x1, y1)为左上角，以(x2, y2)为右下角的子矩阵内所有元素之和。程序需要计算并输出每个查询的结果。
public class java_021 {
    /**
     * 使用二维前缀和算法解决矩阵子矩阵和查询问题
     * 该程序可以高效地处理多个子矩阵和查询
     * 通过预处理构建二维前缀和矩阵，使得每个查询可以在O(1)时间内完成
     */
    public static void main(String[] args) throws Exception {
        // 创建BufferedReader对象用于高效读取输入
        BufferedReader br  =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 读取矩阵的行数N和列数M
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken()); // 读取查询次数Q
        // 读取矩阵元素并构建二维前缀和矩阵
        int [][]matrix =new int[N+1][M+1];
        for(int i =1;i<=N ;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =1;j<=M ;j++){
                matrix[i][j] = Integer.parseInt(st.nextToken()) + matrix[i-1][j] + matrix[i][j-1] - matrix[i-1][j-1];
            }
        }
        StringBuilder sb = new StringBuilder();
        
        // 处理每个查询
        for(int i = 0; i < Q; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 计算子矩阵和并输出结果
            long sum = matrix[x2][y2] - matrix[x1-1][y2] - matrix[x2][y1-1] + matrix[x1-1][y1-1];
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
// 该程序通过构建二维前缀和矩阵，可以在O(1)时间内计算任意子矩阵的和，从而高效地处理多个查询。
// BufferReader,InputStreamReader,StringTokenizer等类的使用提高了输入输出效率，适合处理大规模数据。