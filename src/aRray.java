public class aRray {
    public static void main(String[] args) {
        String[] cars = new String[5];
        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";
        cars[3] = "BMW";
        cars[4] = "BYD";

        // for (int i = 0; i < cars.length; i++) {
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
