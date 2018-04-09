import java.util.Scanner;

/**
 * Created by 54258 on 2018/4/9.
 * 牛牛走象棋，大家知道象棋的规则吧，马只能走日字形的格子
 * 假设以棋盘左下角为坐标原点，向上为Y轴，向右为X轴建立坐标系
 * 那么马用K步走到(X,Y)，有多少种走法
 * 最终数值可能很大，输出该数对1,000,000,007取模的结果
 * <p>
 * 输入第一行是整数K<10000，第二行是坐标 1<=x,y<= 8
 */
//以下代码未提交，结果未知
public class Main03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long k = in.nextLong();
        long x = in.nextLong(),
                y = in.nextLong();
        long minTimes = getSteps(x, y);
        if (k < minTimes) {
            System.out.println(0);
        } else {
            System.out.println();
        }
    }

    public static long getSteps(long x, long y) {
        if (x < 3 || y < 3 || x > 6 || y>6) {
            if (x == 1 && y == 2 || x == 2 && y == 1) {
                return 1;
            } else return 0;
        }
        return (getSteps(x - 2, y - 1) +
                getSteps(x - 2, y + 1) +
                getSteps(x - 1, y - 2) +
                getSteps(x - 1, y + 2) +
                getSteps(x + 2, y - 1) +
                getSteps(x + 2, y + 1) +
                getSteps(x + 1, y - 2) +
                getSteps(x + 1, y + 2)


        ) % 1000000007;
    }
}
