/**
 *Summary: E17 Palindrome
 *Author: Tomasz Baj s20499
 */

package zjazd3;
    
public class E17PalindromTest {

    public static void main(String[] args) {

        String x = "Muzo, raz;... daj ...jad;;;; za      rozum.";
        String y = "Atak;;;;;..... kata";
        String z = "Wódy ; ; ; ;.,,,, żal dla ....,,,Żydów";
        String a = "Wo,;jt,ek Tur,ek kerUt KetJo.....W";

        System.out.println(E17Palindrom.palindromeChecker(x));
        System.out.println(E17Palindrom.palindromeChecker(y));
        System.out.println(E17Palindrom.palindromeChecker(z));
        System.out.println(E17Palindrom.palindromeChecker(a));
    }

}
