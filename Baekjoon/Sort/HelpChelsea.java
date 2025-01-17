package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//  25-01-17 10min
// https://www.acmicpc.net/problem/11098
public class HelpChelsea {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCases = Integer.parseInt(br.readLine());
		while (testCases-- > 0) {
			int players = Integer.parseInt(br.readLine());
			Player[] player = new Player[players];
			StringTokenizer st;
			for (int i = 0; i < players; i++) {
				st = new StringTokenizer(br.readLine());
				player[i] = new Player().of(Integer.parseInt(st.nextToken()), st.nextToken());
			}

			Arrays.sort(player, (a, b) -> b.price - a.price);

			Player max = player[0];
			sb.append(max.name).append('\n');
		}

		System.out.println(sb);

	}

	private static class Player {
		int price;
		String name;

		Player of(int price, String name) {
			this.price = price;
			this.name = name;
			return this;
		}
	}
}
