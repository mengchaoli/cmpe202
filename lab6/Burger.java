package lab6;

import java.util.ArrayList;
import java.util.List;

public class Burger {
	private String type;
	private String price;
	private List<Topping> toppinglist;
	
	public Burger(String type, String price){
		this.type = type;
		this.price = price;
		toppinglist = new ArrayList<>();
	}
	
	public void addTopping(int position, String type){
		toppinglist.add(new Topping(position, type));
	}
	
	public String getPrice(){
		return this.price;
	}
	
	public String getType(){
		return this.type;
	}
	
	public List<Topping> getTopping(){
		return this.toppinglist;
	}
}
