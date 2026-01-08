package ATMMachine;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" Enter Account Holder Name");
            String name = sc.nextLine();
            System.out.println(" Enter Account Number ");
            int accountNumber = sc.nextInt();
            UserInfo ui = new UserInfo(name, accountNumber);
            ui.Display();
            AtmWork obj = new AtmWork();
            obj.otpDisplay();
            System.out.println(" Enter Otp ");
            int otp = sc.nextInt();
            obj.verifyOtp(otp);
            if (obj.verifyOtp(otp)) {
                System.out.println(" Login Successfully ");
                while (true) {
                    System.out.println("*- Select Option Give Below -*");
                    System.out.println(" 1) Amount Deposit  ");
                    System.out.println(" 2) Amount Withdraw  ");
                    System.out.println(" 3) Check Balance ");
                    System.out.println(" 4) Exit ");
                    System.out.println ("*------------------------*");
                    int choice = sc.nextInt();
                    System.out.println("*------------------------*");
                    switch (choice) {
                        case 1:
                            System.out.println("  Enter Deposit Amount ");
                            int DepositAmount = sc.nextInt();
                            obj.Deposit(DepositAmount);
                            break;
                        case 2:
                            System.out.println("  Enter Withdraw Amount ");
                            int withdrawAmount = sc.nextInt();
                            obj.withdraw(withdrawAmount);
                            break;
                        case 3:
                            obj.checkBalance();
                            break;
                        case 4:
                            System.out.println("  Thanks For Using.......");
                            sc.close();
                            System.exit(0);
                        default:
                            System.out.println(" Invalid Option !!!!! ");
                    }
                }
            } else {
                System.out.println(" Invalid Otp !!  Try again..");
            }
        }catch ( Exception e){
            System.out.println (" put Valid Number !! ");
        }
    }
}
