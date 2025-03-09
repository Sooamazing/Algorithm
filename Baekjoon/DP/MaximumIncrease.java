package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-09 18
// https://www.acmicpc.net/problem/25644
public class MaximumIncrease {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		int result = 0; // result의 최솟값은 0
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= total; i++) {
			int currentPrice = Integer.parseInt(st.nextToken());
			// 현재 금액이 최저 금액인 경우, 최저 가격 갱신
			if (currentPrice < min) {
				min = currentPrice;
			}
			// 최저 금액과 현재 금액의 차가 가장 큰 값이 정답
			result = Math.max(currentPrice - min, result);
		}

		System.out.println(result);
	}
}
