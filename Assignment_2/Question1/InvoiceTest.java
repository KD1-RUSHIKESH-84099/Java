
public class InvoiceTest {

	public static void main(String[] args) {
		Invoice i1 = new Invoice("real","healthy",-1,100);
		if(i1.getQuantity() < 0) {
			i1.setQuantity(0);
		}
		if(i1.getPricePerItem() < 0) {
			i1.setPricePerItem(0);
		}
		
		double bill = i1.invoiceAmount();
		System.out.println(bill);

	}

}
