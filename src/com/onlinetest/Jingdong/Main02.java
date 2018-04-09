import java.util.Scanner;
/**
 * 京东在线测试，编程题 2
 * 给定一个整数n，输出整数x,y使得x*y=n并且，x为奇数，y为偶数
 * 如果有多个x,y满足以上关系，则输出y最小的x,y
 * 如果没有这样的x,y则输出No
 *
 * 输入第一行包含一个整数t，表示测试样例数；
 * 接下来的t行,每行一个整数n;  2<n<2^63
 * 输入样例保证不为2的n次幂
 *
 * 样例输入
 * 2
 * 10
 * 5
 * 样例输出
 * 5 2
 * No
 * Created by WangChuncheng on 2018/4/9.
 */
//以下代码测试通过
public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        for (int i = 0; i < t; i++) {
            Long n = in.nextLong();
            long j;
            long middle = n/2;//(long) Math.sqrt(n);
            for (j = 2; j <= middle; j *= 2) {
                if (n % j == 0) {
                    if ((n / j) % 2 == 1) {
                        System.out.println((n / j) + " " + j );
                        break;
                    }
                }
            }
            if (j > middle) {
                System.out.println("No");
            }
        }
    }
}
