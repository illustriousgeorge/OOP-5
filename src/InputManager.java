import java.util.Scanner;

public enum InputManager {
    INSTANCE;

    public static String loadInput(){

        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}