import java.util.Scanner;

public class SumOfElementsArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n = s.nextInt();

        System.out.println("Enter numbers : ");
        int[] arr = new int[n];

        int sum = 0 ;

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();

            sum = sum + arr[i];
        }
        System.out.println("Sum of elements is : "+sum);
    }
}
