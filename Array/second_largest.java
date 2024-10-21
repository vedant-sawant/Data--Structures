/* Second Largest Element in an Array without sorting */
public class second_largest 
{
    public static void main(String[] args) 
    {
        int arr[]={2,3,4,1,2,45,2};
        int max=arr[0];
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>temp && arr[i]!=max)
            {
                temp=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(temp);

    }
}
