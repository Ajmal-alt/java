//OOPS Consepts
//Class
//Object
//Inheritance
//Polymorphism
//abstraction
//encapsulation

package day17;
import java.util.*;
public class recursion_04 {
	int a;
	String b;
	void set(int n, String m)
	{
		a=n;
		b=m;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		recursion_04 m = new recursion_04();
		m.set(12,"cse");
		System.out.println(m.a+" "+m.b);
	}
}
