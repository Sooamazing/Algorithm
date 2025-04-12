package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-12 30min
// https://www.acmicpc.net/problem/17291
public class LittleKitten {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());

		int[] bugs = new int[year + 1];
		int[] newBugs = new int[year + 1];
		bugs[1] = 1;
		newBugs[1] = 1;
		if (year >= 2) {
			bugs[2] = 2;
			newBugs[2] = 1;
		}
		for (int i = 3; i <= year; i++) {
			boolean isOdd = i % 2 != 0;
			newBugs[i] = bugs[i - 1];
			if (isOdd) {
				bugs[i] = bugs[i - 1] * 2;
				continue;
			}
			if (i == 4) {
				bugs[i] = bugs[i - 1] * 2 - newBugs[i - 3];
			}
			bugs[i] = bugs[i - 1] * 2 - (newBugs[i - 3] + newBugs[i - 4]);
		}

		System.out.println(bugs[year]);
	}
}
