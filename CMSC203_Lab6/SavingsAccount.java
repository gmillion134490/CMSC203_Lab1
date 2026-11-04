/*
 * Name: Gabriela Million
 * Professor: Huseyin Aygun
 * Date: 11/4/2026
 * Class: CMSC203 Lab 6 - Inheritance
 * Description: SavingsAccount is a kind of BankAccount.
 *              It earns interest and has its own account number.
 */
public class SavingsAccount extends BankAccount
{
	// yearly interest rate (2.5%)
	private double rate = 0.025;

	// which savings account this is (0 is the first one)
	private int savingsNumber = 0;

	// this hides the accountNumber from BankAccount
	private String accountNumber;

	// constructor: takes a name and a starting balance
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);   // call the BankAccount constructor
		// super.getAccountNumber() gets the number from BankAccount
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	// copy constructor: makes another savings account for the same person
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);   // call the BankAccount copy constructor
		savingsNumber = oldAccount.savingsNumber + 1;   // one more than the old one
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}

	// adds one month of interest to the balance
	public void postInterest()
	{
		double monthlyInterest = getBalance() * (rate / 12);
		deposit(monthlyInterest);
	}

	// this replaces getAccountNumber from BankAccount
	public String getAccountNumber()
	{
		return accountNumber;
	}
}
