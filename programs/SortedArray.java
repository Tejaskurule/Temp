import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {

        System.out.println("Enter number the elements : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Elements in the sorted order : " );

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
