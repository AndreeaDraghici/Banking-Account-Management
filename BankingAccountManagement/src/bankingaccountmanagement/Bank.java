package bankingaccountmanagement;

//@author: AndreeaDraghici
//Date: April,2021

public class Bank {
 
	private String name;
	private String address;
	private double capital;
	
	public String getName() {return name;}
	public void setName(String _name) {this.name=_name;}
	
	public String getAddress() {return address;}
	public void setAddress(String _address) {this.address=_address;}
	
	public double getCapital() {return capital;}
	public void setCapital(double _capital) {this.capital=_capital;}
	
	public Bank(String name, String address, double capital) {
      setName(name);
      setAddress(address);
      setCapital(capital);
  }
}
