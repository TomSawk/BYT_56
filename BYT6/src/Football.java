public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Get ready to kick off.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Let's play!");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Over!");
    }
}
