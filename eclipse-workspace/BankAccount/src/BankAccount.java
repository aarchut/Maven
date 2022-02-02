
import java.util.Scanner;

public class BankAccount {
	 
		int deposit;
		int withdraw;
		int balance;
		int total;

BankAccount(){
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.balance = balance;
		this.total =total;
		
}
	  
	 public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 try {	 
	BankAccount acct = new BankAccount();
	
		 System.out.println("Enter Deposit Amount: ");
		 int deposit = sc.nextInt(); 
		 acct.total = acct.total + deposit;
		 System.out.println("Current Balance: " + acct.total);
		 
		 System.out.println("Eneter Withdraw Amount: ");
		 int withdraw = sc.nextInt();
		 acct.total = acct.total - withdraw;
		 ;
		 
		 if (acct.total  > 0 ) {
			 System.out.println("Current Balance: " + acct.total);
		 }else 
			 
			throw new BalanceException();
		 
		 
	 } catch(BalanceException e) {
		 System.out.println(e);
	 }
		 finally {
			 sc.close();
		 }
	
	}
}



