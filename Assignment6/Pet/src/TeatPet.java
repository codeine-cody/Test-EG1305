import java.util.Scanner;

public class TeatPet {
public static void main(String[]args){
	Scanner reader = new Scanner(System.in);
	Pet mypet = new Pet();
	System.out.println("Please enter your pet's name");
	mypet.name = reader.next();
    System.out.println("Please enter your pet's type ");
	mypet.type = reader.next();
   	System.out.println("Please enter your pet's age ");
	mypet.age = reader.nextInt();
	reader.close();
	System.out.println("Pet object created");
	System.out.println("Your pet's name is " + mypet.getName() );
	System.out.println("Your pet's type is " + mypet.getType() );
	System.out.println("Your pet's age is " + mypet.getAge() );
}
}
