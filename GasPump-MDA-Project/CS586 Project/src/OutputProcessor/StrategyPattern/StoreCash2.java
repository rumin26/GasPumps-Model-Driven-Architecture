package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreCash Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class StoreCash2 implements StoreCash {

	@Override
	public void StoreCash(DataStore d) {
		// TODO Auto-generated method stub
		
		//store the value of deposited cash in DataStore2
		int tempCash = d.getTemp_cash();
        d.setCash(tempCash);
        System.out.println("Cash has been stored!");
	}

}
