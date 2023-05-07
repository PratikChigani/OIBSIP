import java.util.*;

public class GuessTheNumber {

    public static void startTheGame() {
        // Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = (int) (random.nextDouble() * 100);

        System.out.println("Random number has been generated, now guess the number: ");

    }

    public static void main(String[] args) {
        startTheGame();
    }
}
