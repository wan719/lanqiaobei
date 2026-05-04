package java_100.简单基础题;
import java.util.Scanner;
// 编写一个Java程序，判断用户输入的年份是否为闰年。
public class java_010 {
    public static void main(String[] args)
    {
        try{
            Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year =scan.nextInt();
        if(isLeapYear(year)){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是闰年");
        }
        scan.close();
        }catch(Exception e){
            System.out.println("输入错误，请输入一个有效的数字！");
        }
    }
    private static boolean isLeapYear(int year){
        return (year%4==0&&year%100!=0||year%400==0);
    }
}
//boolean好用，直接返回条件表达式的结果，代码简洁明了。
