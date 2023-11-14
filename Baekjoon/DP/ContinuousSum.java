// https://www.acmicpc.net/problem/1912
package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinuousSum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N;

		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int max = Integer.MIN_VALUE; // 음수가 max일 수도 있어서 초기화값 중요!
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int cur = Integer.parseInt(st.nextToken());
			sum += cur;
			max = Math.max(max, sum);

			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(max);
	}
}
