package lab1;
import java.util.Scanner;
public class TomandJerry{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Tom;
		Tom=sc.nextInt();
		int Jerry;
		Jerry=sc.nextInt();
		System.out.println("Before Swapping"+Tom+" "+Jerry);
		int temp;
		temp=Tom;
		Tom=Jerry;
		Jerry=temp;
		System.out.println("After Swapping"+Tom+" "+Jerry);
		
	}
}
