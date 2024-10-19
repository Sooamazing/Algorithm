package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-10-19 25min
// https://www.acmicpc.net/problem/2480
public class ThreeDice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// Map<Integer, Integer> dice = new TreeMap<>();
		int[] dice = new int[7];

		int total = 0;
		int sameIdx = 0;
		int maxIdx = 0;
		for (int i = 0; i < 3; i++) {
			int num = Integer.parseInt(st.nextToken());
			dice[num]++;
			if (dice[num] == 1) {
				total++;
			} else {
				sameIdx = num;
			}
			maxIdx = Math.max(maxIdx, num);
			// dice.put(num, dice.getOrDefault(num, 0) + 1);
		}

		// int size = dice.size();
		int prizeMoney = 0;
		if (total == 1) {
			// 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
			prizeMoney = 10_000 + 1_000 * maxIdx;
		} else if (total == 3) {
			// 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
			prizeMoney = 100 * maxIdx;
		} else {
			// 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
			prizeMoney = 1_000 + 100 * sameIdx;
		}

		System.out.println(prizeMoney);
	}
}

