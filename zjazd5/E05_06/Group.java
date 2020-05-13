/**
 *Summary: Exercise 05_06
 *Author: Tomasz Baj s20499
 */

package E05_06;

import java.util.Arrays;

public class Group {

    private String name;
    private ChemicalElement[] list;

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChemicalElement[] getList() {
        return list;
    }

    public void setList(ChemicalElement[] table) {
        int i = 0;
        for (ChemicalElement x : table) {
            if (x.getGroup().getName() == this.getName()) {
                i++;
            }
        }
        list = new ChemicalElement[i];
        i = 0;
        for (ChemicalElement x : table) {
            if (x.getGroup().getName() == this.getName()) {
                list[i++] = x;
            }
        }
    }

    @Override
    public String toString() {
        return name +
                ", list = " +Arrays.toString(list)
                .replaceAll(" Alkali metal", "")
                .replaceAll(" Alkaline earth metal", "")
                .replaceAll(" Transition metal", "")
                .replaceAll(" Post transition metal", "")
                .replaceAll(" Metalloid", "")
                .replaceAll(" Nonmetal", "")
                .replaceAll(" Noble gas", "")
                .replaceAll(" Lanthanide", "")
                .replaceAll(" Actinide", "");
    }}
