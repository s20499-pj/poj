/**
 *Summary: Exercise 25 Diffrent Words
 *Author: Tomasz Baj s20499
 */

package E25;

import java.util.*;

public class DifferentWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String [] scannerArray = txt.toLowerCase().replaceAll("[,.:;]", "").split(" ");
        TreeSet<String> wordSet = new TreeSet();

        for (int i=0; i < scannerArray.length; i++){
            wordSet.add(scannerArray[i]);
        }
        for(String word: wordSet) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println("Number of words: " + wordSet.size());
    }
}
