package com.onlinetest.Tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Wangchuncheng on 2018/4/8
 */
//以下代码测试通过
public class 纸牌游戏 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        long niuniu = 0;//BigInteger.ZERO;
        long yangyang=0;//BigInteger.ZERO;
        for (int i = n-1; i > 0; i-=2) {
            niuniu+=arr[i];
            yangyang+=arr[i-1];
        }
        if (n%2==1){
            niuniu+=arr[0];
        }
        System.out.println(niuniu-yangyang);
    }
}
//public class 纸牌游戏 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        long arr[] = new long[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = in.nextInt();
//        }
//        Arrays.sort(arr);
//        BigInteger niuniu = BigInteger.ZERO;
//        BigInteger yangyang=BigInteger.ZERO;
//        for (int i = n-1; i > 0; i-=2) {
//            niuniu.add(BigInteger.valueOf(arr[i]));
//            yangyang.add(BigInteger.valueOf(arr[i-1]));
//        }
//        if (n%2==1){
//            niuniu.add(BigInteger.valueOf(arr[0]));
//        }
//        System.out.println(niuniu.subtract(yangyang).intValue());
//    }
//}
