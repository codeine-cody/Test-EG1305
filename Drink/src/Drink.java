
public class Drink {
public static void main(String[]args){
	int Sample = 12467;
	double approx = 0;
	double weekly = .14;
	double citrus = .64;
	
	approx = Sample * weekly;
	
	System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week: " + approx);
	
	approx = Sample * citrus;
	System.out.println("The approximate number of customers in the survey who perfer citrus flavored energy drinks: " + approx);
}
}
