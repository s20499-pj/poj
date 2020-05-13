/**
 *Summary: Exercise 05_06
 *Author: Tomasz Baj s20499
 */

package E05_06;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {

        TableOfElements table = new TableOfElements();

        for (int i = 0; i < table.getTable().length; i++) {
            System.out.println(table.getElement(i).toString());
        }

        for (int i = 0; i < table.getGroups().length; i++) {
            System.out.println(table.getGroups()[i].toString());

        }

    }
}
