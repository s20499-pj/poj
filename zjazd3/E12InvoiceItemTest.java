/**
 *Summary: Exercise 11 Employee Test
 *Author: Tomasz Baj s20499
 */

package zjazd3;

public class E12InvoiceItemTest {

    public static void main(String[] args) {
       E12InvoiceItem invoiceItem1 = new E12InvoiceItem("1","pen",3,4.20);
       System.out.println("ID: " + invoiceItem1.getId());
       System.out.println("Desc: " + invoiceItem1.getDesc());
       System.out.println(invoiceItem1.toString());
       invoiceItem1.setQty(4);
       System.out.println("New qty: " + invoiceItem1.getQty());
       invoiceItem1.setUnitPrice(5.10);
       System.out.println("New unitPrice: " + invoiceItem1.getUnitPrice());
       System.out.println("Total price: " + invoiceItem1.getTotal());
    }
}

/**{
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public E12InvoiceItem(final String id, final String desc, final int qty, fi>
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
        return "InvoiceItem[id=" + this.id + ",desc=" + this.desc + ",qty=" + t>
    }
}
*/
