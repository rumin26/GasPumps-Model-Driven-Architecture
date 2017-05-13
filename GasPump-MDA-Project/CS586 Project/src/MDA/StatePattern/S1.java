package MDA.StatePattern;
import MDA.*;
import OutputProcessor.*;

/* Design Pattern implemented: State Pattern 
 * This class extends State Class
 */
public class S1 extends State {
	
	public S1(MDAEFSM m, OutputProcessor o)
    {
        this.m = m;
        this.o = o;
    }
	
    /* ****** State Patter***** */
    public void PayCredit()
    {
  
    	m.ChangeState(2); //change state to S2
    	System.out.println("State 2 reached!");

    }
    
    public void PayCash()
    {
    
        o.DisplayMenu(); //Displays Menu from Output Processor
        o.StoreCash(); //Stores deposited Cash from Output Processor
        m.ChangeState(3); //change state to S3
    	System.out.println("State 3 reached!");

            
    }
    
    /* ************ */

}
