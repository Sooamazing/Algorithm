// https://www.acmicpc.net/problem/1629
package Baekjoon.DivideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Multiplication {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		System.out.println(divided(A, B, C));

	}

	static long divided(long A, long B, int C) {

		long half = B / 2;
		if (B == 1) {
			return A % C;
		} else {
			long temp = divided(A, half, C);
			if (B % 2 == 1) {
				return ((temp * temp)%C * (A % C)) % C;
			} else {
				return (temp * temp) % C;
			}
		}
	}
}


