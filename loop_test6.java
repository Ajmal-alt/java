//Take an integer and print 'YES' if the input integer is an armstrong number, otherwise print 'NO'.
//Input: 123
//Output:
//Print YES or NO.


package day13;
import java.util.*;
public class loop_test6 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
	    int c=0,n1=n,n2=n,sum=0;
	    while(n1>0)
	    {
	    	c++;
	    	n1/=10;
	    }
	    while(n>0)
	    {
	    	int r=n%10;
	    	sum = sum+(int)Math.pow(r,c);
	    	n/=10;
	    }
	    System.out.println(sum==n2?"YES":"NO");
	}

}
