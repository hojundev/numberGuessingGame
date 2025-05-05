import java.util.Random;

public class randomNumber {
    private final Random random = new Random();

    public int chooseNumber(char difficulty) {
        if (difficulty == 'e') {
            return random.nextInt(31);
        } else if (difficulty == 'm') {
            return random.nextInt(61);
        } else if (difficulty == 'h') {
            return random.nextInt(-51, 51);
        }
        return 0;
    }
}