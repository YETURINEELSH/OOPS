package lab1;
import java.util.Scanner;
public class Restaurant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR BILL AMOUNT");
		int baseAmount=sc.nextInt();
		double gst = baseAmount * 0.05;
		double maintainance=baseAmount * 0.02;
		double total=baseAmount+gst+maintainance;
		double discount;
		double discountRate;
		if(total>1000) {
			discountRate=0.10;
			discount=total*discountRate;
		}else {
			discountRate=0.05;
			discount=total*discountRate;
		}
		double Final=total-discount;
		System.out.println("BILL DETAILS");
		System.out.println("BASE AMOUNT Rs: "+baseAmount);
		System.out.println("GST(5%) Rs: "+gst);
		System.out.println("Maintainance Rs: "+maintainance);
		System.out.println("Discount Rs: "+discount);
		System.out.println("FINAL AMOUNT Rs: "+Final);
	}
}