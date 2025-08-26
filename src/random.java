import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10)+1;
        System.out.println("The random number is " + n);

        double y = rand.nextDouble();
        System.out.println("The random number is " + y);

        boolean z = rand.nextBoolean();
        System.out.println("The boolean is " + z);


    }
}
