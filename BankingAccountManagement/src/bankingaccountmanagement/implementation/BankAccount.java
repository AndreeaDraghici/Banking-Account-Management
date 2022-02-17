package bankingaccountmanagement.implementation;

//@author: AndreeaDraghici
//Date: April,2021


public class BankAccount {

	private double balance;
	public BankAccount(double _balance) {balance=_balance;}
	
	//add money
	public void Add(double money) {
		balance+=money;
		System.out.println("You have added the amount of: "+ money);
	}
	
	//withdraw money
	public void Retract(double money) {
		balance-=money;
		System.out.println("You have retracted the amount of: "+money);
	}
	
	//print the balance
	public void Display() {
		System.out.println("Current Balance: "+balance);
	}
	
}
