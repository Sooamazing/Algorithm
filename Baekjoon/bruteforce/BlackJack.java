package Baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-07 30min
// https://www.acmicpc.net/problem/2798
public class BlackJack {

	static int num;
	static int goal;
	static int[] cards;
	static boolean[] visited;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		num = Integer.parseInt(st.nextToken());
		goal = Integer.parseInt(st.nextToken());

		cards = new int[num];
		visited = new boolean[num];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += cards[i];
			for (int j = i + 1; j < num; j++) {
				sum += cards[j];
				for (int k = j + 1; k < num; k++) {
					sum += cards[k];
					if (sum <= goal) {
						max = Math.max(max, sum);
					}
					sum -= cards[k];
				}
				sum -= cards[j];
			}
			sum -= cards[i];
		}

		// Arrays.sort(cards);
		// blackJack(0, 0);

		System.out.println(max);
	}

	static void blackJack(int index, int sum) {
		// if (sum > goal) {
		// 	return;
		// }
		// if (depth == num) {
		// 	max = Math.max(max, sum);
		// 	return;
		// }
		// blackJack(depth + 1, sum);
		// blackJack(depth + 1, sum + cards[depth]);

		for (int i = index; i < num; i++) {
			if (visited[i]) {
				continue;
			}
			if (goal < sum) {
				return;
			}
			max = Math.max(max, sum);
			visited[i] = true;
			blackJack(i + 1, sum + cards[i]);
			visited[i] = false;
		}
	}
}
