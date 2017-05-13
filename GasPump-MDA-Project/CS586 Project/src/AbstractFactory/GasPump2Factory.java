package AbstractFactory;
import Data.*;
import OutputProcessor.StrategyPattern.*;
/* Design Pattern implemented: Abstract Factory 
 * This class acts as a concrete Factory for GasPump1 in Abstract Factory Design Pattern
 */
public class GasPump2Factory implements AbstractFactory {
	
	@Override
    public DataStore getDataStore() {
        return new DataStore2();
    }

	 @Override
	    public StoreData getStoreData() {
	        return new StoreData2();
	    }
	 
	 @Override
	    public PayMsg getPayMsg() {
	        return  new PayMsg2();
	    }
	 
	 @Override
	    public DisplayMenu getDisplayMenu() {
	        return  new DisplayMenu2();
	    }
	 
	 @Override
	    public RejectMsg getRejectMsg() {
	           return new RejectMsg2();
	    }
	 
    @Override
    public CancelMsg getCancelMsg() {
       return new CancelMsg2(); 
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash2();
    }
    
    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2();
    }
    
    @Override
    public InitializeValues getInitializeValues() {
        return  new InitializeValues2();
    }
    
    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg2();
    }
    
    @Override
    public StopMsg getStopMsg() {
        return new StopMsg2();
    }
    
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit2();
    }
    
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg2();
    }

    @Override
    public ReturnCash getReturnCash() {
           return new ReturnCash2();
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2();
    }


}
