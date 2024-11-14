/*
Imagine a Room class representing a real-world room. 
The class should include properties like the room's dimensions (length, width, height) 
and methods for calculating the area and volume of the room. Write a complete Java program 
using this class with appropriate OOP concepts.
*/
class room
{
    private int length;
    private int width;
    private int height;
    public void setroom(int l,int w,int h)
    {
        this.length=l;
        this.height=h;
        this.width=w;
    }
    public int calarea()
    {
        return length*width;
    }

    public int calcvolume()
    {
        return length*height*width;
    }
}
public class ABC {
    public static void main(String[] args) 
    {
        room r=new room();
        r.setroom(12, 14, 15);
        System.out.println(r.calarea());
        System.out.println(r.calcvolume());
    }
}
