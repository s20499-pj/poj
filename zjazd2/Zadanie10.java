/*
Summary: Zadanie 10 https://www.codingame.com/ide/puzzle/shadows-of-the-knight-episode-1
Author: Tomasz Baj s20499
*/
import java.util.*;
class Zadanie10{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int Wmax = in.nextInt(); // width of the building.
        int Wmin = 0;
        int Hmax = in.nextInt(); // height of the building.
        int Hmin = 0;
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            switch (bombDir){
                case "U":
                    Hmax=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "UR":
                    Wmin=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmax=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "R":
                    Wmin=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    break;
                case "DR":
                    Wmin=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmin=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "D":
                    Hmin=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "DL":
                    Wmax=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmin=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
                case "L":
                    Wmax=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    break;
                case "UL":
                    Wmax=X0;
                    X0=(Wmax-Wmin)/2+Wmin;
                    Hmax=Y0;
                    Y0=(Hmax-Hmin)/2+Hmin;
                    break;
            }
            System.out.println(X0+" "+Y0);
        }
    }
}

