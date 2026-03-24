package package1;
import java.util.*;

class BankAccount {

    int accountNumber;
    String name;
    double balance;

    BankAccount(int accountNumber, String name, double balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    void display(){
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        int choice;

        do{
            System.out.println("\n--- Banking System ---");
            System.out.println("1 Create Account");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Check Balance");
            System.out.println("5 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){

            case 1:
                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Initial Balance: ");
                double bal = sc.nextDouble();

                accounts.add(new BankAccount(accNo, name, bal));
                System.out.println("Account created.");
                break;

            case 2:
                System.out.print("Enter Account Number: ");
                int depAcc = sc.nextInt();

                BankAccount acc1 = findAccount(accounts, depAcc);

                if(acc1 != null){
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    acc1.deposit(amt);
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 3:
                System.out.print("Enter Account Number: ");
                int witAcc = sc.nextInt();

                BankAccount acc2 = findAccount(accounts, witAcc);

                if(acc2 != null){
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    acc2.withdraw(amt);
                } else {
                    System.out.println("Account not found!");
                }
                break;

            case 4:
                System.out.print("Enter Account Number: ");
                int checkAcc = sc.nextInt();

                BankAccount acc3 = findAccount(accounts, checkAcc);

                if(acc3 != null){
                    acc3.display();
                } else {
                    System.out.println("Account not found!");
                }
                break;
            }

        }while(choice != 5);

        System.out.println("System closed.");
        sc.close();
    }

    static BankAccount findAccount(ArrayList<BankAccount> accounts, int accNo){
        for(BankAccount acc : accounts){
            if(acc.accountNumber == accNo){
                return acc;
            }
        }
        return null;
    }
}
