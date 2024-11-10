// Count How many times lower case occured in a string entred by the user.



public class E_Lower_Case_Count {
    
    public static int lower_count(String str)
    {
    
    StringBuilder sb=new StringBuilder();
    int count=0;
    for(int i=0;i<str.length();i++)
    {
        if(Character.isLowerCase(str.charAt(i))==true) //optional
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                count++;
            }
        }
    }
    return count;
    }


    public static void main(String[] args) {
        String str="aeAbiG";
        System.out.println(lower_count(str));
    }
}
