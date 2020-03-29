/**
 *Summary: Exercise 15 Time
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E15Time
{
    private int hour;
    private int minute;
    private int second;
    
    public E15Time(final int hour, final int minute, final int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return this.hour;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public int getSecond() {
        return this.second;
    }
    
    public void setHour(final int hour) {
        this.hour = hour;
    }
    
    public void setMinute(final int minute) {
        this.minute = minute;
    }
    
    public void setSecond(final int second) {
        this.second = second;
    }
    
    public void setTime(final int hour, final int minute, final int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    @Override
    public String toString() {
        return String.format("%02d", this.hour) + "/" + String.format("%02d", this.minute) + "/" + String.format("%02d", this.second);
    }
    
    public E15Time nextSecond() {
        ++this.second;
        if (this.second > 59) {
            this.second = 0;
            ++this.minute;
            if (this.minute > 59) {
                this.minute = 0;
                ++this.hour;
                if (this.hour > 23) {
                    this.hour = 0;
                }
            }
        }
        return this;
    }
    
    public E15Time previousSecond() {
        --this.second;
        if (this.second < 0) {
            this.second = 59;
            --this.minute;
            if (this.minute < 0) {
                this.minute = 59;
                --this.hour;
                if (this.hour < 0) {
                    this.hour = 23;
                }
            }
        }
        return this;
    }
}
