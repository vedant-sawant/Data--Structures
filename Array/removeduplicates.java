// Remove Duplicates 

import java.util.*;

class removeduplicates
{
    public static void removed(int arr[])
    {
        HashSet<Integer> sset=new HashSet<>();
        int index=0;
        for(int i:arr)
        {
            sset.add(i);
            arr[index++]=i;
        }
        int k=sset.size();
        System.out.println("Size of Set is: "+k);
    }
    public static void optimal(int[] arr)
    {
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[i]!=arr[j])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println("Length is "+i);
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,5,6,7,7};
        optimal(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}