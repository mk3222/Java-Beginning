void main() {
    Random rand = new Random();
    int n = rand.nextInt(10) + 1;
    IO.println("The random number is " + n);

    double y = rand.nextDouble();
    IO.println("The random number is " + y);

    boolean z = rand.nextBoolean();
    IO.println("The boolean is " + z);


}
