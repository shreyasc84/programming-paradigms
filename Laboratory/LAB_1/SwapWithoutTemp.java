import java.util.Scanner;
public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num_1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num_2 = input.nextInt();
        System.out.println("\nElements before swaping: ");
        System.out.println("First number: "+num_1+"\nSecond number: "+num_2);

        num_1 = num_1 + num_2; 
        num_2 = num_1 - num_2; 
        num_1 = num_1 - num_2;

        System.out.println("\nElements after swaping: ");
        System.out.println("First number: "+num_1+"\nSecond number: "+num_2);

    }
}
