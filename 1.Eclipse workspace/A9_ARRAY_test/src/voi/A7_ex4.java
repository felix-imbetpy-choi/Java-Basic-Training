package voi;

import java.util.Scanner;

public class A7_ex4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] pan = new int[8];
		
		for(int a = 0; a < pan.length; a++) {
			System.out.println("Input score");
			int k = scanner.nextInt();
			int i = k/10;
			
			pan [i]++;
			
			for(int b = 0; b < pan[i]; b++) {
					System.out.print("#");
			}
			System.out.println(pan[1]);
			System.out.println(pan[2]);
			System.out.println(pan[3]);
			System.out.println(pan[4]);
			System.out.println(pan[5]);
			System.out.println(pan[6]);
			System.out.println(pan[7]);
			System.out.println(pan[8]);
	     	}
			for(int s= 0; s < 10; s++)
			{
			int i = 0;
			for(int j = 0; j < pan[i]; j++)
			{
				System.out.println("*");
			}
		}

	}

}
