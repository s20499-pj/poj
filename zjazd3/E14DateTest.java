/**
 *Summary: Exercise 14 Date
 *Author: Toamsz Baj s20499
 */
package zjazd3;

public class E14DateTest {

    public static void main(String[] args) {
        E14Date date1 = new E14Date(23,3,2020);
        System.out.println("Day: " + date1.getDay());
        System.out.println("Month: " + date1.getMonth());
        System.out.println("Year: " + date1.getYear());
        date1.setDay(1);
        date1.setMonth(4);
        date1.setYear(2021);
        System.out.println("New day: " + date1.getDay());
        System.out.println("New month: " + date1.getMonth());
        System.out.println("New year: " + date1.getYear());
        date1.setDate(2,2,2022);
        System.out.println("New date: " + date1.toString());
    }
}
