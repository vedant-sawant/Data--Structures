
    // public static void main(String[] args) {
    //     String name="Vedant";
    //     char arr[]=name.toCharArray();

    //     int start=0;
    //     int end=arr.length-1;

    //     while(start<end)
    //     {
    //         char temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    //     String name1=new String(arr);
    //     System.out.println(name1);
    // }
    // public static void main(String[] args) 
    // {
    //     //String name="Vedant";
    //     StringBuilder s1=new StringBuilder();
    //     String name="Vedant";

    //     char[] arr=name.toCharArray();
    //     int start=arr[0];
    //     int end=arr.length-1;

    //     for(int i=arr.length-1;i>=0;i--)
    //     {
    //         s1.append(arr[i]);
    //     }
    //     System.out.println(s1);


    //     //palindrome
        
    // }
    class reversestring
    {
    public static void main(String[] args) {
        String name="nitin";

        for(int i=0;i<name.length();i++)
        {
            if(name.charAt(i) == name.charAt(name.length()-i-1))
            {
                System.out.println("Yes");
            }
        }
    }
}