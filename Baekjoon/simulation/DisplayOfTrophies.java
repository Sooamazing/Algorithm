package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-01 15min
// https://www.acmicpc.net/problem/1668
public class DisplayOfTrophies {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		int max = 0;
		int left = 0;
		for (int i = 0; i < num; i++) {
			int cur = arr[i] = Integer.parseInt(br.readLine());
			if (i == 0) {
				left++;
				max = cur;
				continue;
			}
			if (max < cur) {
				left++;
				max = cur;
			}
		}

		max = arr[num - 1];
		int right = 1;
		for (int i = num - 1; i >= 0; i--) {
			int cur = arr[i];
			if (max < cur) {
				right++;
				max = cur;
			}
		}

		System.out.println(left + "\n" + right);

	}
}
