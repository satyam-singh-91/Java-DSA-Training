class BankAccount{
     private int balance=1000;
     public int getbalance(){
        return balance;
     }
     public void Deposit(int amount){
        if(amount>0){
        balance+=amount;
        }else{
            System.out.println("Invalid amount");
        }
     }
     public void withdwaw(int am){
        if(balance>am){
            balance-=am;
            System.out.println("Withdraw is succesful");
            System.out.println("Remaining Balance is Rs : "+ balance);
        }else{
            System.out.println("Invalid Amount and insufficient");
        }
     }
}

public class Encap {

    public static void main(String[] args) {
       BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount();
      b1.Deposit(2000);
      System.out.println(b1.getbalance());
      b1.withdwaw(500);
    }
}