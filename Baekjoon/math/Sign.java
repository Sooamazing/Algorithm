package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 24-10-02 10min
// https://www.acmicpc.net/problem/1247
public class Sign {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int test = 3;
		while (test-- > 0) {

			int num = Integer.parseInt(br.readLine());

			BigInteger a = new BigInteger(br.readLine());
			num--;

			while (num-- > 0) {

				BigInteger b = new BigInteger(br.readLine());
				a = a.add(b);

			}

			int compare = a.compareTo(BigInteger.ZERO);

			if (compare > 0) {
				sb.append("+\n");
			} else if (compare < 0) {
				sb.append("-\n");
			} else {
				sb.append("0\n");
			}

		}

		System.out.println(sb);

	}

}