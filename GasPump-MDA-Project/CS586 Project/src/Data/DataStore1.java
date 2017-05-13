package Data;
/* 
 * This class acts as an concrete class for storing data of GasPump-1
 */

public class DataStore1 extends DataStore {
	
	//Permanent variables
	private float Rprice, Sprice;
    private float price;
    private float total;
    private int G;
    
    //Temporary variables
    private float temp_a, temp_b;

    //fetch Regular gas price
    public float getRprice1() {
        return Rprice;
    }

    //set Regular gas price
    public void setRprice1(float Rprice1) {
        Rprice = Rprice1;
    }

    //fetch Super gas price
    public float getSprice1() {
        return Sprice;
    }

    //set Super gas price
    public void setSprice1(float Sprice1) {
        Sprice = Sprice1;
    }

    //fetch price of the selected gas by the user 
    public float getPrice1() {
        return price;
    }

    //set price of the selected gas by the user 
    public void setPrice1(float price1) {
        price = price1;
    }

    //fetch gallons pumped by the user
    public int getG() {
        return G;
    }

    //set gallons pumped by the user
    public void setG(int G) {
        this.G = G;
    }

    //fetch price of regular gas stored in temporary variable
    public float getTemp_a() {
        return temp_a;
    }

    //set price of regular gas in temporary variable
    public void setTemp_a(float a) {
        temp_a = a;
    }

    //fetch price of super gas stored in temporary variable
    public float getTemp_b() {
        return temp_b;
    }
    
    //set price of super gas in temporary variable
    public void setTemp_b(float b) {
        temp_b = b;
    }

    //fetch total price of the pumped gas
    public float getTotal1() {
        return total;
    }

    //set total price of the pumped gas
    public void setTotal1(float total1) {
        total = total1;
    }

    @Override
    public int getRprice2() {
        return 0;
    }

    @Override
    public void setRprice2(int Rprice2) {
    }

    @Override
    public int getSprice2() {
        return 0;
    }

    @Override
    public void setSprice2(int Sprice2) {
    }

    @Override
    public int getPprice2() {
        return 0;
    }

    @Override
    public void setPprice2(int Pprice2) {
    }

    @Override
    public int getPrice2() {
        return 0;
    }

    @Override
    public void setPrice2(int price2) {
    }

    @Override
    public int getCash() {
        return 0;    
    }

    @Override
    public void setCash(int c) {
    }

    @Override
    public int getTotal2() {
        return 0;
    }

    @Override
    public void setTotal2(int total2) {
    }

    @Override
    public int getL() {
        return 0;
    }

    @Override
    public void setL(int L) {
    }

    @Override
    public int getTemp_x() {
        return 0;
    }

    @Override
    public void setTemp_x(int a) {

    }

    @Override
    public int getTemp_y() {
        return 0;
    }

    @Override
    public void setTemp_y(int b) {
        
    }

    @Override
    public int getTemp_z() {
        return 0;
    }

    @Override
    public void setTemp_z(int c) {
    }

    @Override
    public int getTemp_cash() {
        return 0;
    }

    @Override
    public void setTemp_cash(int c) {
    }

}
