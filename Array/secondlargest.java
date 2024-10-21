public class secondlargest
{
    public static void main(String[] args) 
    {
        int arr[]={4,2,7,1,6,2,5,9};
        sll(arr);
        
    }
    public static void sll(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("Max is: "+max);

        //find second largest
        int mini=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            
            if(arr[i]!=max && arr[i]>mini)
            {
                mini=arr[i];
            }
        }
        System.out.println("Mini is: "+mini);


    }
     
}