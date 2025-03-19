package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-03-19 100min
// https://www.acmicpc.net/problem/17213
public class FruitTheft {
	private static int fruitType;
	private static int distribute;
	private static int result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		fruitType = Integer.parseInt(br.readLine());
		int wannaStolen = Integer.parseInt(br.readLine());
		distribute = wannaStolen - fruitType;

		calc(0, 0);
		System.out.println(result);
	}

	private static void calc(int depth, int currentSum) {
		// 나눠줘야 할 과일보다 합계가 크면 그대로 종료
		if (currentSum > distribute) {
			return;
		}
		// 맨 마지막엔 남는 걸 넣으면 되기 때문에 하나 전에서 끝남.
		if (depth == fruitType - 1) {
			result++;
			return;
		}

		for (int i = 0; i <= distribute; i++) {
			calc(depth + 1, currentSum + i);
		}
	}
}
