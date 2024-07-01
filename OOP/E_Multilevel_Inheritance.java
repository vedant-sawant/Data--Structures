class Animal
{
    String color;
    void color(String color)
    {
        this.color=color;
    }
}
class Mammel extends Animal
{
    int legs;
    void legs(int legs)
    {
        this.legs=legs;
    }
}
class Dog extends Mammel
{
    String breed;
    void breed(String breed)
    {
        System.out.println("Breed is "+breed);
    }
}

public class E_Multilevel_Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.legs(4);
        d.breed("lame");
    }
}
