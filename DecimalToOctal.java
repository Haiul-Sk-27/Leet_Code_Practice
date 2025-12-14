import java.util.*;

public class DecimalToOctal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number");
        int inputNumber = sc.nextInt();
        int copyOfNumber = inputNumber;
        String octal ="";
        int rem = 0;
        
        while(inputNumber > 0){
            rem = inputNumber % 8;
            octal  = rem + octal;
            inputNumber = inputNumber / 8;
        }
        
        System.out.println("Octal equvalent of "+copyOfNumber+"IS"+octal);
        
    }
}