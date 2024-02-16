package P5707;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt(); //路程。
        int v = scanner.nextInt(); //速度。


        float time = (float) s / v;
        int hour = 0;
        while (time >= 1) {
            time--;
            hour++;
        }
        float min = time * 60;
        System.out.print(0);
        System.out.print(8 - hour);
        System.out.print(":");
        if ((59 - min - 10) >= 10) {
            System.out.print(59 - min - 10);}
            else{
                System.out.print(0);
                System.out.print(59 - min - 10);
            }
        return;
        }
    }


