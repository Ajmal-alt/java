// write the program twisted prime num using function (or) method 
//  i/p : 13                     ||    i/p : 19
//  o/p : Tw prime num           ||    o/p : not TW prime number
// step 1 : get input
// step 2 : check given number prime (for prime -> find factors count)
// step 3 : create method for prime 
// step 4 : if given number is prime reverse the number
// step 5 : again check reversed number is prime or not 
// step 6 : if prime print print tw prime or not tw prime 


package day17;
import java.lang.Math.*;
import java.util.*;
public class method_04 {
	static boolean isprime(int a) {
		int c=0;
		for(int i =0;i<Math.sqrt(a);i++)
		{
			if(a%i==0)
			{
				c++;
				break;
			}
		}
		return c==0;
	}
	public static void main(String args[]) {
		Scanner scan =new Scanner (System.in);
		int a = scan.nextInt();
		int rev =0;
		if (isprime(a))
		{
			while(a>0)
			{
				int r=a%10;
				rev=rev*10;
				a/=10;
			}
			System.out.println(isprime(rev)?"TW Prime ":"Not TW Prime");
		}
		else
		{
			System.out.println("Not TW Prime");
		}
	}

}
