package encapsulationPackage;

import java.util.Scanner;

class BankAccount 
{
	private long accountNumber;
	private double balance;
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter bank account number: ");
		long accountNumber=sc.nextLong();
		b.setAccountNumber(accountNumber);
		System.out.println("Your Succesfully logged in your account: "+b.getAccountNumber());
		b.setBalance(200000000);
		b1.setBalance(5000000);
		if(accountNumber>200000000)
		{
			System.out.println("Your account balance is: "+b.getBalance());
		}
		else
		{
			System.out.println("Your account balance is: "+b.getBalance());
		}
	}

}
