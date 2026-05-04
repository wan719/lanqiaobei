package java_100.双指针;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 编写一个Java程序，要求用户输入一个整数N和一个整数数组，
// 然后计算并输出数组中最长的无重复元素的子数组的长度。
public class java_022 {
    /**
     * 主方法，用于读取输入并计算不重复子数组的长度
     * 
     * @param args 命令行参数
     * @throws Exception 可能抛出的异常
     */
    public static void main(String[] args) throws Exception {
        // 使用BufferedReader读取输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 读取整数n，表示数组的大小
        int n = Integer.parseInt(br.readLine());

        // 创建大小为n的整型数组
        int[] a = new int[n];
        // 使用StringTokenizer读取一行输入并分割
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 将输入的数字存入数组
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 创建HashMap用于记录每个数字出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();// 记录每个数字出现的次数
        // 初始化答案变量
        int ans = 0;

        // 使用滑动窗口算法计算最长不重复子数组
        for (int i = 0, j = 0; i < n; i++) {
            // 将当前数字加入map，并增加其计数
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

            // 如果当前数字出现次数超过1，则移动左指针j
            while (map.get(a[i]) > 1) {
                // 减少左指针指向数字的计数
                map.put(a[j], map.get(a[j]) - 1);
                // 左指针右移
                j++;
            }

            // 更新最大长度
            ans = Math.max(ans, i - j + 1);
        }

        System.out.println(ans);
        // BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        // int n =Integer.parseInt(br.readLine());
        // int[] a=new int[n];
        // StringTokenizer st=new StringTokenizer(br.readLine());
        // for(int i=0;i<n;i++){
        //     a[i]=Integer.parseInt(st.nextToken());
        // }
        // HashMap<Integer, Integer> map=new HashMap<>();
        // int ans=0;
        // for(int i=0,j=0;i<n;i++){
        //     map.put(a[i],map.getOrDefault(a[i],0)+1);
        //     while(map.get(a[i])>1){
        //         map.put(a[j],map.get(a[j])-1);
        //         j++;
        //     }
        //     ans = Math.max(ans, i - j + 1);
        // }
        // System.out.println(ans);
    }
}
