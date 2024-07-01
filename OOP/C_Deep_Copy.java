
class Student
{
    int roll;
    Student(int roll)
    {
        this.roll=roll;
    }
}
public class C_Deep_Copy {
    public static void main(String[] args) {
        Student s1=new Student(13);
        Student s2=new Student(s1.roll);
        System.out.println(s1.roll);
        s1.roll=20;
        System.out.println(s1.roll);
        System.out.println(s2.roll);
    }
}
