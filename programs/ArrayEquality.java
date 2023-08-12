import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {

    //This program is to check to arrays have same values or not..
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of elements of first array : ");
        int n1 = s.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] a = new int[n1];
        for(int i=0;i<n1;i++){
            a[i]=s.nextInt();
        }

        System.out.println("Enter the number of elements of the second array : ");
        int n2 = s.nextInt();

        System.out.println("Enter the elements of the array : ");
        int[] b = new int[n2];
        for(int j=0;j<n2;j++){
            b[j]=s.nextInt();
        }

        boolean status = Arrays.equals(a,b);
        if(status==true){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
