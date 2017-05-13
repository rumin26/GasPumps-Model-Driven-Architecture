package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements StoreData Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class StoreData2 implements StoreData {

	@Override
	public void StoreData(DataStore d) {
		// TODO Auto-generated method stub
		
		//Store the prices of regular, super and premium gas in DataStore2
		int Rprice = d.getTemp_x(); //fetch price of regular gas stored in temporary variable from DataStore2
        int Sprice = d.getTemp_y(); //fetch price of super gas stored in temporary variable from DataStore2
        int Pprice = d.getTemp_z(); //fetch price of premium gas stored in temporary variable from DataStore2
        
        d.setRprice2(Rprice); //set price of regular gas
        d.setSprice2(Sprice); //set price of super gas
        d.setPprice2(Pprice); //set price of premium gas
        
        System.out.println("Prices of different types of gas has been stored as follows: ");
        System.out.println("Regular Gas Price: "+Rprice);
        System.out.println("Super Gas Price: "+Sprice);
        System.out.println("Premium Gas Price: "+Pprice);
	}

}
