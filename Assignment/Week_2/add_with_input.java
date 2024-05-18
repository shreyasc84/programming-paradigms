//adding two floating numbers by taking inputs
import java.util.Scanner; //importing scanner for taking inputs
public class add_with_input{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float x = input.nextFloat();
        System.out.println("Enter the second number:");
        float y = input.nextFloat();
        float sum = x + y;
        System.out.println("The sum of the two numbers:"+sum);

    }
}

