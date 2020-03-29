/**
 *Summary: Exercise 13 Account
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E13AccountTest {

    public static void main(String[] args) {
	E13Account account1 = new E13Account("1","account no. 1", 100);
        E13Account account2 = new E13Account("2","account no. 2");
        System.out.println("Account 1 id: " + account1.getId());
        System.out.println("Account 1 name: " + account1.getName());
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        account1.credit(1000);
        System.out.println("New account no. 1 balance: " + account1.getBalance());
        account1.debit(50);
        System.out.println("New account no. 1 balance: " + account1.getBalance());
        account2.debit(50);
        System.out.println("Account no. 2 balance: " + account2.getBalance());
        account1.transferTo(account2, 100);
        System.out.println("New account no. 1 balance: " + account1.getBalance());
        System.out.println("New account no. 2 balance: " + account2.getBalance());
    }
}
