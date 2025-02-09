package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-09 20min
// https://www.acmicpc.net/problem/1476
public class DateCalculator {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
		int earth = Integer.parseInt(st.nextToken());
		int sun = Integer.parseInt(st.nextToken());
		int moon = Integer.parseInt(st.nextToken());

		// 15*n+earth=result
		// 28*m+sun=result
		// 19*k+moon=result
		for (int i = 1; ; i++) {
			int earthNumber = i - earth;
			int sunNumber = i - sun;
			int moonNumber = i - moon;
			if (earthNumber >= 0 && sunNumber >= 0 && moonNumber >= 0
				&& earthNumber % 15 == 0 && sunNumber % 28 == 0 && moonNumber % 19 == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
