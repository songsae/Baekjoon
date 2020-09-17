package stage02;

import java.util.Scanner;

public class _02884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(h*60+m-45 >= 0) {
			System.out.println((h*60+m-45)/60);
			System.out.println((h*60+m-45)%60);
		}else {
			System.out.println((h*60+m+1440-45)/60);
			System.out.println((h*60+m+1440-45)%60);
		}
		sc.close();
	}
}
