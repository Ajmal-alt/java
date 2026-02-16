//insertion sort 


package day16;
import java.util.*;
public class sort3 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n = scan.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=scan.nextInt();
			}
			for(int i =0;i<n;i++)
			{
				int t=a[i],j=i-1;
				while(j>=0 && a[j]>t)
				{
					int k =a[j];
					a[j]=a[j+1];
					a[j+1]=k;
					j--;
				}
			}
			for (int i =0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}

	}

}
