package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements SetPrice Interface
 * GasPump2Factory uses this class
 * */
import Data.DataStore;

public class SetPrice2 implements SetPrice {
	@Override
	public void SetPrice(int g, DataStore d) {
		// TODO Auto-generated method stub
		
		//check if gas is regular, super or premium
		if(g==1)
        {
            d.setPrice2(d.getRprice2()); //fetch regular gas price
            System.out.println("Regular Gas selected");
        }
        else if(g==2)
        {
            d.setPrice2(d.getSprice2()); //fetch super gas price
            System.out.println("Super Gas selected");
        }
        else if(g==3)
        {
            d.setPrice2(d.getPprice2()); //fetch premium gas price
            System.out.println("Premium Gas selected");
        }
        
        System.out.println("Price for selected gas has been stored!");

	}
}
