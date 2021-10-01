import java.util.Scanner;
public class SimpleMath {
static void add(int a, int b) {
System.out.println("Integer addition result = "+(a+b));
}
static void sub(int a, int b) {
System.out.println("Integer subtraction result = "+(a-b));
}
static void mul(int a, int b) {
System.out.println("Integer multiplication result = "+a*b);
}
static void div(int a, int b) {
int v=0;
try {
v= a/b;
System.out.println("Integer division result = "+v);
}catch(ArithmeticException e) {
System.out.println("Division by 0 is undefined.");
}
}
static void add(float a, float b) {
System.out.println("Float addition result = "+(a+b));
}
static void sub(float a, float b) {
System.out.println("Float subtraction result = "+(a-b));
}
static void mul(float a, float b) {
System.out.println("Float multiplication result = "+a*b);
}
static void div(float a, float b) {
float v=0;
try {
v= a/b;
System.out.println("Float division result = "+v);
}catch(ArithmeticException e) {
System.out.println("Division by 0 is undefined.");
}
}
public static void main(String Args[]) {
System.out.println("Enter: \n1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for
Division");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
float a=0.0f,b=0.0f;
int c=0,d=0;
System.out.println("Enter the data type of the numbers: ");
String s=sc.next();
if(s.equalsIgnoreCase("float")) {
System.out.println("Enter numbers:");
a=sc.nextFloat();
b=sc.nextFloat();
}
else if(s.equalsIgnoreCase("int")) {
System.out.println("Enter numbers:");
c=sc.nextInt();
d=sc.nextInt();
}else {
System.out.println("Invalid choice.");
sc.close();
return;
}
switch(ch) {
case 1:
if(s.equalsIgnoreCase("float"))
add(a,b);
else
add(c,d);
break;
case 2:
if(s.equalsIgnoreCase("float"))
sub(a,b);
else
sub(c,d);
break;
case 3:
if(s.equalsIgnoreCase("float"))
mul(a,b);
else
mul(c,d);
break;
case 4:
if(s.equalsIgnoreCase("float"))
div(a,b);
else
div(c,d);
break;
default:
System.out.println("Invalid choice. Enter number between 1 and 4.");
}
sc.close();
}
}