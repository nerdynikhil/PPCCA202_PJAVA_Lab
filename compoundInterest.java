import java.util.Scanner;

public class compoundInterest {

    public double calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        return cinterest;       
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount to be invested: ");
        int principal = sc.nextInt();
        System.out.println("Enter years: ");
        int years = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        double roi = sc.nextDouble();
    	compoundInterest obj = new compoundInterest();
        System.out.println("The compound interest annually is " + obj.calculate(principal, years, roi/100, 12));
    	System.out.println("The compound interest compounded quarterly is " + obj.calculate(principal, years, roi/100, 4));
    }
}