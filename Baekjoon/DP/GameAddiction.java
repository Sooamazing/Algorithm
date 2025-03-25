package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-25 15min
// https://www.acmicpc.net/problem/20152
public class GameAddiction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// index 벗어남 방지 위해 +1
		int home = Integer.parseInt(st.nextToken()) + 1;
		int pc = Integer.parseInt(st.nextToken()) + 1;

		if (home == pc) {
			System.out.println(1);
			return;
		}

		boolean isHomeUpperThanPC = home < pc;
		int start = isHomeUpperThanPC ? home : pc;
		int max = isHomeUpperThanPC ? pc : home;
		long[][] map = new long[max + 1][max + 1];

		for (int i = start; i <= max; i++) {
			for (int j = i; j <= max; j++) {
				if (i == start && j == start) {
					map[start][start] = 1;
					continue;
				}
				map[i][j] = map[i - 1][j] + map[i][j - 1];
			}
		}

		System.out.println(map[max][max]);
	}
}
