package lab6;

public class Main {
	public static void main(String[] args){
		Assistant assistant = new Assistant();
		Burger LBB = new Burger("LBB","5.59");
		Burger LTL = new Burger("LTL CAJ", "2.79");
		LBB.addTopping(1,"LETTUCE");
		LBB.addTopping(1, "TOMATO");
		LBB.addTopping(2, "G ONION");
		LBB.addTopping(2, "JALA GRILLED");
		LBB.addTopping(3, "{{{{ BACON }}}}");
		assistant.order(LBB);
		assistant.order(LTL);
		assistant.printPaperReceipt();
		assistant.printPackingSlip();
	}
	
}
