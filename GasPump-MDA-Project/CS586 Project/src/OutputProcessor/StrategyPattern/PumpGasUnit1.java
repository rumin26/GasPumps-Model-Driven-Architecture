package OutputProcessor.StrategyPattern;
/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern 
 * This class implements PumpGasUnit Interface
 * GasPump1Factory uses this class
 * */
import Data.DataStore;

public class PumpGasUnit1 implements PumpGasUnit {

	@Override
	public void PumpGasUnit(DataStore d) {
		// TODO Auto-generated method stub
		System.out.println("Pumped 1 gallon of gas...");
        
		//calculate total gas pumped
        int g = d.getG();
        g = g + 1;
        d.setG(g);
        
        //calculate total price of the pumped gas
        float price = d.getPrice1();
        float total = d.getTotal1();
        total = price*g;
        d.setTotal1(total);
	}

}
