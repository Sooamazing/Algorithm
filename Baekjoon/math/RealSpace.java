package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-31 43
// https://www.acmicpc.net/problem/1350
public class RealSpace {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] files = new int[total];
		for (int i = 0; i < total; i++) {
			files[i] = Integer.parseInt(st.nextToken());
		}
		int cluster = Integer.parseInt(br.readLine());

		int result = 0;
		for (int file : files) {
			if (file == 0) {
				continue;
			}
			result += ((file - 1) / cluster + (((file - 1) % cluster) > 0 ? 1 : 0));
		}

		System.out.println(result * cluster);
	}
}
