package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-04 15min
// https://www.acmicpc.net/problem/2156
public class WineTasting {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int[][] wines = new int[total + 1][4];
		for (int i = 1; i <= total; i++) {
			int wine = Integer.parseInt(br.readLine());
			wines[i][0] = Math.max(Math.max(wines[i - 1][0], wines[i - 1][1]), wines[i - 1][2]);
			wines[i][1] = wines[i - 1][0] + wine;
			wines[i][2] = wines[i - 1][1] + wine;
		}

		System.out.println(Math.max(Math.max(wines[total][0], wines[total][1]), wines[total][2]));
	}
}
