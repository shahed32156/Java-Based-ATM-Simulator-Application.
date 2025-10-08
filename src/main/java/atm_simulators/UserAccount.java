
package atm_simulators;


public class UserAccount {

   
    private String accountNumber;
    private String pinNumber;
    private double balance;
    
    public UserAccount(String accountNumber, String pinNumber, double balance){
        
        
        this.accountNumber=accountNumber;
        this.pinNumber=pinNumber;
        this.balance=balance;
        
    }
    
    public String accountNumber() {
        
        return accountNumber;
    }
    
    public boolean validatePinNumber(String inputPinNumber) {
        
        return this.pinNumber.equals(inputPinNumber);
        
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        
        if (amount > 0) {
            
           balance = balance + amount;
           System.out.println("deposit successfull.\nNow current balance: "+balance);
        }
        
        else {
            
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        
        if(amount>=500 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw successful.\nNow current balance: "+balance);
        }
        else if (amount > balance) {
            System.out.println("Current balance " +balance+" is less than withdraw amount "+amount+".\n"+"Withdraw amount can't be more than current balance.");
        }
        else {
            System.out.println("Withdraw amount must be 500 to 500 up.");
        }
    }
    
    
    
}
