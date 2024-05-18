import java.util.Scanner;
public class PrimeNumber {

    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (prime(num)){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
        
    }
}
