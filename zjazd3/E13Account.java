/**
 *Summary: Exercise 13 Account
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E13Account
{
    private String id;
    private String name;
    private int balance;
    
    public E13Account(final String id, final String name) {
        this.balance = 0;
        this.id = id;
        this.name = name;
    }
    
    public E13Account(final String id, final String name, final int balance) {
        this.balance = 0;
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public int credit(final int balance) {
        return this.balance = balance;
    }
    
    public int debit(final int n) {
        if (n <= this.balance) {
            this.balance -= n;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    
    public int transferTo(final E13Account e13Account, final int n) {
        if (n <= this.balance) {
            e13Account.credit(n);
            this.balance -= n;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    
    @Override
    public String toString() {
        return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
    }
}
