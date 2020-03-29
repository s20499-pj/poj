/**
 *Summary: Exercise 14 Date
 *Author: Toamsz Baj s20499
 */

package zjazd3;

public class E14Date
{
    private int day;
    private int month;
    private int year;
    
    public E14Date(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int getDay() {
        return this.day;
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public void setDay(final int day) {
        this.day = day;
    }
    
    public void setMonth(final int month) {
        this.month = month;
    }
    
    public void setYear(final int year) {
        this.year = year;
    }
    
    public void setDate(final int day, final int month, final int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return String.format("%02d", this.day) + "/" + String.format("%02d", this.month) + "/" + String.format("%04d", this.year);
    }
}
