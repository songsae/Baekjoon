package stage05;

import java.util.Arrays;
import java.util.Scanner;

public class _01546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] score = new double[n];
		double sum = 0;
		for(int i=0; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		for(int i=0; i<score.length; i++) {
			score[i] = score[i]/score[score.length-1]*100;
			sum += score[i];
		}
		double avg = sum / score.length;
		System.out.println(avg);
		sc.close();
	}
}
