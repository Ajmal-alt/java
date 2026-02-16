// Array reverse using 2 pointer


package day16;
import java.util.*;
public class search2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0,j =n-1;i<=j;i++,j--)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

















