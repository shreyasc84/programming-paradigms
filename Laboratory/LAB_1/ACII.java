import java.util.Scanner;
public class ACII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char user_input = input.next().charAt(0);
        int acii_value = (int) user_input;
        System.out.println("ACII value of "+user_input+" is: "+acii_value);

    }
}
