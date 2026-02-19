//Doubly Linked List

package day19;
import java.util.*;
class node{
	int data;
	node next;
	node prev;
	node(int d)
	{
		data=d;
		next=null;
		prev=null;
	}
}
public class dLL_01 {
	static node head=null,tail=null;
	static int size;
	static void ins(int v)
	{
		node n =new node(v);
		if (head==null)
		{
			head=tail=n;
		}
		else
		  {
	            tail.next=n;
	            n.prev=tail;
	            tail=n;
	        }
	}
	static void dis()
	{
		node temp =head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.print(temp.data+"\n");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		size=scan.nextInt();
		for(int i =1;i<=size;i++)
		{
			int a=scan.nextInt();
			ins(a);
		}
		dis();
		}
}
