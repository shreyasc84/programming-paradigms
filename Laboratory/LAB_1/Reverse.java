import java.util.Scanner;
public class Reverse {

    public static int reverseNumber(int num) {
        int reversed = 0;
    
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
    
        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        System.out.println("The reversed number is: "+reverseNumber(num));

    }
}
