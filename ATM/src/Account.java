import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance;
	private double savingBalance;
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public double calcCheckingWithdrawal(double amount) {
		checkingBalance = (checkingBalance-amount);
		return checkingBalance;
	}
	public double calcSavingWithdrawal(double amount) {
		savingBalance = (savingBalance-amount);
		return savingBalance;
	}
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance+amount);
		return checkingBalance;
	}
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance+amount);
		return savingBalance;
	}
	public void getCheckingWithdrawalInput() {
		System.out.println("Checking account Balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from checking Account");
		double amount = input.nextInt();
		if((checkingBalance-amount)>=0) {
			calcCheckingWithdrawal(amount);
			System.out.println("New checking account Balance"+ moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance can not be negative"+"\n");
		}
	}

public void getSavingWithdrawInput() {
	System.out.println("Checking account Balance"+moneyFormat.format(checkingBalance));
	System.out.println("Amount you want to withdraw from checking Account");
	double amount = input.nextInt();
	if((savingBalance-amount)>=0) {
		calcSavingWithdrawal(amount);
		System.out.println("New saving account Balance"+ moneyFormat.format(savingBalance));
	}else {
		System.out.println("Balance can not be negative"+"\n");
	}
}	
	public void getCheckingDepositInput() {
		System.out.println("Checking account Balance"+moneyFormat.format(checkingBalance));
		System.out.println("Amount you want to deposit from checking Account");
		double amount = input.nextDouble();
		if((checkingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking account balance"+ moneyFormat.format(checkingBalance));
		}	else {
			System.out.println("Balance can not be negative"+"\n");
		}
	}
	public void getSavingDepositInput() {
		System.out.println("Saving account balance"+moneyFormat.format(savingBalance));
		System.out.println("Amount you want to deposit from saving account");
		double amount = input.nextDouble();
		if((savingBalance+amount)>=0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Acoount balance"+moneyFormat.format(savingBalance));
		}else {
			System.out.println("Balance can not be negative"+"\n");
		}
	}
}