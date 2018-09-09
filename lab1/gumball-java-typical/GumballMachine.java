package gumball2;

public class GumballMachine {
	 private int num_gumballs;
	    private boolean has_quarter;
	    private boolean has_two_quarter;
	    private int machinetype;
	    private int totalcoin = 0;

	    public GumballMachine( int size , int machinetype )
	    {
	        // initialize instance variables
	        this.num_gumballs = size;
	        this.has_quarter = false;
	        this.machinetype = machinetype;
	    }

	    public void insertQuarter(int coin , int machinetype)
	    {
	    	switch (machinetype)
	    	{
	    	case 1:
	    		if ( coin == 25 )
	    		{
		            this.has_quarter = true ;
		            totalcoin += coin;
	    		}
		        else
		        {
		        	this.has_quarter = false ;
		        	totalcoin += coin;
		        } 
	    	case 2:
	    		if ( ( totalcoin + coin ) == 50 )
	    		{
	    			totalcoin = totalcoin + coin;
	    			this.has_two_quarter = true;
	    		}
	    		else
	    		{
	    			this.has_two_quarter = false;
	    			totalcoin += coin;
	    		}
	    	case 3:
	    		if ( ( totalcoin + coin ) >= 50 )
	    		{
	    			totalcoin += coin;
	    			this.has_two_quarter = true;
	    		}
	    		else
	    		{
	    			this.has_two_quarter = false;
	    			totalcoin += coin;
	    		}
	    			
	    		
	    	}
	        
	    }
	        
	    public void turnCrank(){
	    	switch (machinetype){
	    	case 1:
	    		if(this.has_quarter){
	    			if(this.num_gumballs > 0){
	    				System.out.println("Thanks for your quarter.  Gumball ejected!");
	    				this.num_gumballs--;
	    				this.has_quarter = false;
	    			}
	    			else
	    				System.out.println("Sorry, no more Gumballs");    			
	    		}
	    		break;
	    		
	    	case 2:
	    		if(this.has_two_quarter){
	    			if(this.num_gumballs > 0){
	    				System.out.println("Thanks for your quarter.  Gumball ejected!");
	    				this.num_gumballs--;
	    				this.has_two_quarter = false;
	    			}
	    			else
	    				System.out.println("Sorry, no more Gumballs");
	    		}
	    		break;
	    		
	    	case 3:
	    		if(this.has_two_quarter){
	    			if(this.num_gumballs > 0){
	    				System.out.println("Thanks for your quarter.  Gumball ejected!");
	    				this.num_gumballs--;
	    				this.totalcoin -= 50;
	    				if(this.totalcoin <= 50){
	    					this.has_two_quarter = false;
	    				}
	    			}
	    		}
	    		else{
	    			System.out.println("Not enough coins! Please insert more!");
	    		}
	    		break;
	    		
	    	default:
	    		break;
	    	}
	    }	    
}
