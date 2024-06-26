package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-06-26 25min
// https://www.acmicpc.net/problem/14921
public class SynthesisOfASolution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] solutions = new int[size];
		boolean hasPositive = false;
		boolean hasNegative = false;
		for (int i = 0; i < size; i++) {
			int num = Integer.parseInt(st.nextToken());
			solutions[i] = num;
			if (num > 0) {
				hasPositive = true;
			} else if (num < 0) {
				hasNegative = true;
			}
		}
		Arrays.sort(solutions);

		if (hasPositive && !hasNegative) {
			// 양수만 존재 (0 포함)
			System.out.println(solutions[0] + solutions[1]);
			return;
		} else if (!hasPositive && hasNegative) {
			// 음수만 존재 (0 포함)
			System.out.println(solutions[size - 1] + solutions[size - 2]);
			return;
		}

		int start = 0;
		int end = size - 1;
		int min = Integer.MAX_VALUE;
		int ans = 0;
		while (start < end) {
			int curSum = solutions[start] + solutions[end];

			if (min > Math.abs(curSum)) {
				min = Math.abs(curSum);
				ans = curSum;
			}

			// System.out.println("start = " + start + ", end = " + end + ", curSum = " + curSum);

			if (curSum < 0) {
				start++;
			} else if (curSum > 0) {
				end--;
			} else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(ans);
	}
}
