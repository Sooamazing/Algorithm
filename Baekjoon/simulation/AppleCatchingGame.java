package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-08 15min
// https://www.acmicpc.net/problem/2828
public class AppleCatchingGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int length = Integer.parseInt(st.nextToken());
		int basket = Integer.parseInt(st.nextToken());

		int apples = Integer.parseInt(br.readLine());
		int left = 1;
		int right = basket;
		int moves = 0;
		for (int i = 0; i < apples; i++) {
			int apple = Integer.parseInt(br.readLine());
			if (apple < left) {
				moves += left - apple;
				left = apple;
				right = left + basket - 1;
			} else if (apple > right) {
				moves += apple - right;
				right = apple;
				left = right - basket + 1;
			}
		}

		System.out.println(moves);

	}
}
