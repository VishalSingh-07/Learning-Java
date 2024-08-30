import java.awt.*;

public class Car {

    // Data Types:
    // int -> integer 1,2,3
    // double -> decimal 34.5, 32.1
    // String -> "a1a2" or "Hello World"
    // Color -> From awt library
    // boolean -> True or False

    double averageMilesPerGallon;
    String licencePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(double inputAverageMPG,
               String inputLicencePlate,
               Color inputPaintColor,
               boolean inputAreTailingWorking){

        this.averageMilesPerGallon=inputAverageMPG;
        this.licencePlate=inputLicencePlate;
        this.paintColor=inputPaintColor;
        this.areTailingWorking=inputAreTailingWorking;

    }
    public  void changePaintColor(Color newPaintColor){
        this.paintColor=newPaintColor;
    }
    public double speedingUp(double currentSpeed){
        currentSpeed+=100;
        return currentSpeed;
    }
}