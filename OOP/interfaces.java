public class interfaces{
    public static void main(String[] args) {
        lame l=new lame();
        l.add();
    }
}
interface Innerinterfaces {
     void add();
    
}
class lame implements Innerinterfaces
{
    public void add()
    {
        System.out.println("Hey");
    }
}