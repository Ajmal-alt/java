//write program grade printing?
//91 to 100 -> A grade
//81 to 90 -> B grade
//71 to 80 -> C grade
//61 to 70 -> D grade
//50 to 60 ->E grade 
//less then 50 ->F grade
// i/p: 86
// o/p: B grade




package day11;
import java.util.Scanner;
public class condition_test5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		if(a>=91&&a<=100)
		{
			System.out.println("A");
		}
		else if (a>=81&&a<=90)
		{
			System.out.println("B");
		}
		else if(a>=71&&a<=80)
		{
			System.out.println("C");
		}
		else if(a>=61&&a<=70)
		{
			System.out.println("D");
		}
		else if(a>=50&&a<=60)
		{
			System.out.println("E");
		}
		else
		{
			System.out.println("F");
		}
	}

}
