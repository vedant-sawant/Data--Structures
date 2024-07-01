class Animal
{
    int legs;
    int eyes;
    void has(int legs,int eyes)
    {
        System.out.println("Animal has "+legs+" legs and "+eyes+" eyes");
    }
}
class Fish extends Animal
{
    int fins;
    void has(int fins)
    {
        System.out.println("Fish has "+fins+" fins");
    }
}
class Dog extends Animal
{
    String hands;
    void hass(String hands)
    {
        System.out.println("Dog has "+hands+" hands");
    }
}

public class F_Hierarchical_Inheritance 
{
    public static void main(String[] args) {
        Fish f=new Fish();
        f.has(2,2);
        f.has(2);
        //f.hass("zero");
    }
}
