package stage04;

import java.util.Scanner;

public class _01110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n;
		int b = 0;
		int cycle = 1;
		while(true) {
			b = (a%10)*10 + (a/10 + a%10)%10;
			a = b;
			if(b == n) {System.out.println(cycle); break;}
			cycle++;
		}
		sc.close();
	}
}
