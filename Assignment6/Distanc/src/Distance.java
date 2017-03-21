import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Distance {
	public static void main(String[]args){
		
		 NumberFormat numberFormat = new DecimalFormat("#,###.00");
		 
		System.out.println("The program will calculate the distance between two points");
		
		System.out.println("Please enter the x and y values for the first point");
		Scanner reader = new Scanner(System.in);
		System.out.print("x: ");
		double x1 = reader.nextDouble();
		System.out.print("y: ");
		double y1 = reader.nextDouble();
		
		System.out.println("Please enter the x and y values for the second point");
		System.out.print("x: ");
		double x2 = reader.nextDouble();
		System.out.print("y: ");
		double y2 = reader.nextDouble();

		
		reader.close();
		
		System.out.println("The distance beteewn these two points is " + numberFormat.format(getDistance(x1,x2,y1,y2)));
	}
public static double getDistance(double x1, double x2, double y1, double y2){
	return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
}
}
