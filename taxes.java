import java.util.Scanner;

class taxes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Salary:");
        double s = s.nextDouble();
        int c;
        if (s <= 10000.00)
            c = 0;
        else if (s <= 25000.00)
            c = 1;
        else if (s <= 50000.00)
            c = 2;
        else if (s <= 75000.00)
            c = 3;
        else if (s <= 100000.00)
            c = 4;
        else if (s > 100000.00)
            c = 5;
        switch (c) {
            case 0:
                System.out.println("Tax Payable = Rs 0.00");
                break;
            case 1:
                System.out.println("Tax Payable = Rs 100.00");
                break;
            case 2:
                System.out.println("Tax Payable = Rs 200.00");
                break;
            case 3:
                System.out.println("Tax Payable = Rs 300.00");
                break;
            case 4:
                System.out.println("Tax Payable = Rs 450.00");
                break;
            case 5:
                System.out.println("Tax Payable = Rs 650.00");
                break;
        }
    }
}