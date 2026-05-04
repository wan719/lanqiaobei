package java_100.简单基础题;

public class java_011 {
    public static void main(String[] args){
        System.out.println("5的阶乘是："+factorial(5));
    }
    private static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
//递归函数，直接调用自己来解决问题，代码简洁易懂。
//当n为0时，阶乘的结果为1，这是递归的基准条件。
//当n不为0时，阶乘的结果为n乘以n-1的阶乘。