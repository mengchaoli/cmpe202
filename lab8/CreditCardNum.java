/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{
	private App observers ;
	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private int group = 1 ;
	private int numInGroup = 0;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
			return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			if( !ch.equals("x") ){
				number += ch ;
				numInGroup ++ ;
				if(numInGroup == 4 && group != 4){
					group ++ ;
					number += " " ;
					numInGroup = 0 ;
				}
			}
			if( ch.equals("x") || ch.equals("Delete") ){
				number = number.substring(0, number.length()-2);
				observers.countMinus();
			}
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	
	
	public void attach(App app){
		observers = app ;
	}
	
	public void notifyObservers( int cnt )
    {
		observers.resetCount( cnt ) ;
    }   
	
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

}