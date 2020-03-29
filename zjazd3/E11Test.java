/**
 *Summary: Exercise 11 Employee
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E11Test
{
    public static void main(final String[] array) {
        final E11Employee e11Employee = new E11Employee(1, "Jan", "Kowalski", 5604);
        System.out.println("Id: " + e11Employee.getId());
        System.out.println("Name: " + e11Employee.getName());
        System.out.println(e11Employee.toString());
        System.out.println(e11Employee.getAnnualSalary());
        e11Employee.setSalary(5000);
        System.out.println("New salary:" + e11Employee.getSalary());
        System.out.println("New annual salary: " + e11Employee.getAnnualSalary());
        e11Employee.raiseSalary(10);
        System.out.println("Salary after payrise: " + e11Employee.getSalary());
    }
}
