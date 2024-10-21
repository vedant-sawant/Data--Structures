public class temp {
    public static void main(String[] args) {   
    int arr[]={1,2,3,4,5,5};
    for(int i=arr.length-1;i>0;i--)
    {
        if(arr[i]<arr[arr.length-1])
        {
            System.out.println(arr[i]);
            break;
        }
    }
}
}
