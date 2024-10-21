// Rotate Array by One Place

public class rotatearraybyoneplace {
    public static void main(String[] args) {
        int[] arr={3,5,2,6,2,5};
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
