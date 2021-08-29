import java.awt.*;

public class Car {

    // Data Types
    // int
    // double
    // String
    // boolean

    // awt Library
    // Color

    int avavarageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailLightWorking;

    public Car(int avavarageMilesPerGallon, String licensePlate, Color paintColor, boolean areTailLightWorking) {
        this.avavarageMilesPerGallon = avavarageMilesPerGallon;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.areTailLightWorking = areTailLightWorking;
    }

    public void changeColor(Color newColor) {
        this.paintColor = newColor;
    }

    public String toString() {
        String str = this.licensePlate + "," + this.avavarageMilesPerGallon + "," + this.paintColor + ","
                + this.areTailLightWorking;
        return str;
    }

}
