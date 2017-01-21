/**
 * 
 */

/**
 * @author Radoslav Radoev
 *
 */
public class InvoiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Invoice newInvoice = new Invoice("012266554", "Engine", 10, 89.564);
		Invoice newInvoice2 = new Invoice("2534678987", "Gearbox", 2, 0);
		Invoice newInvoice3 = new Invoice("7986465432", "Suspension", -4, 55);
		
		System.out.println("-------- Ivoice #1 --------");
		newInvoice.DisplayInvoice(newInvoice);
		System.out.println("-------- Ivoice #2 --------");
		newInvoice.DisplayInvoice(newInvoice2);
		System.out.println("-------- Ivoice #3 --------");
		newInvoice.DisplayInvoice(newInvoice3);
	}
}
