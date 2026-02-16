//Read an integer N. Then read N space-separated integers into an array. Then read an integer X.
//If X is present in the array, print its 0-based index. If not present, print -1.
//If the element appears multiple times, print the first occurrence index.


package day14;
import java.util.*;
public class array07 {

	public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n=scan.nextInt();
        int a[]=new int [n];
        for(int i = 0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        int x=scan.nextInt();
        boolean f=false;
        for (int i = 0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println(i);
                f=true;
                break;
            }
        }
        if(!f)
            System.out.println(-1);

	}

}
