public class PositiveOrNegative {
    public static void main(String[] args) {

        checkNumber(-5);
    }

    private static void checkNumber(int Number) {

        if(Number > 0){
            System.out.println("Number is positive");
        }else if(Number < 0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
