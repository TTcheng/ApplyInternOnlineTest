package com.onlinetest.Tencent;
/*
小Q的父母要出差n天，走之前留了M块巧克力，小Q决定每天吃的巧克力不少于之前的一半，但又不想有一天没有巧克力吃。
请问他第一天最多能吃多少块巧克力
 */
import java.util.Scanner;
/**
 * Created by Wangchuncheng on 2018/4/8
 * 以下代码测试未通过
 */
public class 贪吃的小Q {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),
                m = in.nextInt();
        if (m>=Math.pow(2,n)-1){
            System.out.println(m/2+1);
        }else {
            for (int i = (int) Math.pow(2,n-1); i > 0 ; i--) {
                int x = i;
                int t = 1;
                while (x>1){
                    x/=2;
                    t++;
                }
                if (t == n){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
