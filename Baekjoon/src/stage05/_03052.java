package stage05;

import java.util.ArrayList;
import java.util.Scanner;

public class _03052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt()%42;
		}
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int number : num) {
			if(!numList.contains(number)) numList.add(number);
		}
		System.out.println(numList.size());
		sc.close();
	}
}
