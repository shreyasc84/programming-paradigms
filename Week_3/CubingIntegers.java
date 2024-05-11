import java.util.Scanner;

public class CubingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int number = input.nextInt();
        for (int i=1; i<=number; i++){
            System.out.println("Number is: "+i+" and cube is: "+i*i*i);
        }
    }
}
