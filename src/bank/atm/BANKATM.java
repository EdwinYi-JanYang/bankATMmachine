/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.atm;
import java.util.*;
/**
 *
 * @author eric_
 */
public class BANKATM {

static int Balance = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      firstinterface();
        
    }
    public static void firstinterface (){
        
        System.out.println("Hello, please enter your PIN #");
        
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        do {
            
       
            String PIN = scan.nextLine();
            CHECKPIN(PIN);
            if (CHECKPIN(PIN)) {
            
                System.out.println("You have sucessfully loged in");
                System.out.println("Press 1 to Check Balance");
                System.out.println("Press 2 to Deposit");
                System.out.println("Press 3 to Withdraw");
                System.out.println("Press 4 to Exit");
                
            MainMenu();
                
            } else if (!CHECKPIN(PIN)) {
               
                counter++;
                System.out.println("Error, please try again");
            }
        } while (counter <4);
        
        
        
      System.out.println("You have been locked out, please try again in 1 minute");  
    } 
    
    public static boolean CHECKPIN (String PIN) {
        if (PIN.equals("3284")) {
            return true;
          
        } else {
            return false;
        }
    }
    
    public static void MainMenu () {
        Scanner scan1 = new Scanner(System.in);
                
        String choice = scan1.nextLine();
        
        
        
        if (choice.equals ("1")) {
            System.out.println("Your Balance is " + CheckBalance());
            MainMenu();
        } else if (choice.equals ("2")) {
            System.out.println("How much do you wish to deposit");
            int deposit = scan1.nextInt();
            System.out.println("Your new balance is " + Deposit(deposit));
            MainMenu();
        } else if (choice.equals ("3")) {
            System.out.println("how much would you like to withdraw");
            int withdraw = scan1.nextInt();
            
            if (Balance - withdraw >= 0) {
               
                System.out.println("Your new balance is " + Withdraw(withdraw));
                
            } else {
                System.out.println("Error");
            }
            MainMenu();
        } else if (choice.equals ("4")) {
            System.exit(0);
        } else {
            System.out.println("Not valid input");
        }
    
    }
    
    public static int CheckBalance() {
        return Balance; 
    }
    public static int Deposit(int amountdeposit) {
        Balance = Balance + amountdeposit;
        return Balance;
    }
    public static int Withdraw(int amountwithdrawn) {
        Balance = Balance - amountwithdrawn;
        return Balance;
    }
}