import java.util.Scanner;

public class Zadanie4
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;

        System.out.println("Jak duża ma być piramida z literek");
        size = scan.nextInt();

        for (int i = 0; i < size; i++) {
            char letter = 'a';
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int k = -1; k<i; k++) {
                System.out.print(letter);
                letter++;
            }
            letter--;
            for (int l=0; l<i; l++){
                letter--;
                System.out.print(letter);
            }
            System.out.println();
        }
    }
}
/*
Summary: Zadanie 4 piramida z literek
Author: Tomasz Baj s20499
 */