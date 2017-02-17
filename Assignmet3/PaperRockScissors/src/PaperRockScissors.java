import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors {
public static void main(String[]args){
	Random rand = new Random();

	int computer = rand.nextInt(4);
	  System.out.println("scissors (0), rock (1), paper (2) : ");
	  Scanner reader = new Scanner(System.in);
	  int player = reader.nextInt();
	  reader.close();
	  
	  if(player == 0 && computer == 2){
		  System.out.println("You win: Scissors beats paper");
	  }
	  if(player == 1 && computer == 0){
		  System.out.println("You win: Rock beats scissors");
	  }
	  if(player == 2 && computer == 1){
		  System.out.println("You win: Paper beats rock");
	  }
	  if(player == 2 && computer == 0){
		  System.out.println("You lose: Scissors beats paper");
	  }
	  if(player == 0 && computer == 1){
		  System.out.println("You lose: Rock beats scissors");
	  }
	  if(player == 1 && computer == 2){
		  System.out.println("You lose: Paper beats rock");
	  }
	  if(player == computer){
		  System.out.println("Tie");
	  }
	  
}
}
