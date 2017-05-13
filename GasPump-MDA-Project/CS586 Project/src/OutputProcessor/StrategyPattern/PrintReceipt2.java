package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PrintReceipt Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class PrintReceipt2 implements PrintReceipt {

	@Override
	public void PrintReceipt(DataStore d) {
		// TODO Auto-generated method stub
		System.out.println("This is your receipt for the gas that you have pumped: ");
        System.out.println("Liters Pumped: "+d.getL()); //Display total gas pumped
        System.out.println("Total Amount: $"+d.getTotal2()); //Display total price of the gas pumped
	}

}
