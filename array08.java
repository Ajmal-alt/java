//Given an integer N, followed by N integers, store them in an array.
//Separate the numbers into even and odd. Print all even numbers in the first line and all odd numbers in the second line, maintaining input order.


package day14;
import java.util.*;
public class array08 {

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for (int i = 0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        for(int i = 0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                System.out.print(a[i]+" ");
            }
        }
	}

}
