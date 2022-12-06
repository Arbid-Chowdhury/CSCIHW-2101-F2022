package Project1;
import java.util.Scanner;

/*
 * This is a Java Doc
 * This is a multi-line comment
 *  
 * Our BankAccount class will represent a bank account
 * It will have a balance and a name
 * It will have methods to deposit and withdraw money
 * It will have a method to print the balance
 * it will have a menu that the user can interact with
 * 
 * 
 */

public class BankAccount {
    private double balance;
    private String name;
    private double interestRate = 0.01;
    private int period = 4; // quarterly


    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0;
    }
    public BankAccount(double balance){
        this.balance = balance;
        this.name = "No Name";
    }
    // Default Constructor
    // Make a BankAccount without Specifying any parameters
    public BankAccount(){
        this.balance = 0;
        this.name = "No Name";
    }

    // Create getters and setters for balance
    public double getBalance() {
        return balance;
    }

    // Create a method for printing the balance as a String
    public String printBalance() {
        return "Your Balance is: $" + balance;
    }

    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }
    // Set balance is flawed in that we would never
    // be able to actually set the balance. Instead we need 
    // to create methods to deposit and withdraw money

    // Create getters and setters for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

    // Create a method to deposit money
    public void deposit(double amount) {
        this.balance += amount;
        // above is the same as this.balance = this.balance + amount;
        // balance is 10,000
        // amount  is 2,000
        // balance = balance + amount
        // 10000 = 10000 + 2000
    }

    // Create a method to withdraw money
    public void withdraw(double amount) {
        this.balance -= amount;
    }
        public void Overdraft(BankAccount bank, double value){
        if (bank.balance <= value){
            System.out.println("Overdraft: Your account is overdrawn by: $ " + (value - bank.balance) + " YOU WILL BE CHARGED A $35 FEE");
        System.out.println("Do you want to continue? (Y/N)");
       
       { Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if (answer.equals("Y")){
               bank.withdraw(value + 35);
                System.out.println("Your new balance is: " + bank.balance);
            }
            else if (answer.equals("N")){
                System.out.println("Your balance is: $" + bank.balance + " Have a wonderful day!");
            }
            input.close();
        }}
            else if (bank.balance > value){
                bank.withdraw(value);
                System.out.println("Your balance is now: $" + bank.balance + " Have a wonderful day!");
        }
    }

        // above is the same as this.balance = this.balance - amount;
        // balance is 10,000
        // amount  is 2,000
        // balance = balance - amount
        // 10000 = 10000 - 2000
    

    // Create a method that will subtract a monthly fee from the balance
    // This method will take a double as an argument
    // This method will subtract the fee from the balance
    public void monthlyFee(double fee) {
        withdraw(fee);
    }

public void SimpleInterest(double p, double r, double t){
    double amount = (p * r * t)/100;
    System.out.println("The simple interest will be: $" + amount);
}
    // Create a method that will calculate the interest on the balance using compound interest
    // P(1 + R/n)^(nt) - P 
    // P = Principal
    // R = Rate
    // n = number of times interest is compounded per year (annum)
    // t = number of years
    // This method will take a double as an argument
    // This method will return a double

    // P can be this.balance or getBalance() if you would like to use a getter


    public void calcInterest(double principal, int time, double rate, int annum){
        double amount = principal * Math.pow(1+ (rate/annum), annum*time);
        double roundedamount = Math.round(amount * 100.0) / 100.0;
        double compinterest = amount - principal;
        compinterest = Math.round(compinterest * 100.0) / 100.0;
        System.out.println("Current Rate is: "+rate+"%");
        System.out.println("Current Period is: "+annum+" times per year");
        System.out.println("Selected Time is: "+time+" years");
        System.out.println("Compound Interest after " + time + " years: $" + compinterest);
        System.out.println("Amount after " + time + " years: $" + roundedamount);
    }

public void Transfer(BankAccount gregSavings, BankAccount gregChecking, double funds){

    if (gregSavings.balance >= funds){
    gregSavings.balance -= funds;
    gregChecking.balance += funds;
    System.out.println("Greg, Your new savings balance is: $" + gregSavings.balance);
    System.out.println("Greg, Your new checking balance is: $" + gregChecking.balance);
}
else if (this.balance < funds){
    System.out.println("You do not have enough funds to transfer, Have a nice day");
}
}
public void Savings(BankAccount bank, double value){
    if (bank.balance>= 10000){
System.out.println("You have reached the minimum balance of $10,000, Would you like to open a savings account? (Y/N)");
{ Scanner input = new Scanner(System.in);
String answer = input.nextLine();
if (answer.equals("Y")){
    System.out.println("You have opened a savings account, Which interest rate would you like to choose, Compound or Simple? (C/S)");
    String answer2 = input.nextLine();
    if (answer2.equals("C")){
        System.out.println("You have chosen Compound Interest, How many years would you like to invest for?");
        int time = input.nextInt();
        System.out.println("Your interest rate is .0001 percent. How much would you like to invest for pricipal amount?");
        double principal = input.nextDouble();
        double rate = .0001;
        System.out.println("It will be compounded 4 times per year");
        int annum = 4;
        calcInterest(principal, time, rate, annum);
    }
    else if (answer2.equals("S")){
        System.out.println("You have chosen Simple Interest, How many years would you like to invest for?");
        int time = input.nextInt();
        System.out.println("Your interest rate is .001 percent. How much would you like to invest for pricipal amount?");
        double rate = .001;
        double principal2 = input.nextDouble();
        SimpleInterest(principal2, rate, time);
    }
} else if (answer.equals("N")){
        System.out.println("Have a nice day!");
    }
    input.close();
}}
}
    // Create a method that will print a menu for the user to interact with
    // This method will take a BankAccount as an argument
    // This method will not return anything
   

    // Create a main method that will create a BankAccount object
    // and call the menu method
    

    // Create a method that will print a menu to the user
    // this is called a helper method
    public static int menu(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account Menu");
        System.out.println("--------------------------------");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Print Balance");
        System.out.println("4. Calculate Interest");
        System.out.println("5. Calculate Simple Interest");
        System.out.println("6. Calculate Compound Interest");
        System.out.println("7. Transfer Funds");
        System.out.println("8. Open Savings Account");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();
        return choice;
    }

    // This method will take a BankAccount object as an argument
    public static void interact(BankAccount account){
        // get the choice from the menu
        int choice = menu();
        // create a scanner object
        Scanner input = new Scanner(System.in);
        // use that choice and run the method associated with that choice
        // in class we learned about recursion and how to use it
        // we will use recursion to keep the menu running until the user chooses to exit
        // This is outside of the scope of this class but it is worth knowing about

        if (choice == 1) {
            System.out.println("How much would you like to deposit?");
            double amount = input.nextDouble();
            account.deposit(amount);
            System.out.println(account.printBalance());
            // interact(account);
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            double amount = input.nextDouble();
            //add overdraft method
            account.Overdraft(account, amount);
        } else if (choice == 3) {
            System.out.println(account.printBalance());
            // interact(account);
        } else if (choice == 4) {
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            // double principal, int time, double rate, int period
            account.calcInterest(account.getBalance(), time, account.interestRate, account.period);

            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        }else if (choice == 5) {
            System.out.println("What is the principal amount?");
            double principal = input.nextDouble();
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            System.out.println("What is the interest rate?");
            double rate = input.nextDouble();
            account.SimpleInterest(principal, rate, time);
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        }else if (choice == 6) {
            System.out.println("What is the principal amount?");
            double principal = input.nextDouble();
            System.out.println("What is the time in years to invest (Whole Numbers Only)?");
            int time = input.nextInt();
            System.out.println("What is the interest rate?");
            double rate = input.nextDouble();
            System.out.println("What is the number of times interest is compounded per year?");
            int period = input.nextInt();
            account.calcInterest(principal, time, rate, period);
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        }else if (choice == 7) {
            System.out.println("How much would you like to transfer?");
            double funds = input.nextDouble();
        account.Transfer(account, account, funds);
        }else if (choice == 8) {
            account.Savings(account, account.balance);
            System.out.println("... Thank you for using the Bank Account Menu. Have a nice day! ...");
        }else if (choice == 0) {
            System.out.println("Thank you for using the Bank Account Menu");
        } else { // this would catch 69420
            System.out.println("Invalid Choice");
            // interact(account);
        }
input.close();
    }
    }
    
    
