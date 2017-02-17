import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[]args){
		System.out.print("Enter a year to see if it is a leap year: ");
		Scanner reader = new Scanner(System.in);
		int year = reader.nextInt();
		int month = reader.nextInt();
		
		switch(month){
		case 1: System.out.println("January");
				System.out.println("There is 31 days");
				System.out.println(year);
				break;
				
		case 2: System.out.println("Febuary");
				if(year%4 == 0 && year%100 != 0){
					System.out.println("This is a leap year.");
					System.out.println("There are 29 days.");
					System.out.println(year);
				}
				else{
					System.out.println("This is not a leap year.");
					System.out.println("There is 28 days.");
					System.out.println(year);
				}
				break;
				
		case 3: System.out.println("March");
				System.out.println("There is 31 days.");
				System.out.println(year);
				break;
				
		case 4: System.out.println("April");
				System.out.println("There are 30 days.");
				System.out.println(year);
				break;
				
		case 5: System.out.println("May");
				System.out.println("There are 31 days.");
				System.out.println(year);
				break;
				
		case 6: System.out.println("June");
				System.out.println("There are 30 days.");
				System.out.println(year);
				break;
			
		case 7: System.out.println("July");
				System.out.println("There are 31 days.");
				System.out.println(year);
				break;
		
		case 8: System.out.println("August");
				System.out.println("There are 31 days.");
				System.out.println(year);
				break;
		
		case 9: System.out.println("September");
				System.out.println("There are 30 days.");
				System.out.println(year);
				break;
		
		case 10: System.out.println("October");
				 System.out.println("There are 31 days.");
				 System.out.println(year);
				 break;

		case 11: System.out.println("November");
		 		 System.out.println("There are 30 days.");
		 		 System.out.println(year);
		 		 break;
			
		case 12: System.out.println("December");
				 System.out.println("There are 31 days. ");
				 System.out.println(year);
				 break;
		default:
			System.out.println("Invaild entery");
			break;
			
		}
	}
	}
