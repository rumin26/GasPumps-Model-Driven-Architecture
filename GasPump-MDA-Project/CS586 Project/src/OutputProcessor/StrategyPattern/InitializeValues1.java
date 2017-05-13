package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements InitializeValues Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class InitializeValues1 implements InitializeValues {

	@Override
	public void InitializeValues(DataStore d) {
		// TODO Auto-generated method stub
		d.setG(0); //set G=0
        d.setTotal1(0); //set total=0
        
        System.out.println("Initialized G=0 and Total=0");
	}

}
