//2D ARRAY


package day14;

import java.util.Scanner;

public class array15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int rsize=scan.nextInt();
		int csize=scan.nextInt();
		int ar[][]=new int[rsize][csize];
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				ar[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

}
