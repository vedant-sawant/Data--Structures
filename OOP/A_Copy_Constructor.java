

public class A_Copy_Constructor 
{
    public static void main(String[] args) 
    {
        ABC a1=new ABC(14,13);
        ABC a2=new ABC(a1);
        a2.roll=10;
        System.out.println(a1.roll);
        System.out.println(a1.name);
        
        System.out.println("Copy Roll: " + a2.roll);
        System.out.println("Copy Name: " + a2.name);


    }    
}
class ABC
{
    int roll,name;
    
    ABC(int roll,int name)
    {
        this.roll=roll;
        this.name=name;
    }
    ABC(ABC a1)
    {
        this.roll=a1.roll;
        this.name=a1.name;
    }
}
