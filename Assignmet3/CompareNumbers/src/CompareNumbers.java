import java.util.Scanner;
public class CompareNumbers {
public static void main(String[]args){
	System.out.println("Enter first integer: ");
	Scanner reader = new Scanner(System.in);
	int first = reader.nextInt();
	System.out.println("Enter first integer: ");
	int second = reader.nextInt();
	System.out.println("Enter first integer: ");
	int third = reader.nextInt();
	reader.close();
	System.out.println("For the numbers " + first +", " + second + " and " + third );
	int largest = third;
	int smallest = second;
	
	if(first > third){
		largest = first; 
	}
	if(first > second){
		int temp = first;
	 if(temp > largest)
		 largest = temp;
	}
	else
		if(second > third)
		largest = second;
	if(second > first){
		smallest = first;
	}
 int sum = first + second + third;
 int product = first * second * third;
 int average = sum / 3;
 
 System.out.println("Largest is " + largest);
 System.out.println("Smallest is " + smallest);
 System.out.println("Sum is " + sum);
 System.out.println("Product is " + product);
 System.out.println("Average is " + average);
}
}