import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number :");

        int num = s.nextInt();
        int sum = 0;

        while(num != 0){
            sum = sum + num%10;
            num/=10;

        }
        System.out.println(sum);

    }
}
