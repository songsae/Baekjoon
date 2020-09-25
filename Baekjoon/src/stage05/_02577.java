package stage05;

import java.util.Scanner;

public class _02577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sum = Integer.toString(sc.nextInt() * sc.nextInt() * sc.nextInt());
		int[] a = new int[sum.length()];
		for(int i=0; i<sum.length(); i++) {
			a[i] = sum.charAt(i)-48;
		}
		int[] count = new int[10];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<=9; j++) {
				if(a[i]==j) {
					count[j]++;
				}
			}
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
		sc.close();
	}
}
