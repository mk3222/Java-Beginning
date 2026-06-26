void main() {
    Scanner sc = new Scanner(System.in);
    int rows;
    int cols;
    String symbols;

    IO.println("Enter the number of rows: ");
    rows = sc.nextInt();
    IO.println("Enter the number of columns: ");
    cols = sc.nextInt();
    IO.println("Enter the symbols to use: ");
    symbols = sc.next();

    for (int i = 1; i <= rows; i++) {
        IO.println();
        for (int j = 1; j <= cols; j++) {
            IO.print(symbols);
        }
    }

}
