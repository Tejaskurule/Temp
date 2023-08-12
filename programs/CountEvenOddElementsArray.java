import java.util.Scanner;

public class CountEvenOddElementsArray {
    public static void main(String[] args) {
        System.out.println("Enter the number of Elements :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter Elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();

            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("evenCount : "+evenCount);
        System.out.println("oddCounr : "+oddCount);
    }
}
