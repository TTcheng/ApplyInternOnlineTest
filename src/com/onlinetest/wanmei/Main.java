package com.onlinetest.wanmei;

import java.util.Scanner;

/**
 * 第一题：
 * 写一个实现栈的基本类，实现IStack接口
 * 要求所有函数的时间复杂度为O（1），空间复杂度不限
 * 输入：n和n个整数
 * 输出：将n个数依次入栈，然后进行一次出栈操作，然后输出最大值和最小值，用逗号分隔
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        MyStack myStack = new MyStack(n);
        for (int i = 0; i < n; i++) {
            myStack.push(scanner.nextInt());
        }
        myStack.pop();
        int max = myStack.max();
        int min = myStack.min();
        System.out.println(max+","+min);
    }
}

class MyStack implements IStack {
    private int[] stack;
    private int end = 0;
    private int maxValue = Integer.MIN_VALUE;
    private int minValue = Integer.MAX_VALUE;
    public MyStack(int n) {
        stack = new int[n];
    }

    @Override
    public void push(int data) {
        if (end<stack.length-1){    //find max,min values ,skip the last value
            if (maxValue<data) maxValue = data;
            if (minValue>data) minValue = data;
        }
        stack[end++] = data;
    }

    @Override
    public int pop() {
        return stack[--end];
    }

    @Override
    public int min() {
        return minValue;
    }

    @Override
    public int max() {
        return maxValue;
    }
}

interface IStack {
    void push(int data);//向栈压数据

    int pop();//从栈顶取数据

    int min();//获取栈中最小值

    int max();//获取栈中最大值
}
