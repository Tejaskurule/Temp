import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int n1){
        int count = 0 ;
        while(n1>0){
            n1 /= 10 ;
            count++;
        }
        return count;
    }


    public static int power(int base,int raise){
        int power = 1 ;
        for(int i = 1;i<=raise;i++){
            power = power * base ;
        }
        return power;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = s.nextInt();
        int sum = 0 ;
        int count =count(num);

        for(int i=num; i != 0; i/=10){
            int rem = i%10;
            sum= sum+power(rem, count);
        }

        if(num==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an armstrong Number");
        }

    }
// This is my comment added and I want to learn git bash cmds
}
