package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements SetPrice Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class SetPrice1 implements SetPrice {
	@Override
	public void SetPrice(int g, DataStore d) {
		// TODO Auto-generated method stub
		
		//check if gas is regular or super
		if(g==1)
        {
            d.setPrice1(d.getRprice1()); //fetch regular gas price
            System.out.println("Regular Gas selected");
        }
        else if(g==2)
        {
            d.setPrice1(d.getSprice1()); //fetch super gas price
            System.out.println("Super Gas selected");
        }
        
        
        System.out.println("Price for selected gas has been stored!");

	}
}
