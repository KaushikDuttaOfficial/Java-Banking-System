package bank;
public class Account
{
    //Private Properties
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private String password;
    //Parameterized Constructor
    public Account(int accountNumber, String accountHolderName, double balance, String password)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.password=password;
    }
    //Account Holder Name Getter Using Account Number
    public void getAccountHolderName(int accountNumber)
    {
        if(this.accountNumber==accountNumber)
        {
        System.out.println("Account Holder Name is "+accountHolderName);
        }
        else
        {
            System.out.println("Account Number Not Found");
        }
    }
    //Account Number Getter Using Account Holder Name & Password
    public void getAccountNumber(String accountHolderName, String password)
    {
        if(this.accountHolderName.equals(accountHolderName) && this.password.equals(password))
        {
            System.out.println("Account Number is "+accountNumber);
        }
        else
        {
            System.out.println("Invalid Account Holder Name or Password");
        }
    }
    //Account Balance Getter Using Account Number & Password
    public void getBalance(int accountNumber, String password)
    {
        if(this.accountNumber==accountNumber && this.password.equals(password))
        {
            System.out.println("Account Balance is "+balance);
        }
        else
        {
            System.out.println("Invalid Account Number or Password");
        }
    }
    //Deposit Setter Using Account Number
    public void deposit(int accountNumber, double amount)
    {
        if(this.accountNumber==accountNumber)
        {
            if(amount>0)
            {
                balance+=amount;
                System.out.println("₹"+amount+" Deposited Successfully!");
                System.out.println("Updated Account Balance is ₹"+balance);
            }
            else
            {
                System.out.println("Invalid Deposit Amount");
            }
        }
        else
        {
            System.out.println("Invalid Account Number");
        }
    }
    //Withdrawal Setter Using Account Number & Password
    public void withdraw(int accountNumber, String password, double amount)
    {
        if(this.accountNumber==accountNumber && this.password.equals(password))
        {
            if(amount<=0)
            {
                System.out.println("Invalid Withdrawal Amount");
            }
            else if(amount>0 && amount<=balance)
            {
                balance-=amount;
                System.out.println("₹"+amount+" Withdrawal Successful!");
                System.out.println("Updated Account Balance is ₹"+balance);
            }
            else
            {
                System.out.println("Insufficient Balance");
            }
        }
        else
        {
            System.out.println("Invalid Account Number or Password");
        }
    }
}
