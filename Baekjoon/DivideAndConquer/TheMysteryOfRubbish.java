package Baekjoon.DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-05 30min
// https://www.acmicpc.net/problem/14731
public class TheMysteryOfRubbish {
	static final int MOD = 1_000_000_007;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		long ans = 0;
		StringTokenizer st;
		for (int i = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()); // 100
			long b = Long.parseLong(st.nextToken()); //  1_000_000_000
			ans = (ans + (a * mod(2, b - 1) % MOD) * b % MOD) % MOD;
		}
		System.out.println(ans);
	}

	static long mod(long x, long y) {
		if (y == 0) {
			return 1;
		} else if (y == 1) {
			return x % MOD;
		} else if (y % 2 == 0) {
			long temp = mod(x, y / 2);
			return (temp * temp) % MOD;
		} else {
			long temp = mod(x, y / 2);
			return (temp * temp % MOD) * x % MOD;
		}
	}
}
