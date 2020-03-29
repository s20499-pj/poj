/**
 *Summary: E16 Write a program to print the name, salary and date of joining of 8 employees in a company. Use arrayList of objects.
 *Author:Tomasz Baj s20499
 */

package zjazd3;

import java.time.*;
import java.util.*;

public class E16ArrayList {

    private String name;
    private int salary;
    private LocalDate hireDay;

    public E16ArrayList(String name, int salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**    public void employeesData(ArrayList<E16ArrayList> list) {
        for (E16ArrayList i : list) {
            System.out.println(i);
        }
	}*/

    @Override
    public String toString() {
        return "name:"+name+", salary:"+salary+", hireDay:"+hireDay;
    }

}
