package MDA;
import MDA.StatePattern.*;
import OutputProcessor.OutputProcessor;

/* Design Pattern implemented: State Pattern 
 * This class acts as MDA-EFSM for both Gas Pump components GasPump-1 and GasPump-2
 */
public class MDAEFSM {
	private State s;
    private State[] LS;
    
    public MDAEFSM(OutputProcessor op)
    {
    	//Keeps track of states
        LS = new State[8];
        
        LS[0] = new S0(this, op);
        LS[1] = new S1(this, op);
        LS[2] = new S2(this, op);
        LS[3] = new S3(this, op);
        LS[4] = new S4(this, op);
        LS[5] = new S5(this, op);
        LS[6] = new S6(this, op);
        LS[7] = new Start(this, op);
        
        s = LS[7];
    }
    
    //changes state from several state classes
    public void ChangeState(int z)
    {
        s = LS[z];
    }
    
    /* *************Methods responsible for State Design Pattern************* */
    
    public void Activate()
    {
        s.Activate(); //calls Activate() of appropriate State class
    }
    
    public void Start()
    {
        s.Start(); //calls Start() of appropriate State class
    }
    
    public void PayCredit()
    {
        s.PayCredit(); //calls PayCredit() of appropriate State class
    }
    
    public void PayCash()
    {
    	s.PayCash(); //calls PayCash() of appropriate State class
    }
    
    public void Reject()
    {
        s.Reject(); //calls Reject() of appropriate State class
    }
    
    public void Approved()
    {
        s.Approved(); //calls Approved() of appropriate of State class
    }
    
    public void Cancel()
    {
        s.Cancel(); //calls Cancel() of appropriate State class
    }
    
    public void SelectGas(int g)
    {
        s.SelectGas(g); //calls SelectGas() of appropriate State class
    }
    
    public void StartPump()
    {
        s.StartPump(); //calls StartPump() of appropriate State class
    }
    
    public void Pump()
    {
        s.Pump(); //calls Pump() of appropriate State class
    }
    
    public void StopGasPump()
    {
        s.StopGasPump(); //calls StopGasPump() of appropriate State class
    }
    
    public void Receipt()
    {
        s.Receipt(); //calls Receipt() of appropriate State class
    }
    
    public void NoReceipt()
    {
        s.NoReceipt(); //calls NoReceipt() of appropriate State class
    }
    
    /* ************************************************ */

}
