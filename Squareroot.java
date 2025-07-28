package lab1;
import java.util.Scanner;
public class Squareroot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=1) {
			for(int i=1;i<n;i++) {
				System.out.println("Sqaure Roots are"+i+"="+Math.sqrt(i));
			}
			}else{
				System.out.println("invalid number");
		}
		sc.close();
	}

}