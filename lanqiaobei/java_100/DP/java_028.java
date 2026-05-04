package java_100.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
// 编写一个Java程序，要求用户输入一个整数N，表示台阶的总数。每次可以爬1阶或2阶，
// 请编写一个程序计算爬到第N阶的方法总数。
/**
 * 本程序是一个斐波那契数列的实现，通过动态规划的方式计算第n个斐波那契数
 * 使用了数组来存储中间结果，避免重复计算，提高效率
 */
public class java_028 {
    public static void main(String[] args) throws Exception {
        // 使用BufferedReader读取用户输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 将输入的字符串转换为整数n，表示要计算的斐波那契数的位置
        int n = Integer.parseInt(br.readLine());

        // 创建一个长度为n+2的long类型数组，用于存储斐波那契数列的值
        long[] dp = new long[n + 2];

        // 初始化数列的前两个值
        dp[1] = 1;  // 斐波那契数列的第1个值为1
        dp[2] = 2;  // 斐波那契数列的第2个值为2

        // 使用循环从第3个位置开始计算，直到第n个位置
        // 每个位置的值等于前两个位置值的和
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // 输出第n个斐波那契数的值
        System.out.println(dp[n]);
    }
}
