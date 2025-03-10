package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-10 25min
// https://www.acmicpc.net/problem/1535
public class Hello {
	private static int total;
	private static int[] healths;
	private static int[] joys;
	private static int maxJoy;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		total = Integer.parseInt(br.readLine());
		healths = new int[total + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= total; i++) {
			healths[i] = Integer.parseInt(st.nextToken());
		}
		joys = new int[total + 1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= total; i++) {
			joys[i] = Integer.parseInt(st.nextToken());
		}

		calc(0, 100, 0);

		System.out.println(maxJoy);
	}

	private static void calc(int depth, int health, int joy) {

		// 세준이는 죽었다.
		if (health <= 0) {
			return;
		}

		maxJoy = Math.max(joy, maxJoy);

		if (depth > total) {
			return;
		}

		calc(depth + 1, health, joy);
		calc(depth + 1, health - healths[depth], joy + joys[depth]);

	}
}
