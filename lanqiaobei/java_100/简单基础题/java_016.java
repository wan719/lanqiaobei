package java_100.简单基础题;
import java.util.Arrays;
//编写一个Java程序，使用冒泡排序算法对一个整数数组进行排序。
public class java_016 {
    /**
     * 主方法，演示冒泡排序算法
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 初始化一个整型数组
        int[] arr={23,42,56,21,55,66,35,99,100,88};
        // 输出排序前的数组
        System.out.print("排序前的数组：");
        System.out.print(Arrays.toString(arr));

        
        // 使用冒泡排序算法对数组进行排序
        for(int i=0;i<arr.length-1;i++){            // 外层循环控制排序轮数
            for(int j=0;j<arr.length-1-i;j++){      // 内层循环进行相邻元素比较和交换
                if(arr[j]>arr[j+1]){                // 如果前一个元素大于后一个元素，则交换它们的位置
                    int temp=arr[j];                // 使用临时变量存储当前元素
                    arr[j]=arr[j+1];                // 将较大的元素向后移动
                    arr[j+1]=temp;                  // 将较小的元素向前移动
                }
            }
        }
        // 输出排序后的数组
        System.out.print("\n排序后的数组：");
        System.out.print(Arrays.toString(arr));
    }
}
//冒泡排序算法的核心思想是通过多次比较和交换，将较大的元素逐渐“冒泡”到数组的末尾。
//外层循环控制排序的轮数，内层循环进行相邻元素的比较和交换。
//当内层循环结束时，最大的元素已经被放置在正确的位置，因此内层循环的范围逐渐减少。