public class optimallargest 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,8,7,7,3,4};
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i];
                
            }
            else if(arr[i]<largest && arr[i]>slargest)
            {
                slargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);

    }
}
