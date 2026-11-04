/*
 * Name: Gabriela Million
 * Professor: Huseyin Aygun
 * Date: 11/4/2026
 * Class: CMSC203 Lab 6 - Inheritance
 * Description: CheckingAccount is a kind of BankAccount.
 *              It charges a small fee every time you withdraw (clear a check).
 */
public class CheckingAccount extends BankAccount
{
	// the cost of clearing one check (15 cents)
	public static final double FEE = 0.15;

	// constructor: takes a name and a starting amount
	public CheckingAccount(String name, double amount)
	{
		super(name, amount);   // call the BankAccount constructor
		// add -10 to the end of the account number
		// (we use the set method because accountNumber is private in BankAccount)
		setAccountNumber(getAccountNumber() + "-10");
	}

	// withdraw: same heading as BankAccount, but it also adds the fee
	public boolean withdraw(double amount)
	{
		return super.withdraw(amount + FEE);
	}
}
