package MDA.StatePattern;
import MDA.MDAEFSM;
import OutputProcessor.OutputProcessor;
//import AbstractFactory.*;
//import Data.*;
/* Design Pattern implemented: State Pattern 
 * This class acts as an abstract class for several other state classes which extends this class
 */

public abstract class State {
	MDAEFSM m;
    OutputProcessor o;
    
    
    public void Activate()
    {     
    }
    
    public void Start()
    {   
    }
    
    public void PayCredit()
    {   
    }
    
    public void PayCash()
    {  	
    }
    
    public void Reject()
    {   
    }
    
    public void Approved()
    {   
    }
    
    public void Cancel()
    {   
    }
    
    public void SelectGas(int g)
    {   
    }
    
    public void StartPump()
    {   
    }
    
    public void Pump()
    {   
    }
    
    public void StopGasPump()
    {   
    }
    
    public void Receipt()
    {   
    }
    
    public void NoReceipt()
    {
    }

    //getter and setter methods
    public MDAEFSM getMda() {
        return m;
    }

    public void setMda(MDAEFSM m) {
        this.m = m;
    }

    public OutputProcessor getOp() {
        return o;
    }

    public void setOp(OutputProcessor o) {
        this.o = o;
    }

}
