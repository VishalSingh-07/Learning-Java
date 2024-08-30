import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an age: ");
        int age=sc.nextInt();

        if(age>=0 && age<=5){
            System.out.println("Baby");
        }
        else if(age>=6 && age<=11){
            System.out.println("Kid");
        }
        else if(age>=12 && age<=17){
            System.out.println("Teen");
        }
        else if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Invalid");
        }

        System.out.println("Thanks for using this program");
    }
}