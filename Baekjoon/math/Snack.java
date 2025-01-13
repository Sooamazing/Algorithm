package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-13 5min
// https://www.acmicpc.net/problem/10156
public class Snack {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int price = Integer.parseInt(st.nextToken());
		int count = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());

		int result = price * count - money;

		if (result < 0) {
			System.out.println(0);
		} else {
			System.out.println(result);
		}

	}
}
