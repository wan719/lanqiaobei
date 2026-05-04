package java_100.简单基础题;

import java.util.Scanner;
//输入一个五位数字，判断它是不是回文数。
public class java_007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入五位数字：");
        String input = scanner.nextLine();
        if (isFiveDigitPalindrome(input)) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
        scanner.close();
    }

    /**
     * 判断一个字符串是否是五位回文数
     * @param str 需要判断的字符串
     * @return 如果是五位回文数返回true，否则返回false
     */
    private static boolean isFiveDigitPalindrome(String str) {
        // 使用正则表达式验证输入是否为1-9开头后跟4位数字的五位数
        if (!str.matches("[1-9]\\d{4}")) {
            return false;
        }
        // 判断第一位是否等于第五位，且第二位是否等于第四位
        return str.charAt(0) == str.charAt(4) && str.charAt(1) == str.charAt(3);
    }
}
//了解到了正则表达式，以及如何使用正则表达式来验证输入是否为五位数字，并且判断是否为回文数。