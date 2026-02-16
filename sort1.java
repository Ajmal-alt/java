// Bubble Sort

// Average and worst time complexity : O(n^2)
// Best time complexity : O(n)

package day16;
import java.util.*;
public class sort1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n-1;i++)
		{
			a[i]=scan.nextInt();
		}
		int f = 0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					f=1;
				}
			}
			if(f==0)
			{
				break;
			}
		}
		for(int i =0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}



















