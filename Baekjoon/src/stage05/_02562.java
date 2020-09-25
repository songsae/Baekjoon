package stage05;

import java.util.Scanner;

public class _02562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int max = n[0];
		for(int i=0; i<n.length; i++) {
			n[i] = sc.nextInt();
			if(n[i]>=max) max = n[i];
		}
		for(int i=0; i<n.length; i++) {
			if(n[i] == max) {
				System.out.println(max);
				System.out.println(i+1);
			}
		}
		
		sc.close();
	}
}
