import java.util.ArrayList;


/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{
	
	private App observers ;
	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private int firstDigitofYear = 0 ;
	private int firstDigitofMonth = 0 ;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  ){
			if(!ch.equals("x")){
				if( cnt == 17 && Integer.parseInt(ch) <= 1 ){
					date += ch ;
					firstDigitofMonth = Integer.parseInt(ch);
				}
				if( cnt == 17 && Integer.parseInt(ch) > 1 ){
					date = "";
					notifyObservers( 16 );
				}
				if( cnt == 18 && firstDigitofMonth == 0 && Integer.parseInt(ch) >= 1 && Integer.parseInt(ch) <= 9 ){
					date += ch;
					date += "/" ;
				}
				if( cnt == 18 && firstDigitofMonth == 1 && Integer.parseInt(ch) > 2 ){
					date = "" ;
					notifyObservers( 16 );
				}
				if( cnt == 18 && firstDigitofMonth == 1 && Integer.parseInt(ch) < 2 ){
					date += ch ;
					date += "/" ;
				}
				if( cnt == 19 && Integer.parseInt(ch) >= 1 ){
					date += ch ;
					firstDigitofYear = Integer.parseInt(ch);
				}
				if( cnt == 19 && Integer.parseInt(ch) < 1 ){
					date = "";
					notifyObservers( 16 );
				}
				if( cnt == 20 && firstDigitofYear == 1 && Integer.parseInt(ch) == 9 ){
					date += ch ;
				}
				if( cnt == 20 && firstDigitofYear >= 2 ){
					date += ch ;
				}
				if( cnt == 20 && firstDigitofYear == 1 && Integer.parseInt(ch) < 9){
					date = "";
					notifyObservers( 16 );
				}
			}
			if( ch.equals("x") || ch.equals("Delete") ){
				date = date.substring(0, date.length()-1);
				observers.countMinus();
			}
		}
		else if ( nextHandler != null ){
			nextHandler.key(ch, cnt) ;
		}
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
//public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
//{
//
//	private IKeyEventHandler nextHandler ;
//	private String date = "" ;
//
//    public void setNext( IKeyEventHandler next) {
//    	this.nextHandler = next ;
//    }	
//
//	public String display() {
//		if ( date.equals("") ) {
//			return "[MM/YY]" + "  " ;
//		} else {
//			int section = (date.length()-1)/2;
//			switch (section) {
//				case 0: return "[" + date + "]" + "  " ;
//				default: return "[" + date.substring(0, 2) + "/" + date.substring(2) + "]" + "  " ;
//			}
//		}
//	}	
//
//	public void key(String ch, int cnt) {
//		if (cnt >= 17 && cnt <= 20) {
//			if (ch.equals("X") || ch.equals("Delete")) {
//				date = date.substring(0, date.length() - 1);
//			} else {
//				date += ch;
//			}
//		}
//		else if ( nextHandler != null )
//			nextHandler.key(ch, cnt) ;
//	}	
//
//	public void addSubComponent( IDisplayComponent c ) {
//		return ; // do nothing
//	}
//}