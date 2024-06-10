package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-10 15min
// https://www.acmicpc.net/problem/14225
public class SumOfPartialSequences {
	static boolean[] result;
	static int[] arr;
	static int num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());
		arr = new int[num];
		visit = new boolean[num];
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < num; i++) {
			sum += arr[i] = Integer.parseInt(st.nextToken());
		}
		result = new boolean[sum + 1];

		calc(0, 0);
		for (int i = 0; i < sum + 1; i++) {
			if (!result[i]) {
				System.out.println(i);
				return;
			}
		}
		// 전부 가능하다면, 그 이후의 숫자
		System.out.println(sum + 1);

	}

	static boolean[] visit;

	static void calc(int depth, int sum) {

		result[sum] = true;

		if (depth == num) {
			return;
		}

		calc(depth + 1, sum + arr[depth]);
		calc(depth + 1, sum);

		// for (int i = 0; i < num + 1; i++) {
		// 	if (!visit[i]) {
		// 		visit[i] = true;
		// 		calc(i, sum);
		// 		visit[i] = false;
		// 		sum -= arr[i];
		// 	}
		// }
	}
}
