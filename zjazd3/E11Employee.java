/**
 *Summary: Exercise 11 Employee
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E11Employee
{
    private int id;
    private int salary;
    private String firstName;
    private String lastName;
    
    public E11Employee(final int id, final String firstName, final String lastName, final int salary) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getSalary() {
        return this.salary;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    
    public void setSalary(final int salary) {
        this.salary = salary;
    }
    
    public int getAnnualSalary() {
        return this.salary * 12;
    }
    
    public int raiseSalary(final int n) {
        return this.salary += this.salary * n / 100;
    }
    
    @Override
    public String toString() {
        return "Employee[id=" + this.id + ", name=" + this.firstName + " " + this.lastName + ", salary=" + this.salary + "]";
    }
}
