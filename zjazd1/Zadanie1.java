/*
Summary: Zadanie 1 ASCII flagi
Author: Tomasz Baj s20499
 */
import java.util.Scanner;

public class Zadanie1
{
    static void printflag(String flag[][], int size){
        for (int i=0; i<10; i++) {
            if (i % size == 0) {
                for (int j = 0; j < 16; j++) {
                    if(j % size==0) System.out.print(flag[i][j]);
                }
            System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [][] polishflag = new String[10][16];
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 16; j++) {
                if(i<5) polishflag[i][j] = "...";
                else polishflag[i][j] = "MMM";
            }
        }
        String [][] japanflag = new String[10][16];
        for (int i=0; i<10; i++) {
            for (int j = 0; j < 16; j++) {
                japanflag[i][j] = "...";
            }
        }
        for(int i = 0; i<1; i++) japanflag[2][7+i]="@@@";
        for(int i = 0; i<3; i++) japanflag[3][6+i]="@@@";
        for(int i = 0; i<5; i++) japanflag[4][5+i]="@@@";
        for(int i = 0; i<5; i++) japanflag[5][5+i]="@@@";
        for(int i = 0; i<3; i++) japanflag[6][6+i]="@@@";
        for(int i = 0; i<1; i++) japanflag[7][7+i]="@@@";

        System.out.println("Wybierz rozmiar flag ( 1/2/3 )");
        System.out.println("1 - large");
        System.out.println("2 - medium");
        System.out.println("3 - small");

        int x = scan.nextInt();
        switch (x){
            case 1:
                printflag(polishflag, 1);
                printflag(japanflag, 1);
                break;
            case 2:
                printflag(polishflag, 2);
                printflag(japanflag, 2);
                break;
            case 3:
                printflag(polishflag, 3);
                printflag(japanflag, 3);
                break;
            default:
                System.out.println("Błędny znak");
        }
    }
}
