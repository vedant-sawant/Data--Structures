public class A_String_Functions {
    public static void main(String[] args) {
        String name="Java";
        String lname="Learning";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("a"));

        System.out.println(name + " & " + lname);
        System.out.println(name.concat(lname));


        //charat
        for(int i=0;i<lname.length();i++)
        {
            System.out.println(lname.charAt(i));
        }


        //palindrome
        String a="aba";

        int lengtth=a.length();
        for(int i=0;i<lengtth/2;i++)
        {
            if(a.charAt(i)!=a.charAt(lengtth-i-1))
            {
                System.out.println("HELL");
            }
            else
            {
                System.out.println("Palindrome");
            }
        }

        // Strings are equal or not

        String str1="name";
        String str2="name";
        String str3=new String("name");

        if(str1.equals(str3))
        {
            System.out.println("Equals");
        }
        else{
            System.out.println("HELL");
        }

    }
}
