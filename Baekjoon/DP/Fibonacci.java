package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-30 25min
// https://www.acmicpc.net/problem/9711
public class Fibonacci {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = Integer.parseInt(br.readLine());

		// long[] fibonacci = new long[10_000 + 1];
		// fibonacci[1] = 1;
		// int start = 3;
		for (int i = 1; i <= test; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int index = Integer.parseInt(st.nextToken());
			int divide = Integer.parseInt(st.nextToken());

			// long이면 메모리 초과
			int[] fibonacci = new int[index + 1];
			fibonacci[1] = 1 % divide;
			for (int j = 2; j <= index; j++) {
				fibonacci[j] = (int)(((long)fibonacci[j - 1] + fibonacci[j - 2]) % divide);
			}

			// long이어도 오버플로우 발생
			// if (fibonacci[index] == 0) {
			// 	for (int j = start; j <= index; j++) {
			// 		fibonacci[j] = fibonacci[j - 1] + fibonacci[j - 2];
			// 	}
			// 	start = index + 1;
			// }
			// int result = (int)fibonacci[index] % divide;
			sb.append("Case #" + i + ": " + fibonacci[index] + "\n");
		}

		System.out.println(sb);
	}
}
