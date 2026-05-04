package java_100.简单基础题;
import java.util.Scanner;
// 编写一个Java程序，将用户输入的十进制数转换为二进制数。
public class java_015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int decimal = scan.nextInt();
        StringBuilder binary = new StringBuilder();
        if(decimal ==0){
            System.out.print("二进制数是：0");
            scan.close();
            return;
        }
        int temp = decimal;
        while(temp != 0){
            binary.insert(0,temp%2);
            temp /= 2;
        }
        System.out.print("十进制数"+decimal+"的二进制数是："+binary.toString());
        scan.close();

    }
}
//使用StringBuilder来构建二进制字符串，避免了字符串拼接带来的性能问题，好用！
//另外还要添加一个函数decimalToBinary(int decimal)，将十进制数转换为二进制数，增强代码的可读性和复用性。
