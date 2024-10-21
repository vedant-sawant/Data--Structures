// Program to find smallest and second smallest - optimal approach

public class optimalsmallest 
{
    public static void main(String[] args) 
    {
        int arr[]={3,2,5,1,4,6,3};    
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<smallest)
            {
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<ssmallest && arr[i]!=smallest)
            {
                arr[i]=ssmallest;
            }
        }
        System.out.println(smallest);
        System.out.println(ssmallest);


    }
}
