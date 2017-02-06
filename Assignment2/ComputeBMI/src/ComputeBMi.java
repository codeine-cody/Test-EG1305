import javax.swing.JOptionPane; 

public class ComputeBMi {
	public static void main(String[]args){
		String pounds = JOptionPane.showInputDialog("Please input your weight in pounds: ");

	    String height = JOptionPane.showInputDialog("Please input your height in inches: ");
	    

        double kilo = Double.parseDouble(pounds)*0.45359237;
        double meter = Double.parseDouble(height)*0.0254;
        double BMI = kilo / meter;
        
        System.out.println("Your Body Mass Index is: "+ BMI);
	}
}
