package OutputProcessor;
import Data.*;
import AbstractFactory.*;
import OutputProcessor.StrategyPattern.*;

/* Design Pattern implemented: Strategy Pattern and Abstract Factory Pattern
 * This class acts as an Output Processor for both Gas Pump components GasPump-1 and GasPump-2 and also it acts as a context class
 * for Strategy Pattern 
*/
public class OutputProcessor {
	private DataStore d;
    private AbstractFactory af;

    private StoreData storeData;
    private PayMsg payMsg;
    private DisplayMenu displayMenu;
    private RejectMsg rejectMsg;
    private CancelMsg cancelMsg;
    private StoreCash storeCash;
    private SetPrice setPrice;
    private InitializeValues initializeValues;
    private ReadyMsg readyMsg;
    private StopMsg stopMsg;
    private PumpGasUnit pumpGasUnit;
    private GasPumpedMsg gasPumpedMsg;
    private ReturnCash returnCash;
    private PrintReceipt printReceipt;
    
    public OutputProcessor(AbstractFactory af, DataStore d)
    {
        this.af = af;
        this.d = d;
        
        //Initialize Abstract Factory
        storeData = af.getStoreData();
        payMsg = af.getPayMsg();
        displayMenu = af.getDisplayMenu();
        rejectMsg = af.getRejectMsg();
        cancelMsg = af.getCancelMsg();
        storeCash = af.getStoreCash();
        setPrice = af.getSetPrice();
        initializeValues = af.getInitializeValues();
        readyMsg = af.getReadyMsg();
        stopMsg = af.getStopMsg();
        pumpGasUnit = af.getPumpGasUnit();
        gasPumpedMsg = af.getGasPumpedMsg();
        returnCash = af.getReturnCash();
        printReceipt = af.getPrintReceipt(); 
    }
    
    //Store prices of different gases based on selected gas pump
    public void StoreData()
    {
        storeData.StoreData(d);
    }
    
    //Display PayMsg of selected gas pump 
    public void PayMsg()
    {
        payMsg.PayMsg();
    }
    
    //Display Menu of selected gas pump
    public void DisplayMenu()
    {
        displayMenu.DisplayMenu();
    }
    
    //Display RejectMsg of selected gas pump
    public void RejectMsg()
    {
        rejectMsg.RejectMsg();
    }
    
    //Display CancelMsg of selected gas pump
    public void CancelMsg()
    {
        cancelMsg.CancelMsg();
    }
    
    //Store deposited cash of selected gas pump
    public void StoreCash()
    {
        storeCash.StoreCash(d);
    }
    
    //Set price of selected type of the gas of selected gas pump
    public void SetPrice(int g)
    {
        setPrice.SetPrice(g, d);
    }
    
    //Initialize values of gas and total of selected gas pump
    public void InitializeValues()
    {
        initializeValues.InitializeValues(d);
    }
    
    //Display ReadyMsg of selected gas pump
    public void ReadyMsg()
    {
        readyMsg.ReadyMsg();
    }
    
    //Display StopMsg of selected gas pump
    public void StopMsg()
    {
        stopMsg.StopMsg();
    }
    
    //Display appropriate units of gas pumped selected gas pump
    public void PumpGasUnit()
    {
        pumpGasUnit.PumpGasUnit(d);
    }
    
    //Display total units of gas pumped of selected gas pump
    public void GasPumpedMsg()
    {
        gasPumpedMsg.GasPumpedMsg(d);
    }
    
    //Return remaining cash after using  selected gas pump
    public void ReturnCash()
    {
        returnCash.ReturnCash(d);
    }
    
    //Print Receipt after using selected gas pump
    public void PrintReceipt()
    {
        printReceipt.PrintReceipt(d);
    }
    
    //getter and setter methods
    public DataStore getD() {
        return d;
    }

    public void setD(DataStore d) {
        this.d = d;
    }

    public AbstractFactory getAf() {
        return af;
    }

    public void setAf(AbstractFactory af) {
        this.af = af;
    }

}
