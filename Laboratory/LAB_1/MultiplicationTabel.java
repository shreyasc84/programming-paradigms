import java.util.Scanner;
public class MultiplicationTabel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the your desired tabel: ");
        System.out.print("From: ");
        int user_x = input.nextInt();
        System.out.print("To: ");
        int user_y = input.nextInt();
        for (int i = user_x; i<=user_y;i++){
            System.out.println();
            for (int j = 1; j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }

        }
    }
}
