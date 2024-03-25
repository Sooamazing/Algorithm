package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 24-03-25
// https://www.acmicpc.net/problem/2407
public class Combination {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");

		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		BigInteger head = BigInteger.valueOf(1L);
		BigInteger tail = BigInteger.valueOf(1L);

		for (int i = 1; i <= m; i++) {
			head = head.multiply(BigInteger.valueOf(n - (i - 1)));
			tail = tail.multiply(BigInteger.valueOf(i));
		}

		System.out.println(head.divide(tail));

	}
}
