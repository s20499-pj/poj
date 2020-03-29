/**
 *Summary: E17 Palindrome
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E17Palindrom {

    public static boolean palindromeChecker(String sentence) {

        String clearSentence = sentence.replaceAll("[.,;\\s]", "").toLowerCase();
        int i = 0;
        int j = clearSentence.length()-1;

        while (i < j) {
            if(clearSentence.charAt(i) == clearSentence.charAt(j))
                return true;
            i++;
            j--;
        }
        return false;
    }
}
