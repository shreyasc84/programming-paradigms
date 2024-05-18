import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Input 1st number: ");
        a = input.nextInt();
        System.out.print("Input 2nd number: ");
        b = input.nextInt();
        System.out.print("Input 3rd number: ");
        c = input.nextInt();

        if (a>b && a>c){
            System.out.println("The greatest: "+a);
        }
        else if (b>a && b>c){
            System.out.println("The greatest: "+b);
        }
        else{
            System.out.println("The greatest: "+c);
        }

        
    }
}

