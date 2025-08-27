void main() {
    Scanner sc = new Scanner(System.in);


    IO.println("What is your name?");
    String name = sc.nextLine();

    IO.println("How old are you?");
    int age = sc.nextInt();

    IO.println("What is your favorite food?");
    String food = sc.next();


    IO.println("Hello " + name);
    IO.println("Your age is " + age);
    IO.println("Your favorite food is " + food);
}
