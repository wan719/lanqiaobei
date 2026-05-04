package java_100.简单基础题;

import java.util.Scanner;

// 编写一个Java程序，实现简单的计算器功能，能够进行加、减、乘、除四则运算。
public class java_014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        double num1 = scan.nextDouble();
        System.out.println("请输入运算符号（+、-、*、/）:");
        char operator = scan.next().charAt(0);
        System.out.println("请输入第二个数:");
        double num2 = scan.nextDouble();
        double result = 0;
        boolean validOperator = true;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("除数不能为零！");
                    validOperator = false;
                    break;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("输入的运算符有误！");
                break;
        }
        if (validOperator) {
            System.out.println("计算结果为：" + result);
        }
        scan.close();
    }
}
// 复习了switch语句的使用，能够根据用户输入的运算符执行不同的计算操作。
// 在除法运算中添加了对除数为零的检查，避免了除数为零的异常。
// 和对于各种错误的处理，确保程序的健壮性和用户体验。