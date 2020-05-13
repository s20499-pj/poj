/**
 *Summary: Exercise 05_06
 *Author: Tomasz Baj s20499
 */

package E05_06;

public class ChemicalElement {

    private int number;
    private String name;
    private Group group;

    public ChemicalElement(int number, String name, Group group) {
        this.number = number;
        this.name = name;
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return number +" "+ name +" "+ group.getName();
    }
}
