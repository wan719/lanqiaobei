package java_100.简单基础题;

import java.math.BigInteger;

// 题目：计算1!+2!+3!+...+20!的和。
public class java_005 {
    /* public static void main(String[] args) {
        long sum =0;

        for(int i=1;i<=20;i++){
            long temp=i;
            for(int j=i-1;j>=1;j--){
                temp*=j;
            }
            sum+=temp;
        }
        System.out.println("前20个自然数的阶乘和为：" + sum);
    } */
    /**
     * 主方法，计算前20个自然数的阶乘和
     * 使用BigInteger类处理大数运算，避免整数溢出
     * @param args 命令行参数，本程序未使用
     */
    /**
     * 主方法，计算前20个自然数的阶乘和
     * 使用BigInteger类处理大数运算，避免整数溢出
     * @param args 命令行参数，本程序未使用
     */
    public static void main(String[] args) {
        // 初始化sum为BigInteger.ZERO，用于存储阶乘和
        BigInteger sum = BigInteger.ZERO;
        // 初始化factorial为BigInteger.ONE，用于存储当前阶乘值
        BigInteger factorial = BigInteger.ONE;
        // 循环计算1到20的阶乘，并累加到sum中
        for (int i = 1; i <= 20; i++) {
            // 计算当前数的阶乘：factorial = factorial * i
            factorial = factorial.multiply(BigInteger.valueOf(i));//类型转换，将i转换为BigInteger类型进行乘法运算
            // 将当前阶乘值累加到总和中：sum = sum + factorial
            sum = sum.add(factorial);
        }
        
        // 输出前20个自然数的阶乘和
        System.out.println("前20个自然数的阶乘和为：" + sum);
    } 
}
