public class secondsmallest
{
    public static void main(String[] args) {
        int arr[]={3,2,5,2,5,1,1,2};
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        System.out.println("Minimum Element is: "+mini);

        int secondmini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=mini && arr[i]<secondmini)
            {
                secondmini=arr[i];
            }
            
        }
        System.out.println("Second Mini is: "+secondmini);
    }
}