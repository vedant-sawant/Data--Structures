/* 
 Explain polymorphism and demonstrate it with a Java program. Create a base class 
 called Shape with a method draw(). Then, create two derived classes, Circle and 
 Rectangle, each overriding the draw() method to print a unique message. 
 In your main method, use polymorphism to call the draw() method on different types of 
 Shape objects.

 
*/

// Polymorphsm means many forms here in this example method draw has many forms, 
// and is method overriding(Run Time Polymorphism) as methods are same with same paramters and body is different.
// Also, method overloading (Compile Time POlymorphism) means same name, different parameters
class Shape
{
    public void draw()
    {
        System.out.println("This is a Draw Method in Rectangle");
    }
}
class Circle extends Shape
{
    public void draw()
    {
        System.out.println("This is a Draw Method in Circle");
    }
}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("This is a Draw Method in Rectangle");
    }
}

public class Polymor {
    public static void main(String[] args) {
        Shape r=new Rectangle();
        r.draw();
     
    }
}
