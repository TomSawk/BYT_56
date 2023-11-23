public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.playGame();

        System.out.println("----------");

        game = new Football();
        game.playGame();
    }
}
