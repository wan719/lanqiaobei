package java_100.简单基础题;

import java.util.List;
import java.util.ArrayList;
// 题目：打印出2000-3000之间所有的7的倍数，但不能是5的倍数。判断数字
public class java_002 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2000; i <= 3200; i++) {
            if (i % 7 == 0 && i % 5 != 0) {
                list.add(i);
            }
        }
        System.out.println("共有"+list.size()+"个满足条件的数字");
        System.out.println(list);
    }
}
