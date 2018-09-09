package gumball2;

public class Main {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine( 5 , 3 );

		//System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 , 3 );
		gumballMachine.turnCrank();

		//System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 , 3 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 , 3 );
		gumballMachine.turnCrank();

		//System.out.println(gumballMachine);
	}
}
