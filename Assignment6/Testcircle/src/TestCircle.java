import java.util.Scanner;

public class TestCircle {
public static void main(String[]args){
	double radius;
	Scanner reader = new Scanner(System.in); 
	System.out.println("Enter the radius of the circle ");
	radius = reader.nextDouble();
	reader.close();
	Circle mycircle = new Circle(radius);
	
	System.out.println("This circle's radius is: " + mycircle.getRadius(radius));
	System.out.println("This circle's diameter is:  " + mycircle.getDiameter(radius));
	System.out.println("This circle's area is:  " + mycircle.getArea(radius));
	System.out.println("This circle's circumference:  " + mycircle.getCircumference(radius));
}
}
