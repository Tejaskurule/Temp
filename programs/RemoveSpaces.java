import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = s.nextLine();

        System.out.println("Original String : "+ str);

        String output = str.replaceAll("\\s+","");
        System.out.println("String without spaces : "+ output);
    }
}
