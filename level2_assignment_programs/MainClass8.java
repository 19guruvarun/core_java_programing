class MainClass8 
{
	public static void main(String[] args) 
	{
		System.out.println("Bank Account Transactions");
		Transaction.logTransaction();
		Transaction t=new Transaction();
		t.processTransaction();
	}
}
class Bank 
{
	public void openAccount() 
	{
		System.out.println("open a account ");
		Account.displayAccountDetails();
	}
	public void closeAccount() 
	{
		System.out.println("close the account ");
	}
	public static void checkBalance() 
	{
		System.out.println("check balance amount 10000");
		Account.transferFunds();
	}
}
class Account 
{
	public static void displayAccountDetails() 
	{
		System.out.println("Name Varun");
		System.out.println("AccType savings");
		Bank.checkBalance();
	}
	public static void transferFunds() 
	{
		System.out.println("Transfering funds of 3000" );
	}
}
class Transaction 
{
	public static void logTransaction() 
	{
		System.out.println("logging into Transaction");
		Bank b=new Bank();
		b.openAccount();
	}
	public void processTransaction() 
	{
		System.out.println("Transaction is in process");
		Bank b=new Bank();
		b.closeAccount();
	}
}

