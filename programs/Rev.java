import java.util.Scanner;

public class Rev {

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner s = new Scanner(System.in);
        int num = s .nextInt();

        int rev = 0;
        //    StringBuilder sb = new StringBuilder(String.valueOf(num));
        //    StringBuilder rev = sb.reverse();
        while(num > 0){
            rev = rev *10 + num %10;
            num/=10;
        }
        System.out.println(rev);
    }
}
