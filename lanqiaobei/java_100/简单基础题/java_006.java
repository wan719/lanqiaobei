package java_100.简单基础题;
import java.util.Scanner;
// 题目：输入一个五个字符的字符串，倒序输出。
/**
 * java_006类：实现字符串逆序输出
 * 通过递归方法将输入的字符串逆序打印
 */
public class java_006 {
    /**
     * 主方法，程序的入口点
     * @param args 命令行参数
     */
    public static void main(String[] args){
        // 创建Scanner对象用于接收用户输入
        Scanner scan = new Scanner(System.in);
        // 提示用户输入五个字符
        System.out.println("请输入五个字符：");
        // 读取用户输入的一行字符
        String chars= scan.nextLine();
        // 使用三元运算符确保字符串长度不超过5个字符
        // 如果输入长度大于等于5，则取前5个字符；否则使用整个输入字符串
        String data = chars.length()>=5?chars.substring(0,5):chars;
        // 将字符串转换为字符数组，并调用stringReverse方法进行反转
        // 从数组的第一个字符（索引0）开始反转
        stringReverse(data.toCharArray(),0);
        // 关闭Scanner对象，释放资源
        scan.close();
    }
    /**
     * 递归方法实现字符串反转
     * @param chars 字符数组，包含需要反转的字符
     * @param index 当前处理的字符索引位置
     */
    private static void stringReverse(char[] chars,int index){
        // 递归终止条件：当索引超出字符数组长度时返回
        if(index>=chars.length){
            return;
        }
        // 递归调用，处理下一个字符
        stringReverse(chars,index+1);
        // 打印当前字符，由于递归的特性，会实现反转效果
        System.out.print(chars[index]);
    }
}
//最高兴的是感觉自己理解了递归，它是运算到最里面也就是边界条件，然后再逐层返回的过程，感觉就像是一个函数调用栈一样，每次调用都会把当前的状态保存下来，等到最里面的调用完成后，
// 再逐层返回到之前的状态，这样就实现了逆序输出。跟循环不一样看本项目的System.out.print(chars[index]);
// 是在递归返回的过程中执行的，所以它会按照调用的顺序逆序输出字符。
// 总之，递归是一种非常强大的编程技巧，可以让我们用更简洁和优雅的方式解决问题。