package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/14501
public class Resignation {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] day = new int[N + 2];
		int[] cost = new int[N + 2];
		int[] result = new int[N + 2];

		for (int i = 1; i < N + 1; i++) {
			// 입력
			String[] split = br.readLine().split(" ");
			day[i] = Integer.parseInt(split[0]);
			cost[i] = Integer.parseInt(split[1]);
		}

		for (int i = 1; i <= N + 1; i++) {
			// i일 전까지의 최대 이익과 현재의 최대 이익을 비교해 최대 이익을 구함
			for (int j = 1; j < i; j++) {
				if (result[j] > result[i]) {
					result[i] = result[j];
				}
			}

			// N 이후의 날짜는 무조건 퇴사일을 넘어가므로 무시
			if (N + 1 < i + day[i]) {
				continue;
			}

			// i일에 일을 했을 때의 이익을 구함
			int exp = result[i] + cost[i];
			if (result[i + day[i]] < exp) {
				result[i + day[i]] = exp;
			}

		}

		System.out.println(result[N + 1]);

	}
}
