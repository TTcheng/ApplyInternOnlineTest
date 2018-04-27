package com.onlinetest.webank;
/**
 * 定义幸运数N为一个素数p的k次幂，即N=p^k  (k>1)
 * 输入一行一个数1<=N<=1000
 * 给出小于等于N的幸运数个数
 * 样例输入1
 * 样例输出0
 * 样例输入10
 * 样例输出3
 */

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};//100^2>1000
        int res = 0;
        for (int i = 0; i < primes.length; i++) {
            for (int j = 2; j < 10; j++) {  //2^10 > maxn=1000
                if (Math.pow(primes[i], j) <= n) {
                    res++;
                } else break;
            }
        }
        System.out.println(res);
    }
}
