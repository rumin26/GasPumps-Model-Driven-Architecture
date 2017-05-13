package InputProcessor;
/* 
 * This class acts as an Input Processor for GasPump-2
 */
import MDA.*;
import Data.*;


public class GasPump2 {
	private MDAEFSM m;
    private DataStore d;
   
    public GasPump2(MDAEFSM m, DataStore d)
    {
        this.m = m;
        this.d = d;
    }
    
    //Activate Gas Pump-1 and takes price of regular gas and super gas from the user
    public void Activate(int a, int b, int c){
        if(a>0 && b>0 && c>0)
        {
            d.setTemp_x(a); // set price of regular gas to temporary variable
            d.setTemp_y(b); // set price of super gas to temporary variable
            d.setTemp_z(c); // set price of premium gas to temporary variable
            m.Activate(); //calls Activate() in MDAEFSM class
        }
    }
    
    //User selects Start
    public void Start(){
        m.Start(); //calls start() in MDAEFSM class
    }
    
    //User selects PayCash
    public void PayCash(int c){
        //check if user enters value of cash as positive integer
    	if(c>0)
        {
            d.setTemp_cash(c); //set cash deposited to temporary variable in Data Store 2 class
            m.PayCash(); // calls PayCash() in MDAEFSM class
        }
    }
    
    //User selects Cancel
    public void Cancel(){
        m.Cancel(); //calls Cancel() in MDAEFSM class
    }
    
    //User selects Premium gas
    public void Premium(){
        m.SelectGas(3); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Premium gas
    }
    
    //User selects Regular gas
    public void Regular(){
        m.SelectGas(1); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Regular gas
    }
    
    //User selects super gas
    public void Super(){
        m.SelectGas(2); //calls SelectGas() in MDAEFSM class and tell it that the user has selected Super gas
    }
    
    //User selects Start Pump
    public void StartPump(){
        m.StartPump();
    }
    
    //User selects Pump Liter
    public void PumpLiter(){
        
    	
        int cash = d.getCash(); //fetch cash stored from Data Store 2 class
        int L = d.getL(); // fetch Liters from Data Store 2 class
        int price = d.getPrice2(); //fetch price of the selected gas from Data Store class
        
        //check if user has enough cash to pump liters
        if(cash >= price*(L+1))
        {
            m.Pump(); //calls Pump() in MDAEFSM class
        }
        else
        {
            System.out.println("Sorry! You have not deposited enough cash to pump the selected gas.");
            m.StopGasPump();  //calls StopGasPump() in MDAEFSM class
        }
    }
    
    //User selects Stop
    public void Stop(){
        m.StopGasPump(); //calls StopGasPump() in MDAEFSM class
    }
    
    //User selects Receipt
    public void Receipt(){
        m.Receipt(); //calls Receipt() in MDAEFSM class
    }
    
    //User selects No Receipt
    public void NoReceipt(){
        m.NoReceipt(); //calls NoReceipt() in MDAEFSM class
    }
    
    //Getter and setter methods for MDA and Data Store
    public MDAEFSM getMda() {
        return m;
    }

    public void setMda(MDAEFSM m) {
        this.m = m;
    }

    public DataStore getDs() {
        return d;
    }

    public void setDs(DataStore d) {
        this.d = d;
    }

}
