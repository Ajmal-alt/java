//selection sort time complexity : best/worst/avg : O(n^2)


package day16;
import java.util.*;
public class sort2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n = scan.nextInt();
		int a[]=new int [n];
		for(int i =0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i =0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int t=a[i];
			a[i]=a[min];
			a[min]=t;
		}
		for(int i =0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

}
