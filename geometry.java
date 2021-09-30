import java.util.Scanner;

class geometry {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Program to find area and Perimeter of different Shape :");
        System.out.println("Press 1: For Circle\nPress 2: For Rectangle\nPress 3: For Square\nPress 4: For Right Angled Triangle\nEnter your choice :");
        int c = s.nextInt();
        switch(c){
            case 1: System.out.println("Enter a radius:");
                int r = s.nextInt();
                System.out.println("Circumference = "+ (float)2*3.14*r);
                System.out.println("Area = "+ (float)3.14*r*r);
                break;
            case 2: System.out.println("Enter a length and width :");
                int l = s.nextInt();
                int w = s.nextInt();
                System.out.println("Perimeter = "+ 2*(l+w));
                System.out.println("Area = "+ l*w);
                break;
            case 3: System.out.println("Enter a length of side :");
                int l = s.nextInt();
                System.out.println("Perimeter = "+ 4*l);
                System.out.println("Area = "+ l*l);
                break;
            case 4: System.out.println("Enter a height and base :");
                int h = s.nextInt();
                int b = s.nextInt();
                System.out.println("Enter a Hypotanous :");
                int l = s.nextInt();
                System.out.println("Perimeter = "+ l+b+h);
                System.out.println("Area = "+ (float)0.5*h*b);
                break;
            default: System.out.println("Wrong choice.";)
        }
        
        
    }
}