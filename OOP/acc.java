// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class acc {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();
        int arr[]={3,4,5,6,7,8,9};
        for(int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int k=set.size();
        int j=0;
        for (int x: set) {
            arr[j++] = x;
        }
    
    }
}