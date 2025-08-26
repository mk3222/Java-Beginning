public class _2DaRray {
    public static void main(String[] args) {

        String[][] cars = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"}
        };


        for (String[] car : cars) {
            System.out.println();
            for (String s : car) {
                System.out.print(s + " ");
            }
        }

        /*    String[][] cars = new String[3][3];
        cars[0][0] = "A";
        cars[0][1] = "B";
        cars[0][2] = "C";
        cars[1][0] = "D";
        cars[1][1] = "E";
        cars[1][2] = "F";
        cars[2][0] = "G";
        cars[2][1] = "H";
        cars[2][2] = "I";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }
        */

    }
}
