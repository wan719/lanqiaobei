package java_100.简单基础题;
import java.util.Scanner;

public class java_017 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();//将输入的字符串转换为小写字母，方便后续处理
        System.out.println(input);
        scan.close();
    }
}
