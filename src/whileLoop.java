void main() {
    Scanner sc = new Scanner(System.in);
    String name = "";

    while (name.isBlank()) {
        IO.print("Enter your name: ");
        name = sc.nextLine();
    }
    IO.println("Hello, " + name);
}

