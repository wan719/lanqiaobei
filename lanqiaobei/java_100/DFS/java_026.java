package java_100.DFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 编写一个Java程序，要求用户输入一个整数N，然后输出从1到N的所有排列组合。
// DFS（深度优先搜索）算法可以用来生成所有的排列组合。
/**
 * 该程序实现了数字1到n的全排列输出
 * 使用深度优先搜索(DFS)和回溯算法来生成所有可能的排列
 */
public class java_026 {

    // 定义全局变量
    static int n;                    // 排列的数字个数
    static int[] path;               // 存储当前的排列路径
    static boolean[] used;           // 标记数字是否已经被使用
    static StringBuilder sb = new StringBuilder();  // 用于构建输出结果

    /**
     * 深度优先搜索函数，用于生成全排列
     * @param u 当前正在填的位置索引
     */
    static void dfs(int u) {
        // 已经填完所有位置
        if (u == n) {
            // 将当前排列添加到结果中
            for (int i = 0; i < n; i++) {
                sb.append(path[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 枚举当前位置放哪个数
        for (int i = 1; i <= n; i++) {
            // 如果数字i还没有被使用
            if (!used[i]) {
                used[i] = true;      // 标记数字i已被使用
                path[u] = i;         // 将数字i放入当前位置

                dfs(u + 1);          // 递归处理下一个位置

                used[i] = false; // 回溯，取消标记，以便其他分支可以使用该数字
            }
        }
    }
    /**
     * 主函数，处理输入输出
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());  // 读取排列的数字个数

        path = new int[n];          // 初始化排列路径数组
        used = new boolean[n + 1];  // 初始化使用标记数组（索引0不使用）

        dfs(0);  // 从第0个位置开始生成排列

        System.out.print(sb);  // 输出所有排列结果
    }
    // // 定义全局变量
    // static int n;                    // 排列的数字个数
    // static int[] path;               // 存储当前的排列路径
    // static boolean[] used;           // 标记数字是否已经被使用
    // static StringBuilder sb =new StringBuilder();  // 用于构建输出结果

    // static void dfs(int u){
    //     if(u==n){
    //         for(int i=0;i<n;i++){
    //             sb.append(path[i]).append(" ");
    //         }
    //         sb.append("\n");
    //     }
    //     for(int i=1;i<=n;i++){
    //         if(!used[i]){
    //             used[i]=true;
    //             path[u]=i;
    //             dfs(u+1);
    //             used[i]=false;
    //         }

    //     }
    // }
    // public static void main(String[] args) throws Exception{
    //     BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    //     n =Integer.parseInt(br.readLine());
    //     path =new int[n];
    //     used =new boolean[n + 1];
    //     dfs(0);
    //     System.out.print(sb);

    // }
}
