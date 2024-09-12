package Baekjoon.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-09-02 20min
// https://www.acmicpc.net/problem/10025
public class LazyWhiteBear {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int bucketNum = Integer.parseInt(st.nextToken());
		int bearRange = Integer.parseInt(st.nextToken());
		int[][] buckets = new int[bucketNum][2];

		for (int i = 0; i < bucketNum; i++) {
			st = new StringTokenizer(br.readLine());
			int ice = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());
			buckets[i] = new int[] {idx, ice};
		}

		Arrays.sort(buckets, (a, b) -> a[0] - b[0]);

		int max = 0;
		int left = buckets[0][0];
		int right;
		int sum = buckets[0][1];
		for (int i = 1; i < bucketNum; i++) {
			right = buckets[i][0];
			if (right <= left + 2 * bearRange) {
				sum += buckets[i][1];
			} else {
				left++;
				if (left > right - 2 * bearRange) {
					sum -= buckets[i][1];
				}
			}
			max = Math.max(max, sum);
		}

		System.out.println(max);
	}
}
