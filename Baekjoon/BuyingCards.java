// https://www.acmicpc.net/problem/11052
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyingCards {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			int cur = Integer.parseInt(st.nextToken());
			int max = 0;
			int last = i - 1;
			int mid = last / 2;
			for (int j = 1; j <= mid; j++) {

				max = Math.max(arr[j] + arr[last - j + 1], max);

			}
			if (last % 2 == 1) {
				max = Math.max(arr[mid + 1] * 2, max);
			}
			arr[i] = Math.max(max, cur);
		}

		System.out.println(arr[N]);
	}
}
