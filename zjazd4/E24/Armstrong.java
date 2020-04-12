package E24;

import java.util.Scanner;

public class Armstrong {

    public static class Numer {
        int x;
        String stringOfDigits;
        int [] arrayOfDigits;
        boolean isarmstrong;

        public Numer(int x) {
            this.x = x;
            int result =  0;

            stringOfDigits = Integer.toString(x);
            arrayOfDigits = new int[stringOfDigits.length()];
            for(int i=0; i < stringOfDigits.length(); i++){
                arrayOfDigits[i] = stringOfDigits.charAt(i)-48; //-48 to convert ascii to int
                result += Math.pow(arrayOfDigits[i], 3);
            }

            if (result==x){
                isarmstrong =true;
            }
            else isarmstrong =false;
        }

        public boolean isArmstrong(){
            return isarmstrong;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numer x = new Numer(scanner.nextInt());
        System.out.println(x.isArmstrong());

        //all Armstrong nuber
        /**for (int i=0; i<10000; i++){
            Numer x = new Numer(i);
            if (x.isArmstrong()==true) System.out.println(x.stringOfDigits);
        }*/
    }
}
