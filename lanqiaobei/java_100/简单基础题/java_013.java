package java_100.简单基础题;

import java.util.Scanner;
// 编写一个Java程序，输入一个不多于五位的整数，判断它是几位数，并逆序输出。
public class java_013 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个不多于五位的整数：");
        String input = scan.nextLine();
        if (input.length() > 5) {
            System.out.println("输入的数字位数过多！");
        } else {
            System.out.println("输入的数字是" + input.length() + "位数");
            System.out.print("逆序输出的结果是：");
            printDigits(input);
        }
        scan.close();
    }

    private static void printDigits(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
