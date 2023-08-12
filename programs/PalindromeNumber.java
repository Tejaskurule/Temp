import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = s.nextInt();
        int temp = num;
        int rev = 0 ;

        while(num != 0){
            rev =  rev*10 + num %10 ;
            num = num / 10 ;
        }
        if(temp == rev){
            System.out.println("Number is palindrome .");
        }
        else{
            System.out.println("Number is not a palindrome .");
        }
    }
}
