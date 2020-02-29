import java.util.Scanner;

public class Zadanie2
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj, aby obliczyć twoje BMI podaj najpierw swój wzrost w centymetrach");
        float h = scan.nextFloat()/100;
        System.out.println("Teraz podaj swoją wagę w kilogramach");
        float m = scan.nextFloat();
        float bmi = m/(h*h);
        System.out.println("Twoje BMI to "+bmi);
        if (bmi<18.5) System.out.println("Niedowaga");
        else if (bmi>=18.5 && bmi<25) System.out.println("norma");
        else if (bmi>=25 && bmi<30) System.out.println("nadwaga");
        else System.out.println("otyłość");
    }
}
/*
Summary: Zadanie 2 BMI
Author: Tomasz Baj s20499
 */