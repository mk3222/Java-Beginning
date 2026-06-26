void main() {
    int age = 12;

    if (age >= 75) {
        IO.println("You are too old.");
    } else if (age >= 18) {
        IO.println("You are an adult.");
    } else {
        IO.println("You are not an adult.");
import java.util.Scanner;

class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 75) {
            System.out.println("You are too old.");
        } else if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }

        sc.close();
    }
}