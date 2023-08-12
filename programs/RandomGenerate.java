import java.util.Random;

public class RandomGenerate {
    public static void main(String[] args) {

        Random random = new Random();
        int rNum = random.nextInt(10000,100000);
        System.out.println(rNum);
    }
}
