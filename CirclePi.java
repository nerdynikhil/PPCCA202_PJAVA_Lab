package lab.Lab;
import java.util.Scanner;
public class CirclePi {
static final float pi = 3.14f;
static int counter = 0;
float area(float rd)
{
return pi*rd*rd;
}
float perimeter(float rd)
{
return 2*pi*rd;
}
public static void main(String args[])
{
float r, pr, ar;
Scanner s= new Scanner(System.in);
do
{
++counter;
System.out.println("Enter the radius:");
r= s.nextFloat();
CirclePi c = new CirclePi();
pr = c.perimeter(r);
ar = c.area(r);
System.out.println("Perimeter of the circle is: " + pr);
System.out.println("Area of the circle is: " + ar);
System.out.println("Number of instances: "+ counter);
}
while(true);
}
}
