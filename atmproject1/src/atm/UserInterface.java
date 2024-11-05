package atm;

import java.util.Scanner;

public class UserInterface {
	
	
    private static int status;
	public static void main(String[] args) {
		AtmoperationImpl impl = new AtmoperationImpl();
		Scanner scan = new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("Welcome to ATM Machine");
		System.out.println("ENTER THE ATM NUMBER");
		int atmnum1=scan.nextInt();
		System.out.println("ENTER THE ATM PIN");
		int atmpin1=scan.nextInt();
		
		if(atmnumber==atmnum1 && atmpin==atmpin1) {
			while(true) {
			System.out.println(" 1.viewAvailable Balance\n 2.WithdrawAmount\n 3.Deposit Amount\n 4.Mini Statement\n 5.exit");
			System.out.println("Enter the choice");

			int ch=scan.nextInt();
			
			if(ch==1) {
				impl.viewBalance();
				
			}else if(ch==2){
				System.out.println("Enter the Amount Withdrawn ");
				double withdrawAmount = scan.nextDouble();
				impl.withdrawAmount(withdrawAmount);
				
			}else if(ch==3){
				System.out.println("Enter the Amount to Deposit ");
				double depositAmount = scan.nextDouble();
				impl.depositAmount(depositAmount);
			}else if(ch==4){
				impl.viewMiniStatement();
				
			}else if(ch==5){
				System.out.println("Collect Your ATM card \nThank You!!");
				System.exit(status);
			}
				
			}
			
		}else {
			System.out.println("ENTER CORRECT ATM NUMBER OR ATM PIN");
			
		}
		

	}

}
