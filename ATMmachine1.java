package ATMmachine1; 
import java.util.*;

class ATM 
{
    float balance;
    int PIN = 93228;

    public void checkpin()
    {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("Enter a valid Pin");
            menu();

        }
    }
    public void menu()
    {
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt =sc.nextInt();

        if(opt==1)
        {
            checkBalance();
        }
        else if (opt==2)
        {
            withdrawMoney();
        }
        else if (opt==3)
        {
            depositmoney();
        }
        else if (opt==4)
        {
            return;
        }
        else 
        {
            System.out.println("Enter a valid choice");

        }
    }
        public void checkBalance()
        {
          System.out.println("balance: "+ balance);
          menu();
        }

        public void withdrawMoney()
        {
            System.out.println("Enter amount to withdraw: ");
            Scanner sc = new Scanner(System.in);
            float amount= sc.nextInt();
            if (amount>balance)
            {
                System.out.println("Insufficient Balance");
            }
            else{
                balance=balance-amount;
                System.out.println("Money withdraw Successfuly");
            }
            menu();
        }
        public void depositmoney()
        {
            System.out.println("enter the amount:");
            Scanner sc= new Scanner (System.in);
            float amount= sc.nextInt();
            balance=balance+amount;
            System.out.println("Money Deposited successfully");
            menu();
        }
    }

public class ATMmachine1
{
    public static void main(String[] args)
    {
    ATM obj = new ATM();
    obj.checkpin();
    }
}

   