import java.util.Scanner;


void main() {
    Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

    int age = 0;
    System.out.println("Enter your age: ");
    sc.nextInt();
    if (age >= 18) {
        IO.println("You are an adult.");
    } else if (age >= 75) {
        IO.println("You are too old.");
    } else {
        IO.println("You are not an adult.");
    }
}
