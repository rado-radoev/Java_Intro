
public class InvoiceTest {
	static public void main(String args[]) {
		// Happy Case
		Invoice invoice = new Invoice("123", "widget", 2, 1.95);
		invoice.getInvoiceAmount();
		
		//Sad Case 1
		invoice = new Invoice("123", "widget", -2, 1.95);
		invoice.getInvoiceAmount();
		
		//Sad Case 2
		invoice = new Invoice("123", "widget", 2, -1.95);
		invoice.getInvoiceAmount();

	}
}