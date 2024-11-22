package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-22 5min
// https://www.acmicpc.net/problem/2051
public class FindingDivisors {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());

		int order = Integer.parseInt(st.nextToken());

		int curOrder = 0;

		int ans = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				curOrder++;

				ans = i;

				if (curOrder == order) {

					break;

				}

			}

		}

		if (curOrder < order) {

			System.out.println(0);

			return;

		}

		System.out.println(ans);
	}
}
