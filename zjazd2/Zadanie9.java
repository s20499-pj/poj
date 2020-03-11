/*
Summary: Zadanie 9 https://www.codingame.com/ide/puzzle/temperatures
Author: Tomasz Baj s20499
*/
import java.util.*;
class Zadanie9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result=5527; //temperature closest to 0, 5527 is always bigger than input
        if (n==0) result =0;
        else{
            for (int i = 0; i < n; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                if (Math.abs(t)<Math.abs(result)) result=t;
                if (Math.abs(t)==Math.abs(result) && t>result) result=t;
            }
        }
        System.out.println(result);
    }
}

