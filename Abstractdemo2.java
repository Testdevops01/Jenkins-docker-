abstract class ATM{
    int x=10;
    static int y=10;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract void checkBalance();
    public void welcomeMessage(){
        System.out.println("Welcome to ATM! ");

    }
}
class BankATM extends ATM{
private double balance;
public BankATM(double initialBalance)
{
this.balance= initialBalance;
}
void deposit(double amount){
    if (amount>0)
    {
        balance = balance +amount;
        System.out.println("Deposited: Rs"+ amount);
    } else
    System.out.println("Invalid deposit amount: ");
}
void withdraw(double amount){
    if (amount >0 && amount <=balance)
    {
        balance=balance - amount;
        System.out.println("Amount withdrawn "+amount);
       // System.out.println("Remaining amount" + balance);
    } else{
        System.out.println("Insufficient funds or invalid amount");
    }
}
void checkBalance()
{
    System.out.println("Current Balance is: Rs" + balance);
}
}
public class Abstractdemo2{
    public static void main(String[] args) {
        ATM MyAtm =new BankATM(5000);
        MyAtm.welcomeMessage();
        MyAtm.checkBalance();
        MyAtm.deposit(500);
        MyAtm.withdraw(700);


    }
}