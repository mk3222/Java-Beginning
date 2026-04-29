void main() {
    Scanner sc = new Scanner(System.in);

    IO.println("You are playing a game! Press q or Q to quit");
    String response = sc.next();
    if (response.equals("q") && !response.equals("Q")) {
        IO.println("You quit the game");
    } else {
        IO.println("You are still playing the game *pew pew*");
    }
}

