package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1110
public class PlusCycle {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int temp = n;
		while (true) {
			int a = temp / 10;
			int b = temp % 10;
			int c = a + b;
			temp = b * 10 + c % 10;
			cnt++;
			if (temp == n) {
				break;
			}
		}
		System.out.println(cnt);

	}
}
