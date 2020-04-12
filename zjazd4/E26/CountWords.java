/**
 *Summary: Exercise 26 Count Words
 *Author: Tomasz Baj s20499
 */

package E26;

import java.util.*;

public class CountWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String [] scannerArray = txt.toLowerCase().replaceAll("[,.:;]", "").split(" ");
        TreeMap<String, Integer> wordsMap = new TreeMap<>();

        for (int i=0; i < scannerArray.length; i++){
            wordsMap.put(scannerArray[i], wordsMap.getOrDefault(scannerArray[i], 0) + 1);
        }

        System.out.println(wordsMap
                .toString()
                .replace("{", "[")
                .replace("}", "]"));
    }
}
