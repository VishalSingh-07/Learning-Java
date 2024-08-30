public class Main {
    public static void main(String[] args) {
        String userInput ="entertainment";
        String uppercased=userInput.toUpperCase();
        System.out.println("Initial String: "+userInput);
        System.out.println("Upper Cased String: "+uppercased);


        char firstCharacter=userInput.charAt(0);
        System.out.println("First Character of Initial String: "+firstCharacter);

        System.out.println("Contains: " + userInput.contains("enter"));
        System.out.println("Contains: " + userInput.contains("Enter"));
        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
    }
}