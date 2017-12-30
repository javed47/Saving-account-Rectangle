//A saving account calculation program
package exercise8;

//Class that contains main method with displaying 12 months calculations
public class SavingsAccountTest {

	public static void main(String[] args)
	{
		//Instanciating two users
		SavingsAccount user1 = new SavingsAccount(2000.00);
		SavingsAccount user2 = new SavingsAccount(3000.00);
		
		//Modifying interest rate
		user1.modifyInterestRate(0.04);
		
		//Displaying user1 and user 2 whole year balance
		displayWholeYear(user1);
		displayWholeYear(user2);
		
		//Displaying user1 and user2 5% rate balance after 1 year 
		user1.modifyInterestRate(0.05);
		displayPerMonth(user1);
		displayPerMonth(user2);
	}

//Display method for 12 months savings
public static void displayWholeYear(SavingsAccount account)
{
	for(int start=1; start <= 12; start++ )
	{
		account.calculateMonthlyInterest();
		System.out.printf("%s%d\t%s%n","for month ", start, account.getBalance());
	}
}

//Display method for 1 month savings
public static void displayPerMonth(SavingsAccount account)
{
	account.calculateMonthlyInterest();
	System.out.printf("%s%s%n","for next month after one year ",  account.getBalance());
}
}

//class for calculating saving account 
class SavingsAccount
{
	//Initialization of variables 
	public static double annualInterestRate;
	private double savingsBalance;
	
	//Constructor
	public SavingsAccount(double balance) 
	{
		this.savingsBalance = balance;
	}
	
	//Calculation
	public void calculateMonthlyInterest()
	{
		savingsBalance += ((savingsBalance*annualInterestRate)/12);
	}
	
	//Modification of annual interest rate
	public void modifyInterestRate (double rate)
	{
		this.annualInterestRate = rate;
	}
	
	//ToString method of the class
	public String getBalance()
	{
		return String.format(
				 "Savings Balance: %.3f $%n", savingsBalance);
	}
}
