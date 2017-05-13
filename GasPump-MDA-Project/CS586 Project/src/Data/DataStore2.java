package Data;
/* 
 * This class acts as an concrete class for storing data of GasPump-2
 */
public class DataStore2 extends DataStore {
	
	//Permanent variables
	private int Rprice, Sprice, Pprice;
    private int price;
    private int cash;
    private int total;
    private int L;
    
    //Temporary variables
    private int temp_x, temp_y, temp_z;
    private int temp_cash;

    //fetch Regular gas price
    public int getRprice2() {
        return Rprice;
    }

    //set Regular gas price
    public void setRprice2(int Rprice2) {
        Rprice = Rprice2;
    }

    //fetch Super gas price
    public int getSprice2() {
        return Sprice;
    }
    
    //set Super gas price
    public void setSprice2(int Sprice2) {
        Sprice = Sprice2;
    }

    //fetch Premium gas price
    public int getPprice2() {
        return Pprice;
    }

    //set Premium gas price
    public void setPprice2(int Pprice2) {
        Pprice = Pprice2;
    }

    //fetch price of the selected gas by the user
    public int getPrice2() {
        return price;
    }

    //set price of the selected gas by the user
    public void setPrice2(int price2) {
        price = price2;
    }

    //fetch cash deposited by the user
    public int getCash() {
        return cash;
    }

    //set cash deposited by the user
    public void setCash(int c) {
        cash = c;
    }

    //fetch total price of the pumped gas
    public int getTotal2() {
        return total;
    }

    //set total price of the pumped gas
    public void setTotal2(int total2) {
        total = total2;
    }

    //fetch liters pumped by the user
    public int getL() {
        return L;
    }

    //set liters pumped by the user
    public void setL(int L) {
        this.L = L;
    }

    //fetch price of regular gas stored in temporary variable
    public int getTemp_x() {
        return temp_x;
    }
    
    //set price of regular gas in temporary variable
    public void setTemp_x(int a) {
        this.temp_x = a;
    }

    //fetch price of super gas stored in temporary variable
    public int getTemp_y() {
        return temp_y;
    }

    //set price of super gas in temporary variable
    public void setTemp_y(int b) {
        temp_y = b;
    }

    //fetch price of premium gas stored in temporary variable
    public int getTemp_z() {
        return temp_z;
    }

    //set price of premium gas in temporary variable
    public void setTemp_z(int c) {
        temp_z = c;
    }

    //fetch cash deposited by the user stored in temporary variable
    public int getTemp_cash() {
        return temp_cash;
    }

    //set cash deposited by the user in temporary variable
    public void setTemp_cash(int c) {
        temp_cash = c;
    }

    @Override
    public float getRprice1() {
        return 0;
    }

    @Override
    public void setRprice1(float Rprice1) {
    }

    @Override
    public float getSprice1() {
        return 0;
    }

    @Override
    public void setSprice1(float Sprice1) {
    }

    @Override
    public float getPrice1() {
        return 0;
    }

    @Override
    public void setPrice1(float price1) {
    }

    @Override
    public float getTotal1() {
        return 0;
    }

    @Override
    public void setTotal1(float total1) {
    }

    @Override
    public int getG() {
        return 0;
    }

    @Override
    public void setG(int G) {
    }

    @Override
    public float getTemp_a() {
        return 0;
    }

    @Override
    public void setTemp_a(float a) {
    }

    @Override
    public float getTemp_b() {
        return 0;
    }

    @Override
    public void setTemp_b(float b) {
    }

}
