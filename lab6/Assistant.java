package lab6;

public class Assistant {
	PaperReceipt pr = new PaperReceipt();
	PackingSlip ps = new PackingSlip();
	
	public void order(Burger burger){
		pr.add(burger);
		ps.add(burger);
	}
	
	public void printPaperReceipt(){
		pr.print();
	}
	
	public void printPackingSlip(){
		ps.print();
	}
}
