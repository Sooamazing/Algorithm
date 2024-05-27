package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 10 5
// 5 2 3 2 3 2 3 2 3 2
// 5 100
// 1 1 100 1 1
// 24-05-27 40min
// https://www.acmicpc.net/problem/1806
// 반례: https://www.acmicpc.net/board/view/138214
public class PartialSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int numSize = Integer.parseInt(st.nextToken());
		int goalSum = Integer.parseInt(st.nextToken());
		long[] arr = new long[numSize];

		st = new StringTokenizer(br.readLine());
		// arr[0] = Integer.parseInt(st.nextToken());
		// int curSum = arr[0];
		long curSum = 0;
		int minNum = Integer.MAX_VALUE;
		int left = 0;
		int right = 0;

		for (int i = 0; i < numSize; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right = i;
			curSum += arr[i];
			if (curSum >= goalSum) {
				boolean flag = false;
				while (left <= right && curSum >= goalSum) {
					curSum -= arr[left++];
					flag = true;
				}
				if (flag) {
					curSum += arr[--left];
				}
				minNum = Math.min(minNum, right - left + 1);
			}

		}

		System.out.println(minNum == Integer.MAX_VALUE ? 0 : minNum);

	}
}
