package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements ReturnCash Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class ReturnCash2 implements ReturnCash {

	@Override
	public void ReturnCash(DataStore d) {
		// TODO Auto-generated method stub
		//calculate remaining cash
		int cash = d.getCash(); //fetch deposited cash from DataStore2
        int total = d.getTotal2(); //fetch total from DataStore2
        
        int remainingCash = cash - total;
        System.out.println("Cash Returned: "+remainingCash);

	}

}
