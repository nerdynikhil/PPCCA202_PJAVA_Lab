import java.util.Scanner;
class numberGame{
    public int evenSum(int a[],int sz){
        int sum=0;
        for(int i=0;i<sz;i++)
            if(a[i]%2==0)
                sum = sum + a[i];
        return sum;
    }
    public int oddSum(int a[],int sz){
        int sum=0;
        for(int i=0;i<sz;i++)
            if(a[i]%2!=0)
                sum = sum + a[i];
        return sum;
    }    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        numberGame p = new numberGame();
        System.out.println("Enter a Array Size:");
        int sz = s.nextInt();
        int a[] = new int[sz];
        System.out.println("Enter Elements: ");
        for(int i = 0 ;i<sz; i++)
            a[i] = s.nextInt();
        int se = p.evenSum(a,sz);
        int so = p.oddSum(a,sz);
        System.out.println("Sum of Even Number in the Set = "+ se);
        System.out.println("Sum of Odd Number in the Set = "+ so);
    }
}