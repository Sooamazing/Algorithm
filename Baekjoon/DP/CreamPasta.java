package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-17, 18 15min
// https://www.acmicpc.net/problem/25214
public class CreamPasta {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		int[] min = new int[total + 1];
		int[] diff = new int[total + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		min[0] = Integer.MAX_VALUE; // 초기화
		for (int i = 1; i <= total; i++) {
			int num = Integer.parseInt(st.nextToken());
			min[i] = Math.min(min[i - 1], num);
			diff[i] = Math.max(diff[i - 1], num - min[i]);
			sb.append(diff[i]).append(" ");
		}

		System.out.println(sb);

	}
}
