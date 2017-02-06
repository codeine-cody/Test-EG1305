import java.util.Scanner;

public class MilesPerGallon {
	public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the miles driven: ");
	 double miles = reader.nextDouble();
	 System.out.println("Enter the gallons of fuel used: ");
	 double gallons = reader.nextDouble();
	 
	 double MPG = miles / gallons;
	 System.out.println("The miles-per-gallon is: "+ MPG);
	} 
}
