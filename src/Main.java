import java.util.Scanner;

// Create an application that acts as an ATM machine. The initial balance should start at 0. 
// Ask the user for a deposit/withdrawal and use this to affect the actual balance. Reflect the change in balance using a print out statement.
// This transaction process should loop till the user types done instead of a number.

class Main {
  public static void main(String[] args) {

    //Implementing Interface
    AtmInterface atmInter = new AtmImplementation();

    //account # and PIN
    int accountnumber = 00001;
    int accountPin = 0001;

    
    //System.out.println("Your balance is: " + userAmount);
    Scanner userInput = new Scanner(System.in);
    System.out.println("Welcome to Elzie's ATM Machine! (Don't blame me for missing money).\n");
    System.out.println("Please enter your account number: \n");
    
    int accountNumber = userInput.nextInt();
    System.out.println();

    System.out.println("Please enter your account PIN: \n");

    int accountpin = userInput.nextInt();
    System.out.println();
    
    //if-else check for # and pin
    if ((accountnumber == accountNumber) && (accountpin == accountPin)) {

        while(true) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("1. View Available Balance\n2. Withdraw\n3. Deposit\n4. View Mini Statement\n5. Exit");
            System.out.println();
            int userChoice = userInput.nextInt();
            
            //View balance
            if(userChoice == 1) {

                System.out.println();
                atmInter.viewBalance();

            //Withdraw    
            } else if(userChoice == 2) {

                System.out.println();
                System.out.println("How much would you like to withdraw?\n");
                System.out.println();
                double withdrawAmount = userInput.nextDouble();
                System.out.println();
                atmInter.withdrawAmount(withdrawAmount);
            
            //Deposit
            } else if(userChoice == 3) {

                System.out.println();
                System.out.print("How much would you like to deposit?\n");
                System.out.println();
                double depositAmount = userInput.nextDouble();
                System.out.println();
                atmInter.depositAmount(depositAmount);
            
            //View statement
            } else if(userChoice == 4) {

                System.out.println();
                atmInter.viewMiniStatement();
            
            //Exit    
            } else if(userChoice == 5) {

                System.out.println();
                System.out.println("Please take your ATM Card!\nThank you!");
                System.out.println();
                System.exit(0);
            
            //Incorrect information
            } else {
                
                System.out.println();
                System.out.println("Information is inccorrect, please type again!");
                System.out.println();
                System.exit(0);
            
            }
        }

    } else {

            System.out.println();
            System.out.println("Information entered is incorrect, please try again!");
            System.out.println();

        }
    
    userInput.close();

  }

}
