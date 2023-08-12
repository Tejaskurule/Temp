import java.util.Scanner;

public class CountOfEvenOddDigits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = s.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        while(num > 0){
            int rem  = num % 10;
            if(rem % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            num = num / 10 ;

        }
        System.out.println("EvenCount : "+evenCount);
        System.out.println("OddCount : "+oddCount);


    }
}
