import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        String symbols = "";

        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols = sc.nextInt();
        System.out.println("Enter the symbols to use: ");
        symbols = sc.next();

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= cols; j++) {
                System.out.print(symbols);
            }
        }

    }
}
