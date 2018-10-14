package lab6;

import java.util.List;

public class PaperReceipt {
	String display;
	double totalPrice;
	
	public PaperReceipt(){
		display = "";
		totalPrice = 0;
	}
	
	public void add(Burger burger){
		display = display + burger.getType() + "                  " + burger.getPrice().toString() + "\n";
		List<Topping> topping = burger.getTopping();
		for(Topping toppingItem : topping){
			String displayItem = "";
			if(toppingItem.position == 2) displayItem = displayItem + "->|";
			displayItem = displayItem + toppingItem.type;
			display = (display + displayItem + "\n");
		}
		totalPrice = totalPrice + Float.parseFloat(burger.getPrice());
	}
	
	public void print(){
		System.out.println("========================================\n");
		System.out.println("          FIVE GUYS" + "\n");
		System.out.println("          BURGERS AND FRIES");
		System.out.println("          STORE # CA-1294");
		System.out.println("          5353 ALMADEN EXPY N60");
		System.out.println("          SAN JOSE, CA 95118");
		System.out.println("          (P) 408-264-9300");
		System.out.println("          12/1/2016  1:46:54 PM");
		System.out.println("          FIVE GUYS");
		System.out.println("Order Number: 45" );
		System.out.println(display);
		System.out.println("\n");
		System.out.println("Sub Total:              " + totalPrice);
	}
	
}
