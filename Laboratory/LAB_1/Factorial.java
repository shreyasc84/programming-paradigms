import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nummber: ");
        int user_in = input.nextInt();
        long fac = 1;
        for (int i = 2; i<=user_in;i++){
            fac*=i;
        }
        System.out.println("The factorial of the number is: "+fac);
    }
    
}
