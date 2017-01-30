
public class StockTransaction {
public static void main(String[]args ){
	int shares = 1000;
	double sprice = 33.92;
	double COMMISSION_RATE = .02;
	double bprice = 32.87;
	double profit = 0;
	double sold = 0;
	double brought = 0;
	double scommissionFee = 0;
	double bcommissionFee = 0;
	
	brought = bprice * shares;
	sold = sprice * shares;
	scommissionFee = COMMISSION_RATE * sold;
	bcommissionFee = COMMISSION_RATE * brought;
	profit = sold - brought - scommissionFee - bcommissionFee;
	
	System.out.println("The amount of money Joe paid for the stock: " + brought);
	
	System.out.println("The amount of commission Joe paid for the stock: " + bcommissionFee);
	
	System.out.println("The amount that Joe sold the stock for: " + sold);
	
	System.out.println("The amount of commission Joe paid his broker when he sold the stock: " + scommissionFee);
	
	System.out.println("The amount of profit that Joe made after selling his stock and paying the two commissions to his broker: " + profit);
	
	
}
}
