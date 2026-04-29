void main() {
    double x;
    double y;
    double z;

    Scanner sc = new Scanner(System.in);

    IO.println("Enter side x: ");
    x = sc.nextDouble();
    IO.println("Enter side y: ");
    y = sc.nextDouble();

    z = Math.sqrt(x * x + y * y);

    IO.println("The hypotenuse is " + z);

    sc.close();
}
