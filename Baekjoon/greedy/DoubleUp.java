package Baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 25-02-15 10min
// https://www.acmicpc.net/problem/12931
public class DoubleUp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		int[] arr = new int[total];
		int zeroCount = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < total; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] == 0) {
				zeroCount++;
			}
		}
		Arrays.sort(arr);

		int result = 0;
		while (zeroCount != total) {
			for (int i = total - 1; i >= 0; i--) {
				int current = arr[i];
				if (current == 0) {
					break;
				} else if (current == 1) {
					result++;
					zeroCount++;
					arr[i] = 0;
				} else if (current % 2 == 1) {
					// 홀수
					result++;
					arr[i] = current / 2;
				} else if (current % 2 == 0) {
					// 짝수
					arr[i] = current / 2;
				}
			}
			// 마지막 단계에서는 result++하면 안 됨.
			if (zeroCount == total) {
				break;
			}
			result++;
		}

		System.out.println(result);
	}
}
