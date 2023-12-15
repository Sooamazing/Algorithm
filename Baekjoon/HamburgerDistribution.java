// https://www.acmicpc.net/problem/19941

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HamburgerDistribution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		int N = Integer.parseInt(split[0]);
		int K = Integer.parseInt(split[1]);

		boolean[] isEaten = new boolean[N];
		split = br.readLine().split("");
		int cnt = 0;
		for (int i = 0; i < N; i++) {

			String cur = split[i];

			// 사람이 나오면
			if (cur.equals("P")) {

				// 햄버거 먹었는지 판별
				boolean isEatenOne = false;
				// 0, 1일 때, N-2, N-1일 때 예외 처리.
				for (int j = Math.max(0, i-K); j < Math.min(N, i+K+1); j++) {

					String prev = split[j];

					// 햄버거가 나왔는데, 아무도 안 먹은 햄버거고, 나도 햄버거를 먹은 적이 없다면 먹기~!
					if (prev.equals("H") && !isEaten[j] && !isEatenOne) {
						isEatenOne = true;
						isEaten[j] = true;
						cnt++;
					}

				}
			}

		}
		System.out.println(cnt);
	}
}
