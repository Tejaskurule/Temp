import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter rows : ");

        int row = s.nextInt();
        int count = 1 ;

        for(int i=row; i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=count;j++){
                System.out.print(count+" ");
            }
            System.out.println();
            count++;
        }
    }
}
