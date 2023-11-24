// https://www.acmicpc.net/problem/2467

package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//  2 <= N <= 100,000
		// -1,000,000,000 <= arr[i] <= 1,000,000,000 이하
		// N개의 용액들의 특성값은 모두 서로 다르고, 산성 용액만으로나 알칼리성 용액만으로 입력이 주어지는 경우도 있을 수 있다.

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		String[] s = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}

		int l = 0;
		int r = N - 1;
		int similarL = -1;
		int similarR = N;
		int similar0 = Integer.MAX_VALUE;

		while (l < r) {

			int CharValue = arr[l] + arr[r];
			// int mid = (l + r) / 2;

			if (Math.abs(CharValue) <= similar0) {
				similar0 = Math.abs(CharValue);
				similarL = l;
				similarR = r;
			}

			if (CharValue < 0) {
				l++;
			} else if (CharValue > 0) {
				r--;
			} else {
				break;
			}
		}

		System.out.println(arr[similarL] + " " + arr[similarR]);

	}
}
