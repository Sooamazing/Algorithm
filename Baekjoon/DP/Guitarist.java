package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-23 50min
// https://www.acmicpc.net/problem/1495
public class Guitarist {
	private static int[] volumes;
	private static int total;
	private static int max;
	private static int result = -1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		total = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		max = Integer.parseInt(st.nextToken());

		boolean[][] dp = new boolean[total + 1][max + 1];
		dp[0][start] = true;
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= total; i++) {
			int volume = Integer.parseInt(st.nextToken());
			boolean never = true;
			for (int j = 0; j <= max; j++) {

				if (!dp[i - 1][j]) {
					continue;
				}
				int volumeUp = j + volume;
				if (volumeUp >= 0 && volumeUp <= max) {
					dp[i][volumeUp] = true;
					never = false;
				}

				int volumeDown = j - volume;
				if (volumeDown >= 0 && volumeDown <= max) {
					dp[i][volumeDown] = true;
					never = false;
				}
			}
			if (never) {
				System.out.println(-1);
				return;
			}
		}

		for (int i = max; i >= 0; i--) {
			if (dp[total][i]) {
				System.out.println(i);
				return;
			}
		}

		// 재귀, 시간 초과
		// volumes = new int[total];
		// st = new StringTokenizer(br.readLine());
		// for (int i = 0; i < total; i++) {
		// 	volumes[i] = Integer.parseInt(st.nextToken());
		// }
		// getMaxVolumes(start, 0);

		System.out.println(result);
	}

	private static void getMaxVolumes(int volume, int depth) {
		// if (volume < 0 || volume > max) {
		// 	return;
		// }

		if (depth == total) {
			result = Math.max(result, volume);
			return;
		}
		int volumeUp = volume + volumes[depth];
		if (volumeUp >= 0 && volumeUp <= max) {
			getMaxVolumes(volume + volumes[depth], depth + 1);
		}
		int volumeDown = volume - volumes[depth];
		if (volumeDown >= 0 && volumeDown <= max) {
			getMaxVolumes(volume - volumes[depth], depth + 1);
		}
	}
}
