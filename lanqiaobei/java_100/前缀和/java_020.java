package java_100.前缀和;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Scanner;
import java.util.StringTokenizer;
// 编写一个Java程序，要求用户输入一个整数N和一个整数Q，然后输入N个整数，接着输入Q行，每行包含两个整数L和R，表示查询区间的左右边界。
// 程序需要计算并输出每个查询区间内的整数之和。
public class java_020 {
    // 
    /**
     * 主方法，处理输入并计算区间和
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
        // 创建缓冲读取器，用于读取标准输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 创建字符串分割器，用于分割输入行
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 读取整数n和q，n表示数组长度，q表示查询次数
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        // 创建前缀和数组，长度为n+1，s[0]=0
        long[] s = new long[n + 1];
        // 读取下一行输入并分割
        st = new StringTokenizer(br.readLine());

        // 计算前缀和数组
        for (int i = 1; i <= n; i++) {
            // s[i] = s[i-1] + 当前元素值
            s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 创建字符串构建器，用于高效构建输出结果
        StringBuilder sb = new StringBuilder();

        // 处理q次查询
        while (q-- > 0) {
            // 读取查询的左右边界
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            // 计算区间[l, r]的和并添加到结果中
            sb.append(s[r] - s[l - 1]).append("\n");
        }

        // 输出所有查询结果
        System.out.print(sb);
    }
}
