/**
 *Summary: E16 Test
 *Author: Tomasz Baj s20499
 */

package zjazd3;

import java.util.*;

public class E16ArrayListTest {

    public static void employeesData(ArrayList<E16ArrayList> list) {
	for (E16ArrayList i : list) {
	    System.out.println(i);
	}
    }
    
    public static void main(String[] args) {

        ArrayList<E16ArrayList> list = new ArrayList<>();

        list.add(new E16ArrayList("Pablo", 4000, 2011, 2, 1));
        list.add(new E16ArrayList("Adam", 5000, 1987, 6, 15));
        list.add(new E16ArrayList("Lily", 4200, 1999, 11, 2));
        list.add(new E16ArrayList("Joseph", 2000, 2000, 9, 14));
        list.add(new E16ArrayList("Karl", 2900, 1994, 12, 22));
        list.add(new E16ArrayList("Marco", 6000, 1989, 10, 12));
        list.add(new E16ArrayList("Patric", 8000, 1994, 2, 7));
	list.add(new E16ArrayList("Dan", 3000, 1995, 3, 30));
	employeesData(list);

    }

}
