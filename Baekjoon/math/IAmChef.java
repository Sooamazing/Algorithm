package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-20 5min
// https://www.acmicpc.net/problem/2953
public class IAmChef {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int winner = 0;
		int max = 0;
		StringTokenizer st;
		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			int score = 0;
			for (int j = 0; j < 4; j++) {
				score += Integer.parseInt(st.nextToken());
			}
			if (score > max) {
				max = score;
				winner = i + 1;
			}
		}

		System.out.println(winner + " " + max);
	}
}
