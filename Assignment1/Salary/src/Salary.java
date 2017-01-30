import java.util.Scanner;

public class Salary {
public static void main(String[]args){
	String name = "\0";
	int age = 0;
	double annualPay = 0;
	
	Scanner reader = new Scanner(System.in); 
	System.out.println("Enter your name:");
	 name = reader.nextLine();
	 System.out.println("Enter your age:");
	 age = reader.nextInt();
	 System.out.println("Enter your anuual pay:");
	 annualPay = reader.nextDouble();
	reader.close();
	
	System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualPay + " per year.");
}
}
