package com.onlinetest.Mi;
/**
 * Created by Wangchuncheng on 2018/4/10
 * 爬一个n阶的楼梯，每次只能上一阶或者两阶，请问一共有多少种不同的走法。
 * 输入一个n<=50,输出不同的走法数
 */
//通过
import java.util.Scanner;

public class 爬楼梯 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[55];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}
