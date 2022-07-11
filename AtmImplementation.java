import java.util.HashMap;
import java.util.Map;

public class AtmImplementation implements AtmInterface {

    //object of ATM class

    ATM atm = new ATM();

    //Hashmap
    Map<Double, String> miniStatement = new HashMap<>();

    @Override
    public void viewBalance() {

        System.out.println("Available balance is : " + atm.getBalance() + "\n");
        
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        
        //if-else multiples of 5 check
        if (withdrawAmount % 5 == 0) {

            //if-else of amount and withdraw amount check
            if(withdrawAmount <= atm.getBalance()) {

                miniStatement.put(withdrawAmount, " has been withdrawn!");
                System.out.println(withdrawAmount + " has been withdrawn!\n");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
    
            } else {
    
                System.out.println("The amount you want to withdraw is more than you currently have in your account\n" + atm.getBalance());
    
            }

        } else {

            System.out.println("Please enter an amount in multiples of 5");

        }
        
    }

    @Override
    public void depositAmount(double depositAmount) {

        miniStatement.put(depositAmount, " has been deposited!");
        System.out.println(depositAmount + " has been deposited!\n");
        atm.setBalance(atm.getBalance() + depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        //< _amount, value>
        for(Map.Entry<Double, String> m:miniStatement.entrySet()) {

            System.out.println(m.getKey() + " -" + m.getValue());

        }
        
        
    }
    
}