public class rotatearraybydplace
{
    public static void main(String[] args) 
    {
        int[] arr={2,3,4,5,6,7};    
        int d=2;
        int temp[]=new int[d];
        //store in temp
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }

        //left shift
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }
        //store back temp
        for (int i = 0; i < d; i++) {
            arr[arr.length - d + i] = temp[i];
        }

        //print array
        for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
    }
}