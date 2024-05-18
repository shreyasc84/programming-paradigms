import java.util.Scanner;

class CalciFuncationality{
    Double num1;
    Double num2;

    public CalciFuncationality(Double num1, Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition(){
        System.out.println(num1+" + "+num2+" = "+ (num1+num2));
    }

    public void subtraction(){
        System.out.println(num1+" - "+num2+" = "+ (num1-num2));
    }

    public void division(){
        System.out.println(num1+" / "+num2+" = "+ (num1/num2));
    }

    public void multiplication(){
        System.out.println(num1+" x "+num2+" = "+ (num1*num2));
    }
}


public class SimpleCalculator {
    public static void main(String[] args) {
        Double a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        a = input.nextDouble();
        b = input.nextDouble();
        CalciFuncationality calci = new CalciFuncationality(a,b);

        input.nextLine();
        System.out.println("Enter the operator (+,-,*,/)");
        String choice = input.nextLine();
        switch (choice) {
            case "+":
                calci.addition();
                break;
            case "-":
                calci.subtraction();
                break;
            case "*":
                calci.multiplication();
                break;
            case "/":
                calci.division();
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }

        
    }
    
}
