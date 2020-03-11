/*
Summary: Zadanie 8 Caesar cipher
Author: Tomasz Baj s20499
*/
import java.util.Scanner;
public class Zadanie8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        class Cipher{

            String message;

            public String getMessage(int shift) {
                char[] array = message.toCharArray();
                for (int i =0; i<array.length; i++){
                    array[i]= (char) (array[i]-shift);
                    if((int)array[i]<48) array[i]+=43;
                }
                String word = new String(array);
                System.out.println(word);
                return word;
            }

            public void setMessage(int shift) {
                char[] array = scanner.next().toUpperCase().toCharArray();
                for (int i =0; i<array.length; i++){
                    System.out.println((int)(array[i]));
                    array[i]+=(shift-48);
                    array[i]= (char) (array[i]%43);
                    array[i]+=48;
                }
                String word = new String(array);
                this.message = word;
                System.out.println(this.message);
            }
            public String getAuthor(int shift){
                String author ="TomaszBaj";
                char[] array = author.toUpperCase().toCharArray();
                for (int i =0; i<array.length; i++){
                    array[i]= (char) (array[i]-shift);
                    if((int)array[i]<48) array[i]+=43;
                }
                String word = new String(array);
                System.out.println(word);
                return word;
            }
        }
        Cipher txt = new Cipher();
        System.out.println("Aby zapisać wiadomość podaj najpierw przesunięcie");
        int shift = scanner.nextInt();
        if (shift >43) shift=shift%43;
        System.out.println("teraz podaj wiadomość do zaszyfrowania");
        txt.setMessage(shift);
        System.out.println("Aby odszyfrować wiadomość podaj przesunięcie");
        shift = scanner.nextInt();
        if (shift >43) shift=shift%43;
        txt.getMessage(shift);
        System.out.println("Imię i nazwisko autora: ");
        txt.getAuthor(shift);

    }
}
