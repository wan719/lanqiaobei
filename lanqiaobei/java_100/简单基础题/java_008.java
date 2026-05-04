package java_100.简单基础题;
import java.util.Scanner;
// 判断成绩等级，90分以上为A，60分以上为B，其他为C
//使用正则表达式来判断成绩等级
/**
 * 这是一个成绩等级评定程序
 * 通过用户输入的成绩，自动评定相应的等级
 * 使用三元运算符进行等级判定
 */
public class java_008 {
    public static void main(String[] args){
     // 创建Scanner对象用于接收用户输入
     Scanner scanner = new Scanner(System.in);
     // 提示用户输入成绩
     System.out.println("请输入你的成绩：");
     // 读取用户输入的成绩
     double score = scanner.nextDouble();
     // 使用三元运算符判断成绩等级：90分及以上为A，60分及以上为B，60分以下为C
     String grade = score >= 90?"A":score >= 60?"B":"C";
     // 输出成绩和对应的等级
     System.out.println("你的成绩是"+score+",等级是"+grade);
     // 关闭Scanner对象，释放资源
     scanner.close();
    }
}
//通过使用三元运算符，我们可以简洁地判断成绩等级。首先检查成绩是否大于等于90，如果是，则等级为A；如果不是，再检查成绩是否大于等于60，如果是，则等级为B；否则，等级为C。这种方式使得代码更加简洁和易读。