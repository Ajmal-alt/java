package day17;
import java.util.*;
    public class constructor_01 {
		int a;
		String b;
		constructor_01(int n,String m)
		{
			a=n;b=m;
		}
		public static void main(String[] args) {
			Scanner scan = new Scanner (System.in);
			constructor_01 m = new constructor_01(12,"cse");
			System.out.print(m.a+" "+m.b);
		}
	}
    
    