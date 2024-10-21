import java.util.*;

class novosoftqa
{
    public static void secondlargest(int arr[])
    {
       
        Arrays.sort(arr);
        int min=arr[0];
        int ss=arr[(arr.length-1)-1];
        for(int i=0;i<arr.length;i++)
        {
            if(min<arr[(arr.length-1)-1])
            {
                min=arr[i];
            }
           
        }
        System.out.println(min);

    }
    public static void main(String[] args) {
        int[] num={33,33,24,5,2,1,5};
        secondlargest(num);
    
}
}