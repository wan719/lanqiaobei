package java_100.二分;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 编写一个Java程序，要求用户输入一个整数N、一个整数X和一个升序排列的整数数组，
// 然后使用二分查找算法在数组中查找整数X，并输出其索引位置。如果X不存在于数组中，则输出-1。                
public class java_024 {
    /**
     * 主方法，实现二分查找算法
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
        // 使用BufferedReader读取用户输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 使用StringTokenizer分割输入字符串
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 读取数组的大小n和目标值x
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        // 创建大小为n的整型数组
        int[] a = new int[n];
        // 读取数组元素
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 初始化二分查找的左右边界
        int l = 0, r = n - 1;
        // 初始化答案为-1，表示未找到
        int ans = -1;

        // 执行二分查找
        while (l <= r) {
            // 计算中间位置，防止溢出
            int mid = l + (r - l) / 2;

            // 如果中间元素等于目标值
            if (a[mid] == x) {
                ans = mid;  // 记录答案
                break;      // 结束循环
            } else if (a[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(ans);
    }
}
