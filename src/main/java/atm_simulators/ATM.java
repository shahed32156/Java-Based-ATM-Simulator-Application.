
package atm_simulators;

import java.util.Scanner;


public class ATM {
    
    private UserAccount user;
    private Scanner input;
    
    
    public ATM(UserAccount user) {
        
      this.user = user;
      this.input = new Scanner(System.in);
    
    }
    
    private boolean authentication() {
        
        System.out.print("Enter your pin Number: ");
        String inputPin = input.nextLine();
        return user.validatePinNumber(inputPin);
    }
    
    private void showMenu() {
        
        int choice = -1;
        
        while(choice != 4) {
            System.out.println("\n*** ATM Menu ***");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Leave");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("Current balance: "+user.getBalance());
                    break;
                case 2:
                    System.out.print("Enter ammount to deposit: ");
                    double deposit = input.nextDouble();
                    user.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter ammount to withdraw: ");
                    double withdraw = input.nextDouble();
                    user.withdraw(withdraw);
                    break;
                case 4:
                    System.out.println("Thanks for the using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
    
    public void start() {
        
        System.out.println("***** Welcome to your ATM account *****");
        
        if(authentication()) {
            
            showMenu();
        }
        
        else {
            System.out.println("Invalid PIN number or Authentication failed");
        }
    }
    
    
}
