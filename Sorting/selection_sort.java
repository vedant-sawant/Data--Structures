public class selection_sort {
    public static void selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int mini=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini=j;
                }
            }
            int swap=arr[mini];
            arr[mini]=arr[i];
            arr[i]=swap;
        }
    }
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
        selection(arr);
        print(arr);
    }
}
