import java.util.*;

public class Main {

    public static void main(String[] args) {
        tree(3,4);
        base();

        Scanner testing = new Scanner(System.in);
        int segments = testing.nextInt();
        System.out.println();
        }


    public static void base(){
        System.out.println("     *\n     *\n  *******");
    }

    public static void tree(int segments, int line){
        for(int series = 1; series <= segments; series++){
            for (int lines = 0; lines < line; lines++) {
                for (int spaces = 0; spaces < 5 - lines; spaces++)
                    System.out.print(" ");
                for (int stars = 0; stars < (2 * lines + 1); stars++)
                    System.out.print("*");
                System.out.println();
            }
        }

    }



}


