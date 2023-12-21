// https://www.acmicpc.net/problem/16953

package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtoB {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");
		int A = Integer.parseInt(split[0]);
		int B = Integer.parseInt(split[1]);
		int result = 0;

		while (true) {
			int a = 0;

			if (B == A) {
				System.out.println(result + 1);
				return;
			} else if (B > A && B % 2 == 0) {
				result++;
				B /= 2;
			} else if (B > A && (B / 10) * 10 + 1 == B) {
				B /= 10;
				result++;
			} else {
				System.out.println(-1);
				return;
			}
		}

	}

}
