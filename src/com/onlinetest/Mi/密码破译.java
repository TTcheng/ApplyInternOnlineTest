package com.onlinetest.Mi;
/**
 * Create by Wangchuncheng on 2018/4/10
 * 数字1-26对应a-z，现给定一个数字串，请给出所有可能的破译
 *
 * 输入包含多个数字串，每个数字串占一行
 * 每个输入对应输出一行，不同的破译解之间用空格隔开并按字典序排列
 * 每个输入对应输出一行，不同的破译解之间用空格隔开并按字典序排列
 *
 * 样例输入
 * 1
 * 2
 * 3
 *
 * 样例输出
 * a
 * ab
 * abc aw lc
 */
//未通过
import java.util.Scanner;

public class 密码破译 {
    public static String res = "";
    public static String inputStr = "";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            inputStr = in.nextLine();
            res = "";
            getRes(0);
            System.out.println();
        }
    }

    public static void getRes(int len) {
        if (len == inputStr.length()) {
            res = res + " ";
        } else {
            res += (inputStr.charAt(len)-'1'+'z');
            getRes(len + 1);
            int num = (inputStr.charAt(len)-'0')*10 + (inputStr.charAt(len+1)-'0');
            if (num<=26) {
                res += (num-1+'a');
                getRes(len + 2);
            }
        }
    }
}
