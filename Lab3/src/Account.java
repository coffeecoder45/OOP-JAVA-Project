//Qno6
public class Account {
double balance;
Account(){
    this.balance = 0.00;
}
Account(double balance){
    this.balance = balance;
}
void addBalance(double depositeBalance){
    double totalBalance = depositeBalance+balance;
    System.out.println("Amt Deposited :"+depositeBalance);
    System.out.println("Current Balance :"+totalBalance);
}
void withdrawBalance(double withdrawBalance){
    double totalBalance = balance-withdrawBalance;
    System.out.println("Amt withdraw"+withdrawBalance);
    System.out.println("Current Balance :"+totalBalance);
}
void displayInfo(){
    System.out.println("Balance : "+ balance);
}

    public static void main(String[] args) {
     Account account = new Account();
   account.addBalance(2000);
   account.withdrawBalance(500);
   account.displayInfo();
   Account account1 = new Account(5000);
   account1.addBalance(1000);
   account1.withdrawBalance(400);
   account1.displayInfo();
    }
    }

