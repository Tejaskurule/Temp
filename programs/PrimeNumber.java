import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = s.nextInt();

        int i;
        for(i = 2 ; i < num ; i++){
            if(num%i==0){
                break;
            }
        }

        if(i==num){
            System.out.println(num+" is Prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
