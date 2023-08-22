public class Main {
    public static void main(String[] args) {

        GameLogic gamer = new GameLogic();
        while (gamer.getIsRunning()) {
            if (gamer.getUserInput().equals("Normal")) {
                gamer.runNormal();
            } else {
                gamer.runDifficult();
            }
        }
    }
}