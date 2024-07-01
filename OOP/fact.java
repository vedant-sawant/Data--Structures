public class fact{
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
    int start=0;
    int end=arr.length-1;
    while(start<end)
    {
        int s=arr[start];
        arr[start]=arr[end];
        arr[end]=s;
        start++;
        end--;
    }
    for(int i:arr)
    {
        System.out.println(i);
    }
}
}