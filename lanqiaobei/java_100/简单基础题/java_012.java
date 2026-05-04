package java_100.简单基础题;
//求第5个人的年龄，已知第1个人的年龄是10岁，每个人的年龄比前一个人大2岁。
public class java_012 {
    public static void main(String[] args){
        System.out.println("第5个人的年龄是："+age(5));
    }
    private static int age(int n)
    {
        if(n==1){
            return 10;
        }
        return age(n-1)+2;
    }
}
