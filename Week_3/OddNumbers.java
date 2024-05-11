import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of term is: ");
        int terms = input.nextInt();

        int sum = 0;
        int n = 0;
        int OddNumber = 1;
        System.out.println("The odd numbers are:");
        while (n<terms) {
            if (OddNumber%2 !=0 ){
                System.out.println(OddNumber);
                sum+=OddNumber;
                n++;
            }
            OddNumber++; 
        }
        System.out.println("The sum of odd numbers upto "+terms+"terms is: "+sum);
    }
    
}
