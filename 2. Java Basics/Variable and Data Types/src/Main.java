import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car myCar=new Car(25.5, "1BC32E",
                            Color.BLUE, true);
        Car sallyCar=new Car(13.9, "3D20BN",
                Color.BLACK, false);


        System.out.println("My Car's License Plate: " + myCar.licencePlate);
        System.out.println("My Sally Car's License Plate: " + sallyCar.licencePlate);


        System.out.println("My Car's Old Paint Color: " + myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println("My Car's New Paint Color: " + myCar.paintColor.toString());

    }
}