import java.util.Scanner;

public class Zadanie3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj, aby obliczyć twoje zapotrzebowanie na kalorie wg wzoru Harrisa-Benedicta podaj swoją płeć");
        System.out.println("1 - mężczyzna");
        System.out.println("2 - kobieta");
        int x = scan.nextInt();
        System.out.println("Teraz podaj swój wzrost w centymetrach");
        float h = scan.nextFloat();
        System.out.println("Teraz podaj swoją wagę w kilogramach");
        float m = scan.nextFloat();
        System.out.println("Na końcu podaj swój wiek");
        float age = scan.nextInt();
        double ppm;
        if(x==1){
            ppm =(66.5+(13.75*m)+(5.003*h)-(6.775*age));
        }
        else ppm =(655.1+(9.563*m)+(1.85*h)-(4.676*age));
        System.out.println("Do zapewnienia podstawowej przemiany materii potrzebujesz: " + ppm);
    }
}
/*
Summary: Zadanie 3 PPM kalkulator dziennego zapotrzebowania kalorycznego
Author: Tomasz Baj s20499
 */
