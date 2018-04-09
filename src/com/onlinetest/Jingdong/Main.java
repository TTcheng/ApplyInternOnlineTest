import java.util.Scanner;
/**
 * 京东在线测试，编程题 1
 * 形如AB:BA , AA:BB , AB:AB的时间被称为幸运时间
 * 其中A和A表示两个数字相等，B和B表示两个数字相等，允许A和B相等
 * 输入第一行是一个整数，表示测试有N组时间形如HH:MM的时间
 * 输入第二行，是N个时间，以空格隔开
 *
 * 计算幸运时间的数目，并输出
 * Created by WangChuncheng on 2018/4/9.
 */
//以下代码测试通过
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int sum = 0;
        int hh, mm;
        for (int i = 0; i < n; i++) {
            String str = in.next();
            String time[] = str.split(":");
            if (time[0].charAt(0) == time[1].charAt(0) && time[0].charAt(1) == time[1].charAt(1) ||
                    time[0].charAt(0) == time[1].charAt(1) && time[0].charAt(1) == time[1].charAt(0) ||
                    time[0].charAt(0) == time[0].charAt(1) && time[1].charAt(0) == time[1].charAt(1)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
