package java_100.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 编写一个Java程序，要求用户输入两个整数N和M，表示物品的数量和背包的容量。接着输入N行，每行包含两个整数W和V，分别表示物品的重量和价值。
// 请编写一个程序计算在不超过背包容量M的前提下，能够获得的最大价值。
/**
 * 这是一个典型的0-1背包问题的Java实现
 * 通过动态规划算法解决在给定容量限制下选择物品以获得最大价值的问题
 */
public class java_029 {
    public static void main(String[] args) throws Exception {
        // 使用BufferedReader读取输入，提高读取效率
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 使用StringTokenizer分割输入的字符串
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 读取物品数量n和背包容量m
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 创建动态规划数组，dp[j]表示容量为j时的最大价值
        int[] dp = new int[m + 1];

        // 遍历每个物品
        for (int i = 0; i < n; i++) {
            // 读取当前物品的重量w和价值v
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            // 使用逆序遍历更新dp数组，确保每个物品只被选择一次
            for (int j = m; j >= w; j--) {
                // 比较不选当前物品和选择当前物品的价值，取较大值
                dp[j] = Math.max(dp[j], dp[j - w] + v);
            }
        }

        // 输出背包容量为m时的最大价值
        System.out.println(dp[m]);
    }
}
