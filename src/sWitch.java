public class sWitch {
    public static void main(String[] args) {
        String day = "Friday";

        switch (day) {
            case "Sunday":
                System.out.println("It is a Sunday");
                break;
            case "Monday":
                System.out.println("It is a Monday");
                break;
            case "Tuesday":
                System.out.println("It is a Tuesday");
                break;
            case "Wednesday":
                System.out.println("It is a Wednesday");
                break;
            case "Thursday":
                System.out.println("It is a Thursday");
                break;
            case "Friday":
                System.out.println("It is a Friday");
                break;
            case "Saturday":
                System.out.println("It is a Saturday");
                break;
            default:
                System.out.println("It is not a day");

        }
    }
}
