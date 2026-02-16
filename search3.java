//Binary Search


package day16;
import java.util.*;
public class search3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int st=0,en=n-1,f=0;			
		Arrays.sort(a);
		int k=scan.nextInt();
		while(st<=en)
		{
			int mid=st+(en-st)/2;
			if(k==a[mid])
			{
				System.out.println(mid);
				f=1;
				break;
			}
			else if(k<a[mid])
			{
				en=mid-1;
			}
			else
			{
				st=mid+1;
			}
			
		}
		if(f==0)
		{
			System.out.print(-1);
		}
	}
}






















