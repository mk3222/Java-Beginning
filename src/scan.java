import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        System.out.println("What is your favorite food?");
        String food = sc.next();


        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your favorite food is " + food);
    }
}
