package lab6;

import java.util.List;

public class PackingSlip {
	private String display;
	
	public PackingSlip(){
		display = "";
	}
	
	public void add(Burger burger){
		display = display + burger.getType() + "\n";
		String part1 = "";
		String part2 = "";
		String part3 = "";
		List<Topping> topping = burger.getTopping();
		for(Topping toppingItem : topping){
			if(toppingItem.position == 1){
				part1 = (part1 + toppingItem.type + "\n");
			}
			else if(toppingItem.position == 2){
				part2 = (part2 + "->" + toppingItem.type + "\n");
			}
			else if(toppingItem.position == 3){
				part3 = (part3 + toppingItem.type + "\n");
			}
		}
		display = display + part1 + part2 + part3;
	}
	
	public void print(){
//		String part1 = "";
//		String part2 = "";
//		String part3 = "";
//		List<Topping> topping = burger.getTopping();
//		for(Topping toppingItem : topping){
//			if(toppingItem.position == 1){
//				part1 = (part1 + toppingItem.type + "\n");
//			}
//			else if(toppingItem.position == 2){
//				part2 = (part2 + "->" + toppingItem.type + "\n");
//			}
//			else if(toppingItem.position == 3){
//				part3 = (part3 + toppingItem.type + "\n");
//			}
//		}
//		display = display + part1 + part2 + part3;
		System.out.println("**************************************\n");
		System.out.println("Order Number:        45");
		System.out.println("12/1/2016    1:46:54 PM");
		System.out.println("         FIVE GUYS");
		System.out.print(display);
	}
}
