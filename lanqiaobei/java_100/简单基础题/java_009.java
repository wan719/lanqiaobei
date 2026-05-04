package java_100.简单基础题;
import java.util.Scanner;
// 编写一个Java程序，实现华氏温度和摄氏温度的转换。
public class java_009 {
    /**
     * 主方法，用于将用户输入的华氏温度转换为摄氏温度
     * @param args 命令行参数，本程序中未使用
     */
    public static void main(String[] args) {
        try{
            // 创建Scanner对象用于读取用户输入
            Scanner scan = new Scanner(System.in);
            // 提示用户输入华氏温度
       System.out.print("请输入华氏温度：");
            // 读取用户输入的华氏温度值
       double fahrenheit = scan.nextDouble();
            // 将华氏温度转换为摄氏温度的公式：(华氏温度 - 32) × 5/9
       double celsius = (fahrenheit - 32) * 5 / 9;
            // 将计算结果格式化为保留两位小数
       double celsius_2=Double.parseDouble(String.format("%.2f", celsius)); // 保留两位小数
            // 输出转换后的摄氏温度
       System.out.println("对应的摄氏温度是：" + celsius_2);
            // 关闭Scanner对象，释放资源
       scan.close();
        }catch(Exception e){
            // 捕获输入异常，提示用户输入有效数字
            System.out.println("输入错误，请输入一个有效的数字！");
        }
    }
}
//学会了try-catch语句来处理用户输入可能出现的异常情况，确保程序的健壮性。
// 当用户输入非数字时，程序会捕获异常并提示用户输入有效数字，而不会崩溃。
// 通过使用String.format("%.2f", celsius)来格式化输出的摄氏温度，确保结果保留两位小数，使输出更美观和易读。