import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {

        int temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Before Swapping :");
        int x = s.nextInt();
        int y = s.nextInt();

        System.out.println("Before Swapping :"+"x : "+x+" y : "+y);

        System.out.println("After Swapping :");

        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping :"+"x : "+x+" y : "+y);






    }
}
