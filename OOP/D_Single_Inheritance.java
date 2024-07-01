
class D_Single_Inheritance
{
    public static void main(String[] args)
    {
        Fish shark=new Fish();
        shark.eat();
        shark.swim("vedant");
    }
}
class Animal
{
    String name;

    void eat()
    {
        System.out.println("Eats....");
    }
    void walks()
    {
        System.out.println("Walks ... ");
    }
}
class Fish extends Animal
{
    String name;
    void swim(String name)
    {
        System.out.println("Swims...."+name);
    }
}