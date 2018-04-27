package com.onlinetest.Mi;
/**
 * 给定一个去掉.的ip数字串，请你给该串添加'.'，得出所有符合条件的ip字符串
 * 输入：一行没有.的ip字符串
 * 输出：多行，每行一个由输入串得出合法的ip串
 *
 * 不合法的ip串：
 * 1.01.1.1
 * 0.1.1.1
 * 900.12.26.255
 * 0.0.0.0
 */
//未通过
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 失落的IP {
    //    public static final long MAX_LEN11 = Long.valueOf("99999999999");
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long unknownIp = in.nextLong();
        long maxLength = Long.valueOf("100000000000");//最大12位
        int totalLength = 0;
        for (int z = 12; z >= 1 ; z--) {
            if (unknownIp/maxLength>0){
                totalLength = z;
            }
            else {
                maxLength/=10;
            }
        }
//        int totalLength = string.length();
        int lens[] ={1,2,3};
        List<MyIpStructure> ipStructureList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (lens[i]+lens[j]>totalLength) break;
                for (int k = 0; k < 3; k++) {
                    if (lens[i]+lens[j]+lens[k]>totalLength) break;
                    for (int l = 0; l < 3; l++) {
                        if (lens[i]+lens[j]+lens[k]+lens[l]==totalLength){
                            ipStructureList.add(new MyIpStructure(lens[i],lens[j],lens[k],lens[l]));
                        }
                    }
                }
            }
        }
        long a,b,c,d;//a.b.c.d
        long divisions[] = {1,10,100,1000};
        for (int i = 0; i < ipStructureList.size(); i++) {
            long temp = unknownIp;
            MyIpStructure ipStructure = ipStructureList.get(i);
            d = unknownIp%divisions[ipStructure.len1];
            temp/=divisions[ipStructure.len1];
            c = unknownIp%divisions[ipStructure.len2];
            temp/=divisions[ipStructure.len2];
            b = unknownIp%divisions[ipStructure.len3];
            temp/=divisions[ipStructure.len3];
            a = unknownIp%divisions[ipStructure.len4];
            temp/=divisions[ipStructure.len4];
            if (isValid(a,b,c,d)){
                if (a==b&&b==c&&c==d){

                }
                else System.out.println(a+"."+b+"."+c+"."+d);
            }
        }
    }
    public static boolean isValid(long a,long b,long c,long d){
        if (a>=256||b>=256||c>=256||d>=256){
            return false;
        }else if (a==b&&b==c&&c==d){
            return false;
        }else if (a==0)
            return false;
        return true;
    }
}

class MyIpStructure {
    public int len1;
    public int len2;
    public int len3;
    public int len4;

    public MyIpStructure(int len1, int len2, int len3, int len4) {
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
        this.len4 = len4;
    }
}