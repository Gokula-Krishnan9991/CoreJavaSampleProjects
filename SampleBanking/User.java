package SampleBanking;
import java.lang.*;
import java.util.*;
class User {
    private String name;
    private String accountNo;
    private double balanceCheck;

    private double interest;

    private double PreviousTransaction;

    public User(String name, String accountNo) {
        this.name = name;
        this.accountNo = accountNo;

    }

    Scanner sc = new Scanner(System.in);

    // check the balance in account
    public void BalanceCheck() {

        System.out.println("************************");
        System.out.println("Your current balance is " + this.balanceCheck);
        System.out.println("*************************");
        System.out.println();
    }

    // Check the deposit
    public void Deposit() {

        System.out.println("************************");
        System.out.println("Enter the amount to deposit");
        double deposit = sc.nextDouble();
        if (deposit > 0) {
            System.out.println("Rupees " + deposit + " is deposited");
            this.balanceCheck += deposit;
            this.PreviousTransaction=deposit;
            System.out.println("*************************");
        }
        System.out.println();
    }

    // Method for withdraw
    public void WithDrawl() {

        System.out.println("***************************");
        System.out.println("Enter the amount to withdrawl");
        double withDrawl = sc.nextDouble();
        if (withDrawl > 0) {
            System.out.println("Rupees " + withDrawl + " is Withdrawn");
            this.balanceCheck -= withDrawl;
            System.out.println("****************************");
            this.PreviousTransaction -= withDrawl;
        }
        System.out.println();
    }
// Getting previous Transaction

    public void previousTransaction() {
        if (this.PreviousTransaction > 0) {

            System.out.println("Deposited :" + this.PreviousTransaction);
        } else if (this.PreviousTransaction < 0) {
            System.out.println("Withdrawn " + Math.abs(this.PreviousTransaction));
        } else {
            System.out.println("No transaction occured");
        }
        System.out.println();
    }

// Calcuating interest rate

    public void InterestRate() {
        System.out.println("************************************");
        System.out.println("Enter the number of years to calculate ");
        int n = sc.nextInt();
        double rate = 0.1;
        double interest = (this.balanceCheck * rate * n) + this.balanceCheck;

        System.out.println("The current interest rate  is " + (100 * rate));
        System.out.println("After " + n + " years ,your balance will be : " + this.balanceCheck);
        System.out.println("********************************************");

        System.out.println();
    }


    public void showMenu() {

        System.out.println("Welcome :" + this.name + " !");
        System.out.println("Account No : " + this.accountNo);

        System.out.println();

        System.out.println("What you would like to do ");
        System.out.println();

        System.out.println("A. Check your balance");
        System.out.println("B. Make a Deposit");
        System.out.println("C. Make a Withdrawl");
        System.out.println("D. View previous Transaction");
        System.out.println("E. Calculate Interest");
        System.out.println("F. Exit");

        System.out.println();

        char option='\0';
        while (option != 'F') {
            System.out.println("Enter the option : ");
            char option1 = sc.next().charAt(0);
            option = Character.toUpperCase(option1);

            switch (option) {

                case 'A' -> BalanceCheck();
                case 'B' -> Deposit();
                case 'C' -> WithDrawl();
                case 'D' -> previousTransaction();
                case 'E' -> InterestRate();
            }
        }
        System.out.println("Thanks for visiting our bank");
    }
}
