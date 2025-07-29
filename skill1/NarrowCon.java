package skill1;
import java.util.Scanner;

public class NarrowCon{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        
        int intValue = (int) doubleValue; // explicit casting
        
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted int value: " + intValue);
        
        scanner.close();
    }
}

