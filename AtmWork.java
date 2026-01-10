package ATMMachine;
import java.util.Random;
public class AtmWork {
   private double balance;
    Random random = new Random();
    int otp = random.nextInt(1000, 10000);
   public void otpDisplay () throws Exception {
       System.out.println (" Otp Send Successfully **** (wait for Second)");
       Thread.sleep(5000);
           System.out.println(" Otp is :" + otp);
   }
   public boolean verifyOtp (int userOtp){
       return this.otp == userOtp;
   }
   public void Deposit (int amount){
        balance = amount + balance;
        System.out.println ("--------------------------------");
        System.out.println ( amount+" Amount Deposit successfully");
        System.out.println ("---------------------------------");
    }
    public void withdraw (int amount){
       if ( amount > balance){
           System.out.println ("-------------------------");
           System.out.println (" Insufficient Balance ");
           System.out.println (" total Balance "+balance);
           System.out.println ("--------------------------");
       } else {
           balance = balance-amount;
           System.out.println ("--------------------------");
           System.out.println(" Withdraw Amount " + amount);
           System.out.println(" Current Balance " + balance);
           System.out.println ("---------------------------");
       }
    }
    public void checkBalance () {
       System.out.println ("-------------------------");
       System.out.println (" Total Balance "+balance);
       System.out.println ("-------------------------");
    }
}
