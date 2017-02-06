import java.text.*;
import java.math.*;
import java.util.Scanner;

public class CountMoney {
public static void main(String[]args){
	System.out.println("Enter an amount in integer: ");
	
	Scanner reader = new Scanner(System.in); 
	 int amount = reader.nextInt();
	 reader.close();
	 
	 int hundredth = amount % 100;
	 
	 int whole = (amount - hundredth) / 100;
	 
	 System.out.println(whole);
	 System.out.println(hundredth);
	 System.out.println("The amount entered is " + whole + " dollars "+ "and "+ hundredth+ " cents");
	 
	 int quarters = hundredth/25;
	 int deci = hundredth - 25*quarters;
	 int dimes = (deci)/10;
	 	deci = deci - 10*dimes;
	 int nickels = (deci)/5;
	 	deci = deci - 5*nickels;
	 int pennies = (deci)/1;
	 	
	 
	 System.out.println(" dollars: " + whole);
	 System.out.println(" quarters: " + quarters);
	 System.out.println(" dimes: " + dimes);
	 System.out.println(" nickels: " + nickels);
	 System.out.println("pennies: " + pennies);
}
}
