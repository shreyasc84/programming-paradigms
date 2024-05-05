// importing Scanner to take input
import java.util.Scanner;
@SuppressWarnings("unused")
class account{
    private int acc_no;
    private String name;
    private int amount;

    // Constructor to initialize the account details
    public account(int acc_no, String name, int amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }
    
    // Method to deposite
    public void deposite(int deposite_amount){
        amount+=deposite_amount;
        System.out.println("Deposite of "+deposite_amount+" is successful!");
    }

    // Method to withdraw
    public void withdraw(int withdraw_amount){
        if (withdraw_amount<=amount){
            amount-=withdraw_amount;
            System.out.println("Withdrawl of"+withdraw_amount+" is successful");
        }
        else{
            System.out.println("Insuffient bank balance");
        }
    }

    // Method to check balance
    public void balance(){
        System.out.println("Your bank balance is:"+amount);
    }

    // Method to display details
    public void display(){
        System.out.println("Your account number is: "+acc_no);
        System.out.println("Your accound name is: "+name);
        balance();
    }
}
/* 
public class BankingSystem{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int choice;
        choice = input.nextInt();
    }

}
*/