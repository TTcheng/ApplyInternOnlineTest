package com.onlinetest.webank;
/**
 * 输入1< a,b,c < 10^9
 * 计算2^a+2^b-2^c的值得二进制形式中1的个数
 * 如输入 3,2,1
 * 输出 2         因为2^a+2^b-2^c = 10 = (1010)
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int res = 1;
        if (a!=b){
            res+=1;
            if (a==c||b==c){
                res--;
            }
        }else {     //a==b
            if (a+1==c){
                res--;
            }else{
                res++;
            }
        }
        System.out.println(res);
    }
}

