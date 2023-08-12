import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        int rem = 1;
        int n = num;
        int sum = 0;

        while(n > 9){
            while (n > 0){

                rem = n % 10 ;
                sum = sum + rem ;

                n = n /10 ;
            }

            n = sum ;
            sum = 0 ;
      }

        if(n == 1 ){
            System.out.println("Magic number ");
        }else
        {
            System.out.println("Not a magic number");
        }
    }
}
