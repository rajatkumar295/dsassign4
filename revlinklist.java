import java.util.*;
class node
{
	node head=null;
	int data;
	node next;
	node pre=null;
	node nex=null;
	node()
	{
      this.data=0;
      this.next=null;
	}
	node(int data)
	{
		this.data=data;
		this.next=null;
	}
	public node add(int data)
	{
		node l=new node(data);
       if(head==null)
       {
       	head=l;
       }
       else
       {
       	node temp=head;
          while(temp.next!=null)
          {
          	temp=temp.next;
          }
          temp.next=l;
       }
       return head;
	}
	public node rev(node head)
	{
		node temp=head;
		while(temp!=null)
		{
		nex=temp.next;
		temp.next=pre;
		pre=temp;
		temp=nex;
        }
        head=pre;
        return head;

	}
	public void print(node head)
	{
		node temp=head;
		while(temp!=null)
		{
          System.out.println(temp.data);
          temp=temp.next;
		}
	}
}
class revlinklist
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,a;
		n=s.nextInt();
		node h=null;
		node x=new node();
		node y=null;
		while(n>0)
		{
			a=s.nextInt();
           h=x.add(a);
           n--;
		}
         y=x.rev(h);
		x.print(y);
	}
}