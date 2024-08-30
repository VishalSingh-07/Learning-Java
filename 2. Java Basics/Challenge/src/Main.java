import java.awt.*;

// My Solution -
public class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("Buddy", 3, Color.BLACK, 30.0);

        dog1.bark();
        dog1.eat("Eggs");
        dog1.sleep();
        dog1.rollOver();
    }
}


//import java.awt.*;
// Instructor Solution -
//public class Main {
//    public static void main(String[] args) {
//        Dog d=new Dog("Buddy", 3);
//
//        d.bark();
//
//        int dogYears=d.getDogYears();
//        System.out.println(dogYears+" dog years.");
//
//        d.fetch();
//        d.fetch();
//        d.fetch();
//        d.fetch();
//    }
//}