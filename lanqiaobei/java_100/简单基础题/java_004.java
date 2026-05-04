package java_100.简单基础题;
import java.util.Scanner;
// 题目：统计字符串中各种类型的字符个数。包括：英文字母、空格、数字和其他字符。
public class java_004 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("请输入一行字符串：");
        String str = scan.nextLine();
        int letterCount =0;
        int spaceCount =0;
        int digitCount =0;
        int otherCount =0;
        for(char c:str.toCharArray()){
            if (Character.isLetter(c)) {
                letterCount++;
            }else if(Character.isWhitespace(c)){
                spaceCount++;
            }else if(Character.isDigit(c)){
                digitCount++;
            }else{
                otherCount++;
            }
        }
        System.out.println("字母个数："+letterCount);
        System.out.println("空格个数："+spaceCount);
        System.out.println("数字个数："+digitCount);
        System.out.println("其他字符个数："+otherCount);
        scan.close();
    }
    
}