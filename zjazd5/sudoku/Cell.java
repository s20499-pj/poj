package sudoku;

import java.util.Arrays;

public class Cell {
    private boolean Full;
    private int value;
    private int[] capabilities;

    public Cell() {
        this.Full=false;
        this.capabilities = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public Cell(int value) {
        this.value = value;
        this.Full=true;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        this.Full = true;
    }

    public boolean isFull() {
        return Full;
    }

    public void setFull(boolean full) {
        Full = full;
    }

    public int[] getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(int[] capabilities) {
        this.capabilities = capabilities;
    }

    public boolean checkCapabilities(int value){
        for (int i = 0; i < this.capabilities.length; i++) {
            if (this.capabilities[i] == value){
                int k = 0;
                int[] tmp = new int[this.capabilities.length-1];
                for (int j = 0; j < this.capabilities.length; j++) {
                    if(j!=i) tmp[k++]=this.capabilities[j];
                }
                if (tmp.length==1) {
                    this.setValue(tmp[0]);
                    return true;
                }
                else {
                    this.capabilities=tmp;
                }
                break;
            }
        }
        return false;
    }
}
