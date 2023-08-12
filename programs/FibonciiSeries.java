import java.util.Scanner;

public class FibonciiSeries {
    public static void main(String[] args) {

        int num1  = 0;
        int num2 = 1 ;
        int temp = 0;

        System.out.println("Enter the number :");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.print(num1);

        while(temp<num){
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            temp = temp + 1 ;

            System.out.print(" "+num3);
        }
    }
}
