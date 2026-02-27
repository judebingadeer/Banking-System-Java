package model;

public class Account {
    private String accountnumber;
    private String ownername;
    private double balance;


    public Account(String accountnumber, String ownername, double balance) {

        this.accountnumber = accountnumber;
        this.ownername = ownername;
        this.balance = balance;
    }//end cons

    public void  deposit(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }
        public void withdraw(double amount){

        if(amount<=0)
            return;

        if(amount>balance) {
                return;
            }

        balance-=amount;

        }

public double getBalance(){
   return balance;

}
}//end Account class
