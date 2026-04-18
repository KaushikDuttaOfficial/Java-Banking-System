package bank;
import java.util.Scanner;
public class BankingApp
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome To Account Creation Portal of ABC Bank");
        System.out.println("To Create Your Account Enter the Following Details");
        System.out.println("Enter Your Name");
        String name=in.nextLine();
        System.out.println("Enter Opening Deposit");
        double openingDeposit=in.nextDouble();
        in.nextLine();
        if(openingDeposit<0)
        {
            System.out.println("Invalid Opening Deposit");
            System.out.println("Enter Opening Deposit ");
            openingDeposit=in.nextDouble();
        in.nextLine();
        }
        System.out.println("Enter Password");
        String userPassword=in.nextLine();
        //Random 10 Digit Account Number
        int max=2147483647, min=1000000000;
        int newAccountNumber=(int) (Math.random()*(max-min+1)+min);
        Account account=new Account(newAccountNumber,name,openingDeposit,userPassword);
        System.out.println("Account Created Successfully!");
        System.out.println("Your Account Number is "+newAccountNumber);
        boolean isTrue=true;
        while(isTrue)
        {
            System.out.println("Enter 1 for Checking Balance");
            System.out.println("Enter 2 for getting Account Number");
            System.out.println("Enter 3 for getting Account Holder Name");
            System.out.println("Enter 4 to Deposit Money");
            System.out.println("Enter 5 to Withdraw Money");
            System.out.println("Enter 6 to Exit");
            int choice=in.nextInt();
            in.nextLine();
            switch(choice)
            {
                case 1:
                System.out.println("Enter Account Number and Password");
                newAccountNumber=in.nextInt();
                in.nextLine();
                userPassword=in.nextLine();
                account.getBalance(newAccountNumber,userPassword);
                break;
                case 2:
                System.out.println("Enter Account Holder Name and Password");
                name=in.nextLine();
                userPassword=in.nextLine();
                account.getAccountNumber(name,userPassword);
                break;
                case 3:
                System.out.println("Enter Account Number");
                newAccountNumber=in.nextInt();
                in.nextLine();
                account.getAccountHolderName(newAccountNumber);
                break;
                case 4:
                System.out.println("Enter Account Number and Deposit Amount");
                newAccountNumber=in.nextInt();
                in.nextLine();
                openingDeposit=in.nextDouble();
                in.nextLine();
                account.deposit(newAccountNumber,openingDeposit);
                break;
                case 5:
                System.out.println("Enter Account Number, Password and Withdrawal Amount");
                newAccountNumber=in.nextInt();
                in.nextLine();
                userPassword=in.nextLine();
                openingDeposit=in.nextDouble();
                in.nextLine();
                account.withdraw(newAccountNumber,userPassword,openingDeposit);
                break;
                case 6:
                isTrue=false;
                System.out.println("Thank you for using our service");
                break;
                default:
                System.out.println("Invalid Input Try Again");
            }
        }
        in.close();
    }
}
