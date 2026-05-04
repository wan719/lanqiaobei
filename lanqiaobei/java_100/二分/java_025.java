package java_100.二分;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//边界二分查找：在一个升序排列的整数数组中，找到第一个大于等于目标值X的元素的索引位置。如果不存在这样的元素，则输出数组长度N。
public class java_025 {
    /**
     * 主方法，实现二分查找算法
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
        // 使用BufferedReader读取用户输入，提供高效的读取方式
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 使用StringTokenizer分割输入字符串，便于处理多个输入值
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 读取数组的大小n和目标值x
        int n = Integer.parseInt(st.nextToken());  // 数组元素个数
        int x = Integer.parseInt(st.nextToken());  // 需要查找的目标值

        // 创建大小为n的整型数组
        int[] a = new int[n];
        // 读取数组元素，将输入的数值存入数组
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 初始化二分查找的左右边界
        int l = 0, r = n - 1;
  // l为左边界，r为右边界
        while (l < r) {
            int mid = l + (r - l) / 2;

            if (a[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        // l 就是答案
        System.out.println(l);
    }
}
