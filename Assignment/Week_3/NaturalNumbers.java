import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();
        System.out.println("The first n natural numbers are: "+number);
        int sum = 0;
        for (int i=1; i<=number; i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of natural numbers upto n terms: "+sum);
    }
    
}

