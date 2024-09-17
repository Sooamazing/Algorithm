package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-09-17 5min
// https://www.acmicpc.net/problem/2217
public class Rope {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ropeNum = Integer.parseInt(br.readLine());
		int[] ropes = new int[ropeNum];

		for (int i = 0; i < ropeNum; i++) {
			ropes[i] = Integer.parseInt(br.readLine());
		}

		int ans = 0;
		Arrays.sort(ropes);
		for (int i = 0; i < ropeNum; i++) {
			ans = Math.max(ans, ropes[i] * (ropeNum - i));
		}

		System.out.println(ans);
	}
}
