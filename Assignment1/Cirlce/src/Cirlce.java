import java.text.DecimalFormat;
import java.util.Scanner;

public class Cirlce {
public static void main(String[]args){
	double radius = 0;
	double diameter = 0;
	double area = 0;
	
	Scanner reader = new Scanner(System.in); 
	System.out.println("Enter the radius: ");
	radius = reader.nextDouble();
	reader.close();
	
	area = Math.PI * radius * radius;
	diameter = radius * 2;
	
	DecimalFormat formatter = new DecimalFormat("#0.0000");
	
	System.out.println("The cirlce's radius is " + formatter.format(radius) + ", the area is " + formatter.format(area) );
	System.out.println("The diameter is " + formatter.format(diameter) );
	
	
}
}
