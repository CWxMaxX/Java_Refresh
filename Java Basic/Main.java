
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CAR
        // String x = "Hello World Making Cars";
        // System.out.println(x);

        // Car myCar = new Car(25, "CAS 2525", Color.BLUE, true);
        // Car cwxCar = new Car(28, "BDC 2525", Color.RED, true);

        // String myCarLicense = myCar.licensePlate;
        // System.out.println("My car's license plate = " + myCarLicense);
        // System.out.println("CWx car's license plate = " + cwxCar.paintColor);
        // myCar.changeColor(Color.CYAN);
        // System.out.println("My car's new Color: " + myCar.paintColor);
        // System.out.println(myCar.toString());

        // String
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();
        String upperCasedInput = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(upperCasedInput);

        char firstCharacter = userInput.charAt(0);
        System.out.println("First Character of userInput : " + firstCharacter);
        sc.close();

    }
}
