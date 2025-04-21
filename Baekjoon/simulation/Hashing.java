package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-21 20min
// https://www.acmicpc.net/problem/15829
public class Hashing {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		String word = br.readLine();
		final int R = 31;
		final int MOD = 1234567891;

		long rTotal = 1;
		long result = 0;
		for (int i = 0; i < total; i++) {
			int a = word.charAt(i) - 'a' + 1;
			if (i == 0) {
				result += (a * rTotal) % MOD;
				continue;
			}
			rTotal = (rTotal * R) % MOD;
			result = (result + (a * rTotal) % MOD) % MOD;
		}

		System.out.println(result);
	}
}
