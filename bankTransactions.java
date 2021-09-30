import java.util.Scanner;

class bankTransactions {
    float bal = 0;

    public void Deposit(Scanner s) {
        System.out.println("Enter amount to deposit :");
        float a = s.nextFloat();
        bal = bal + a;
        System.out.println("Your balance after depositing money = " + bal);
    }

    public void Withdraw(Scanner s) {
        System.out.println("Enter amount to withdraw :");
        float a = s.nextFloat();
        bal = bal - a;
        System.out.println("Your balance after withdrawing Money = " + bal);
    }

    public float getBalance() {
        return bal;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        bankTransactions obj = new bankTransactions();
        int a = 0;
        while (a == 0) {
            System.out.println("Press 1: To Deposit Money \nPress 2: To Withdraw Money \n Press 3: To see Balance");
            int c = s.nextInt();
            switch (c) {
                case 1:
                    obj.Deposit(s);
                    break;
                case 2:
                    obj.Withdraw(s);
                    break;
                case 3:
                    System.out.println("Your balance : " + obj.getBalance());
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("To exit press 1 or to continue press 0.....");
            if (s.nextInt() == 1)
                break;
        }
    }
}