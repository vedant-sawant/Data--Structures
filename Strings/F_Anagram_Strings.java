import java.util.Arrays;

public class F_Anagram_Strings {
    public static boolean check_anagram(String str1,String str2)
    {
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char str1arr[]=str1.toCharArray();
        char str2arr[]=str2.toCharArray();
        
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);

        if(Arrays.equals(str1arr,str2arr)==true)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       String str1="vedant";
       String str2="tvedna"; 
       System.out.println(check_anagram(str1,str2));
    }
}
