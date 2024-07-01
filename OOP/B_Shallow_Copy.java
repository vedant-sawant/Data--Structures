class Student
{
    int roll;
    Student(int roll)
    {
        this.roll=roll;
    }
}
public class B_Shallow_Copy {
    public static void main(String[] args) {
        Student s1=new Student(2);
        Student s2=s1;
        s2.roll=3;
        System.out.println(s1.roll);
    }
}
