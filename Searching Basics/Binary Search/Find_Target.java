/*

		arr=[2,2,4,4,5,6,6,7,7,8,8]
		target? -> 5

*/

public class Find_Target
{
	public static int findtarget(int arr[])
	{
		int i=0;
		while(i<arr.length-1)
		{
			if(arr[i]==arr[i+1])
			{
				i=i+2;
			}
			else	
			{
				return arr[i];
			}

		}
		return 1;
	}
	public static void main(String[] args)
	{
		int arr[]={2,2,5};
		System.out.println(findtarget(arr));
	}
}