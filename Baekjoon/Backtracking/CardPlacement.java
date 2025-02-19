package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 25-02-19 10min
// https://www.acmicpc.net/problem/5568
public class CardPlacement {
	private static int goal;
	private static int total;
	private static int[] cards;
	private static boolean[] visited;
	private static Set<String> set = new HashSet<>();
	private static int[] temp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		total = Integer.parseInt(br.readLine());
		goal = Integer.parseInt(br.readLine());

		cards = new int[total];
		temp = new int[goal];
		visited = new boolean[total];
		for (int i = 0; i < total; i++) {
			cards[i] = Integer.parseInt(br.readLine());
		}

		calc(0);

		System.out.println(set.size());
	}

	private static void calc(int depth) {
		if (depth == goal) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < goal; i++) {
				sb.append(temp[i]);
			}
			set.add(sb.toString());
			return;
		}

		for (int i = 0; i < total; i++) {
			if (visited[i]) {
				continue;
			}
			visited[i] = true;
			temp[depth] = cards[i];
			calc(depth + 1);
			visited[i] = false;
		}
	}
}
