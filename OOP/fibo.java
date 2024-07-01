public class fibo {
    public static void main(String[] args) {
        // 1 1 2 3 5 8
        int start=1;
        int next=1;
        int third=0;
        for(int i=0;i<8;i++)
        {
            third=start+next;
            start=next;
            next=third;
            System.out.println(third);
            

        }
    }
}
