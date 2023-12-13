// https://www.acmicpc.net/problem/17266
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DarkUnderpass {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// (1 ≤ N ≤ 100,000)
		int N = Integer.parseInt(br.readLine());
		boolean[] street = new boolean[N + 1];
		// (1 ≤ M ≤ N)
		int M = Integer.parseInt(br.readLine());
		int[] streetlampLocations = new int[M];

		// (0 ≤ x ≤ N)
		// 가로등의 위치 x는 오름차순으로 입력받으며 가로등의 위치는 중복되지 않으며, 정수이다.

		// 100000개 배열에 가로등 영역이면 true로 변환하고 모두 true일 때의 최솟값?

		// 0과 첫값, 사이값 차/2(+1) ,마지막값과 N 값의 차이를 min, max 구하고 max 만족하는 최솟값..?

		String[] split = br.readLine().split(" ");
		int min = Integer.parseInt(split[0]);
		int max = Integer.parseInt(split[0]);

		for (int i = 0; i < M - 1; i++) {

			int distance = (Integer.parseInt(split[i + 1]) - Integer.parseInt(split[i]));
			if (distance % 2 == 0) {
				min = Math.min(min, distance / 2);
				max = Math.max(max, distance / 2);
			} else {
				min = Math.min(min, distance / 2 + 1);
				max = Math.max(max, distance / 2 + 1);
			}

		}

		min = Math.min(min, N - Integer.parseInt(split[split.length - 1]));
		max = Math.max(max, N - Integer.parseInt(split[split.length - 1]));

		System.out.println(max);

	}
}
