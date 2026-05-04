package java_100.简单基础题;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class java_001 {
    /**
     * 主方法，用于生成所有可能的三位数组合
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Scanner scan =new  Scanner (System.in); // 创建Scanner对象用于接收用户输入
        int[] digits={1,2,3,4}; // 定义数字数组，包含1-4四个数字
        List<Integer> list=new ArrayList<>(); // 创建ArrayList用于存储生成的三位数
        // 遍历百位数字
        for(int a:digits){//百位
            // 遍历十位数字
            for(int b:digits){//十位
                // 确保十位与百位数字不相同
                if(b==a){
                    continue;
                }
                // 遍历个位数字
                for(int c:digits){//个位
                    // 确保个位与百位、十位数字都不相同
                    if(c==a||c==b){
                        continue;
                    }
                    // 将生成的三位数添加到列表中
                    list.add(a*100+b*10+c);
                }
            }
        }
        // 输出结果信息
        System.out.println("总共有"+list.size()+"个不同的三位数");
        System.out.println(list); // 输出所有生成的三位数
        scan.close(); // 关闭Scanner对象
}
}
