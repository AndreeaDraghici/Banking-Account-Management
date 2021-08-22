package bankingaccountmanagement;

//@author: AndreeaDraghici
//Date: April,2021

public class Customer {
	
	private String firstname;
	private String secondname;
	private int id;
	
	public String getFirstName() {return firstname;}
	public void setFirstName(String _firstname) {this.firstname=_firstname;}
	
	public String getSecondName() {return secondname;}
	public void setSecondName(String _secondname) {this.secondname=_secondname;}
	
	public int getId() {return id;}
	public void setId(int _id) {this.id=_id;}
	
	public Customer(String firstname, String secondname, int id) {
      setFirstName(firstname);
      setSecondName(secondname);
      setId(id);
  }
}