package com.onlinetest;
//埃拉托色尼素数筛选法
public class PrimeCreator {
    public static void main(String[] args) {
        boolean primes[] = new boolean[10005];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                for (int j = 2; ; j++) {
                    if (i * j <= 10000) {
                        primes[i * j] = false;
                    } else break;
                }
            }
        }
        for (int i = 2; i <= 10000; i++) {
            if (primes[i]) System.out.println(i);
        }
    }
}
