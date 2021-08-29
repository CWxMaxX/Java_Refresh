package Challenge2;

public class Main {

    public static void main(String[] args) {
        Dice roll = new Dice();
        int faceValue = roll.rollDice();
        int faceValue1 = roll.rollDice();
        int faceValue2 = roll.rollDice();
        int faceValue3 = roll.rollDice();
        System.out.println(faceValue);
        System.out.println(faceValue1);
        System.out.println(faceValue2);
        System.out.println(faceValue3);
    }

}
