//separate odd maximum and even maximum


package day16;
import java.util.*;
public class search1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int m1=Integer.MIN_VALUE,m2=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				m1=Math.max(m1,a[i]);
			}
			else
			{
				m2=Math.max(m2,a[i]);
			}
		}
		System.out.println("maximumm even: "+m1+"\n"+"maximum odd: "+m2);
	}

}
