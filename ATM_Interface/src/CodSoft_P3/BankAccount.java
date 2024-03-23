package CodSoft_P3;

import java.util.Scanner;

class BankAccount{
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public double getBalance() {
		return balance;
	}

	
	public void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount;
			System.out.println("Amount Deposited Successfully.New Balance:" + balance);
		}else {
			System.out.println("Invalid Deposit Amount.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance = balance-amount;
			System.out.println("Withdrawal Successful.New Balance:" + balance);
		}else {
			System.out.println("Invalid Amount or Insufficient Balance");
		}
	}
}

class ATM{
	private BankAccount bankAccount;
	private Scanner scanner;
	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
		this.scanner = new Scanner(System.in);
	}
	
	public void displayMenu() {
		System.out.println("ATM Menu");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
	}

	public void start() {
		int choice;
		do {
			displayMenu();
			System.out.println("Enter your choice: ");
		    choice = scanner.nextInt();
		    switch(choice) {
		    case 1:
		    	checkBalance();
		    	break;
		    case 2:
		    	deposit();
		    	break;
		    case 3:
		    	withdraw();
		    	break;
		    case 4:
		    	System.out.println("Thank you for using the ATM");
		    	break;
		    default:
		    	System.out.println("Invalid choice.Please select a valid option.");	
		    }
		}while(choice!=4);
		scanner.close();
	}

	private void checkBalance() {
		System.out.println("Your current balance is: " + bankAccount.getBalance());
	}
	
	private void deposit() {
		System.out.println("Enter amount to deposit: ");
		double depositAmount = scanner.nextDouble();
		bankAccount.deposit(depositAmount);
	}
	
	private void withdraw() {
		System.out.println("Enter amount to withdraw: ");
		double withdrawAmount = scanner.nextDouble();
		bankAccount.withdraw(withdrawAmount);
	}
}


class ATM_Interface{
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your PIN");
		int PIN = scanner.nextInt();
		
		BankAccount userAccount = new BankAccount(1000.0);
		ATM atm = new ATM(userAccount);
		
		atm.start();
		scanner.close();
		        
	}
}
		

	

	
	
	
	
	
	
