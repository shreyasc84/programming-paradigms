// Importing Scanner to take user input
import java.util.Scanner;

// Class "account"
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

// Main class "BankingSystem"
public class BankingSystem {
    public static void main(String[] args) {

        // To take user input
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        // Creating an account object
        account account = new account(170425, "Shreyas", 100000);

        // Assigning required variables with its data type
        int choice;
        int deposite_amount;
        int withdraw_amount;

        // Infinitely running the loop util user chooses to exit
        while (true){
            System.out.println("\n1:Deposit");
            System.out.println("2:Withdraw");
            System.out.println("3:Check Balance");
            System.out.println("4:Display Account Details");
            System.out.println("5:Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1){
                System.out.println("Enter the amount to deposite: ");
                deposite_amount = input.nextInt();
                account.deposite(deposite_amount);
            }
            else if (choice == 2){
                System.out.println("Enter the amount to withdraw: ");
                withdraw_amount = input.nextInt();
                account.withdraw(withdraw_amount);
            }
            else if(choice == 3){
                account.balance();
            }
            else if(choice == 4){
                account.display();
            }
            else if(choice == 5){
                System.out.println("Thank you! for using our bank service");
                break;
            }
            else{
                System.out.println("Invalid option! please reffer to the options available");
            }

        }
    }
}
