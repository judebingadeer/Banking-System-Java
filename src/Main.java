import java.util.Scanner;
import model.Account;
public class Main {

    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);


        System.out.print("please enter your name: ");
                String user_name=input.nextLine();
        System.out.print("please enter your bank number: ");
                String acc_number= input.nextLine();
        System.out.print("please enter your current balance: ");
                double balance=input.nextDouble();

        Account user1=new Account(acc_number,user_name,balance);

        System.out.println("enter the money you want to deposit;");
        double money_deposit=input.nextDouble();
        user1.deposit(money_deposit);

        System.out.println("enter the money you want to withdraw;");
        double money_withdraw=input.nextDouble();
        user1.withdraw(money_withdraw);

        System.out.println("your current balance is: "+user1.getBalance());
    }//end main
}//end Main class
