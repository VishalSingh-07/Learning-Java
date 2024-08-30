import java.awt.*;

// My Solution -
public class Dog {
    String name;
    int age;
    Color dogColor;
    double weight;

    public Dog(String inputName, int inputAge, Color inputDogColor, double inputWeight){
        this.name=inputName;
        this.age=inputAge;
        this.dogColor=inputDogColor;
        this.weight=inputWeight;
    }
    public void bark(){
        System.out.println(name+" says: Woof!");
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }
    public void sleep() {
        System.out.println(name + " is going to sleep.");
    }
    public void rollOver() {
        System.out.println(name + " is rolling over.");
    }

}


// Instructor Solution -

//public class Dog {
//    String name;
//    int age;
//    String [] fetchedItems ={"bone","stick","ball"};
//    private int fetchCounter=0;
//
//    public Dog(String inputName, int inputAge){
//        this.name=inputName;
//        this.age=inputAge;
//    }
//    public void bark(){
//        System.out.println("Bark!");
//    }
//    public int getDogYears() {
//        // Assume 1 Dog year is 7 human years
//        return this.age*7;
//    }
//    public void fetch(){
//        this.fetchCounter=(this.fetchCounter+1)%3;
//        String item=this.fetchedItems[this.fetchCounter];
//        System.out.println(name+" fetched a "+item+".");
//    }
//
//}
