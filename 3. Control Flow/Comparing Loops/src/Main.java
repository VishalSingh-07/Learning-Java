public class Main {
    public static void main(String[] args) {

        // While Loop
        System.out.println("While Loop");
        int x=3;
        while(x>0){
            System.out.println("Current x: "+x);
            x=x-1;
        }
        System.out.println("Final x: "+x);
        System.out.println();


        // Do While Loop
        System.out.println("Do While Loop");
        int y=3;
        do{
            System.out.println("Current y: "+y);
            y=y-1;
        }while(y>0);
        System.out.println("Final y: "+y);
        System.out.println();


        // For Loop
        System.out.println("For Loop");
        for(int i=3;i>0;i--){
            System.out.println("Current i: "+i);
        }
        System.out.println();
    }
}