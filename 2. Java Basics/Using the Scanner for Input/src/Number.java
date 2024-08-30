import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input Integer Number: ");
        int userNumber = sc.nextInt();
        System.out.println("Integer Number: " + userNumber);
        System.out.print("Enter the input Double Number: ");
        double userNumber2 = sc.nextDouble();
        System.out.println("Double Number: " + userNumber2);
    }
}
