package bankingaccountmanagement;

import java.util.Vector;

//@author: AndreeaDraghici
//Date: April,2021


public class BankAccounts {

	private Bank bank;
	
	//that keeps the customer's current bank accounts
	private Vector<CustomerAccount> CurrentAccounts;
	
	public Bank getBank() {return bank;}
	public void setBank(Bank _bank) {this.bank=_bank;}
	
	public Vector<CustomerAccount>getCurrentAccounts() {return CurrentAccounts;}
	public void setCurrentAccounts(Vector<CustomerAccount>_CurrentAccounts) {
		this.CurrentAccounts=_CurrentAccounts;
	}
	
	public BankAccounts(Bank bank, Vector<CustomerAccount>CurrentAccounts) {
		setBank(bank);
		setCurrentAccounts(CurrentAccounts);
	}
}
