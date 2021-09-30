import java.util.Scanner;
class Score{
    int s_code;
    String s_name;
    float marks;
    Score(Scanner s){
        System.out.println("Enter Subject Name :");
        s_name = s.next();
        System.out.println("Enter Subject Code :");
        s_code = s.nextInt();
        System.out.println("Enter Subject Marks :");
        marks = s.nextFloat();
    }
    float getMarks(){
        return marks;
    }
}
class Student{
    int sz;
    Score s1[];
    Student(Scanner s){
        System.out.println("Enter Number of Subject :");
        sz = s.nextInt();
        s1 = new Score[sz];
        System.out.println("Enter your Marks .....");
        for(int i=0; i<sz;i++){
             System.out.println("Subject "+ i+1 + ":");
            s1[i] = new Score(s);
        }
    }
    public float calculateMarks(){
        float sum = 0;
        for(int i=0;i<sz;i++)
            sum = sum + s1[i].getMarks();
        return sum/sz;
    }
    public static void main(String Args[]){
        Scanner s = new Scanner(System.in);
        Student obj = new Student(s);
        float marks = obj.calculateMarks();
        System.out.println("You Secured "+marks+"%");
    }
}