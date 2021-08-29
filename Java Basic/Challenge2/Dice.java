package Challenge2;

import java.util.Random;

public class Dice {
    int num;

    public int rollDice() {
        Random radNum = new Random();
        num = radNum.nextInt(6);
        return num;
    }

    public Dice() {
    }

}
