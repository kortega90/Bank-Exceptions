package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Bank;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Bank bank = new Bank(number, holder, balance, withdrawLimit);
		
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			/*double newWithdraw =*/ bank.withdraw(sc.nextDouble());
	        //bank.withdraw(newWithdraw );
			System.out.printf("New balance: %.2f%n",bank.getBanlance());
		}
		
		catch (DomainException e){
			
			System.out.println("Withdraw error: "+ e.getMessage());
			
		}
		
         catch (RuntimeException e){
			
			System.out.println("Unexpected error");
			
		}

		
		
		
		sc.close();
	}
}
