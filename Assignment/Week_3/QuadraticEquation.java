import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Double a, b, c;
        System.out.print("Input a:");
        a = input.nextDouble();
        System.out.print("Input b:");
        b = input.nextDouble();
        System.out.print("Input c:");
        c = input.nextDouble();

        Double D, root, root1, root2, d;
        D = (b*b)-(4*a*c);
        root = -b/(2*a);
        root1 = (-b+Math.sqrt(D))/(2*a);
        root2 = (-b-Math.sqrt(D))/(2*a);
        d = Math.sqrt(-D)/(2*a);
        
        if (D > 0){
            System.out.println("The roots are "+root1+" and "+root2);
        }
        else if (D == 0){
            System.out.println("The rooots are "+root+" and "+root);
        }
        else{
            System.out.println("The roots are "+root+"+"+d+"i"+" and "+root+"-"+d+"i");
        }

    }

}
