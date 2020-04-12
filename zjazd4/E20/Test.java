/**
 *Summary: Exercise 20
 *Author: Tomasz Baj s20499
 */

package E20;

public class Test {
    public static void main(String[] args) {
        System.out.println("Person obj:");
        Person p1 = new Person("Rick", "NY");
        System.out.println(p1.toString());
        System.out.println(p1.getName());
        System.out.println(p1.getAddress());
        p1.setAddress("Mexico");
        System.out.println(p1.getAddress());
        System.out.println(p1.toString());
        System.out.println();

        System.out.println("Student obj:");
        Student s1 = new Student("Kuba Guzik", "Radom", "dzienne", 2020, 750);
        System.out.println(s1.toString());
        System.out.println(s1.getProgram());
        System.out.println(s1.getYear());
        System.out.println(s1.getFee());
        s1.setProgram("zaoczne");
        s1.setYear(2021);
        s1.setFee(1200);
        System.out.println(s1.toString());
        System.out.println();

        System.out.println("Staff obj:");
        Staff s2 = new Staff("Marian", "Opole", "LO I", 5000);
        System.out.println(s2.toString());
        System.out.println(s2.getSchool());
        System.out.println(s2.getPay());
        s2.setSchool("LO X");
        s2.setPay(5150);
        System.out.println(s2.toString());
    }
}

