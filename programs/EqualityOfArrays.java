import java.util.Arrays;

public class EqualityOfArrays {
    public static void main(String[] args) {

        int[] a = new int[]{1,2,3,4,5};
        char b[] = new char[]{'a','b','c','d','e'};
        int c[] = new int[]{1,2,3,4,5};
        char d[] = new char[]{'f','g','h','i','j'};


        System.out.println(Arrays.equals(a,c));
        System.out.println(Arrays.equals(b,d));


    }
}
