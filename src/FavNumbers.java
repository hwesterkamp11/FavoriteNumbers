import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int integer = SafeInput.getInt(scan, "Enter your favorite integer");
        double doubleidk = SafeInput.getDouble(scan, "Enter your favorite double");
        System.out.println("You said " + integer + " was your favorite integer.\nYou said " + doubleidk + " was your favorite double.");
    }
}
