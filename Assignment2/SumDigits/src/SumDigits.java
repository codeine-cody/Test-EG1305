import java.util.Scanner;
public class SumDigits {
public static void main(String[]args){
	
	 Scanner input = new Scanner(System.in); 
	 
	    System.out.print("Enter a number between 0 and 1000: ");
	    int num = input.nextInt();
	    input.close();

	    int ones = num % 10;

	    int tens = (num / 10) % 10 ;

	    int houndreds =(num / 100) % 10;

	    int answer = ones + tens + houndreds;

	    System.out.print("The sum of the digit is " + answer);
}
}