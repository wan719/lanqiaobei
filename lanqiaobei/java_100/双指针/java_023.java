package java_100.双指针;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 编写一个Java程序，要求用户输入一个整数N、一个整数S和一个整数数组，然后计算并输出数组中长度最短的子数组的长度，
// 使得该子数组的和大于等于S。如果不存在这样的子数组，则输出0。
public class java_023 {
/**
 * 使用滑动窗口算法解决最小子数组长度问题
 * 给定一个数组和一个目标和s，找出数组中连续子数组，使得子数组的和至少为s，并返回最短子数组的长度
 */
    /**
     * 主方法：用于查找数组中和不小于给定值的最短连续子数组长度
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
    // 使用BufferedReader读取输入数据，提高读取效率
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 使用StringTokenizer分割输入字符串，方便获取各个数值
        StringTokenizer st = new StringTokenizer(br.readLine());

    // 读取数组长度n和目标和s
        int n = Integer.parseInt(st.nextToken());  // 数组元素个数
        int s = Integer.parseInt(st.nextToken());  // 目标和

    // 创建数组a存储输入数据
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());  // 重新读取下一行数据
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());  // 将每个元素存入数组
        }

    // 初始化答案为最大整数值，用于后续比较最小值
        int ans = Integer.MAX_VALUE;
    // 初始化子数组和为0
        int sum = 0;

    // 使用滑动窗口算法寻找最短子数组
        for (int i = 0, j = 0; i < n; i++) {
            sum += a[i];  // 扩大窗口右侧

            // 当子数组和大于等于目标时，尝试缩小窗口
            while (sum >= s) {
                ans = Math.min(ans, i - j + 1);  // 更新最短长度
                sum -= a[j];  // 缩小窗口左侧
                j++;  // 左指针右移
            }
        }

    // 输出结果：如果没有找到满足条件的子数组则输出0，否则输出最短长度
        System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
    }
}
