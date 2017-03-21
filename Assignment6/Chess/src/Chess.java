import java.math.BigInteger;

public class Chess {
public static void main(String[]args){
	int rice = 2;
	int squares = 64;
	BigInteger total = BigInteger.ZERO;
	long squareValue = 0;
	int i;
	for(i = 0; i < squares; i++){
		squareValue = (long)Math.pow(rice,i);
		total = total.add(BigInteger.valueOf(squareValue));
	}
	System.out.println("The number of grains on the last square is " + Math.pow(rice,63));
	System.out.println("The total grains of wheat to cover the whole board is " + total);
}
}
