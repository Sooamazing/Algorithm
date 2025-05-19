package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-19 5min
// https://www.acmicpc.net/problem/10102
public class BallotCount {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int aCount = 0;
		String string = br.readLine();
		for (int i = 0; i < total; i++) {
			if (string.charAt(i) == 'A') {
				aCount++;
			} else {
				aCount--;
			}
		}

		System.out.println(aCount > 0 ? "A" : aCount == 0 ? "Tie" : "B");
	}
}
