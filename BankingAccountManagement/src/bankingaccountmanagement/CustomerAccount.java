package bankingaccountmanagement;

//@author: AndreeaDraghici
//Date: April,2021


public class CustomerAccount {

	private Customer customer;
	private BankAccount bankacc;
	
	public Customer getCustomer() {return customer;}
	public void setCustomer(Customer _customer) {this.customer=_customer;}
	
	public BankAccount getBankAccount() {return bankacc;}
	public void setBankAccount(BankAccount _bankaccount) {this.bankacc=_bankaccount;}
	
	public CustomerAccount(Customer customer, BankAccount bankacc) {
		setCustomer(customer);
		setBankAccount(bankacc);
	}
}