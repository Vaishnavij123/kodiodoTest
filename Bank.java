package cjcTestQ2;

import java.util.Scanner;

public class Bank {
	
	Scanner sc=new Scanner(System.in);
	public void deposit (double amount) throws InvalidAmountException 
	{
		
		
		System.out.println("Please Enter Amount");
		double d=sc.nextDouble();
		if(d<0)
		{
			throw new InvalidAmountException("Amont is not valid");
			
		}
		else {
			System.out.println(d);
			
		}
	
	}
	public static void main(String[] args) throws InvalidAmountException
	{
		Bank b=new Bank();
		b.deposit(1);
		
	
				
	}
	
}
