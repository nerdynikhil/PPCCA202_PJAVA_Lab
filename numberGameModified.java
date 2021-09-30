import java.util.Scanner;

class numberGameModified {
    public int Largest(int a[], int sz) {
        int l = 0;
        for (int i = 0; i < sz; i++)
            if (a[i] > l)
                l = a[i];
        return l;
    }

    public int Smallest(int a[], int sz) {
        int s = a[0];
        for (int i = 1; i < sz; i++)
            if (a[i] < s)
                s = a[i];
        return s;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        numberGameModified p = new numberGameModified();
        System.out.println("Enter a Array Size:");
        int sz = s.nextInt();
        int a[] = new int[sz];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < sz; i++)
            a[i] = s.nextInt();
        int large = p.Largest(a, sz);
        int small = p.Smallest(a, sz);
        System.out.println("Sum of Largest Number in the Set = " + large);
        System.out.println("Sum of Smallest Number in the Set = " + small);
    }
}