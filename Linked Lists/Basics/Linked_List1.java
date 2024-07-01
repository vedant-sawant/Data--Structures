public class Linked_List1
{
	public class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public static Node head=null;
	public static Node tail=null;
	public void addfirst(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(int data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=tail=null;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	public void addmiddle(int indx,int data)
	{
		Node newNode=new Node(data);
		Node temp=head;
		int i=0;
		while(i<indx-1)
		{
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ->");
			temp=temp.next;
		}
	}
	public static void main(String[] args)
	{
		Linked_List1 LL=new Linked_List1();
		LL.addfirst(3);
		LL.addfirst(2);
		LL.addfirst(1);
		

		LL.addmiddle(3,4);
		LL.addmiddle(4,5);

		LL.addLast(6);
		LL.addLast(7);
		
		LL.print();
	}


}