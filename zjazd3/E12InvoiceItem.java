/**
 *Summary: Exercise 11 Employee
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E12InvoiceItem
{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public E12InvoiceItem(final String id, final String desc, final int qty, final double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(final int qty) {
        this.qty = qty;
    }
    
    public double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(final double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getTotal() {
        return this.unitPrice * this.qty;
    }
    
    @Override
    public String toString() {
        return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + this.qty + ",unitPrice=" + this.unitPrice + "]";
    }
}
