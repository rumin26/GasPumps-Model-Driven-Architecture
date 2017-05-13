package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreData Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class StoreData1 implements StoreData {

	@Override
	public void StoreData(DataStore d) {
		// TODO Auto-generated method stub
		
		//store the prices of regular gas and super gas in DataStore1
		float Rprice = d.getTemp_a();
        float Sprice = d.getTemp_b();
        
        d.setRprice1(Rprice);
        d.setSprice1(Sprice);
        
        System.out.println("Prices of different types of gas has been stored as follows: ");
        System.out.println("Regular Gas Price: "+Rprice);
        System.out.println("Super Gas Price: "+Sprice);

	}

}
