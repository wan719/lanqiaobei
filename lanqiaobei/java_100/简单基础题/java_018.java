package java_100.简单基础题;

import java.util.Arrays;
import java.util.Scanner;
// 编写一个Java程序，要求用户输入一个整数N，然后输入N个整数，将这些整数存储在一个数组中，并按照升序和降序分别输出这些整数。
public class java_018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数N：");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        System.out.println("请输入" + num + "个整数：");
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = num - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
//Arrays.sort 排序，然后正着输出 + 倒着输出实现升序和降序输出。
