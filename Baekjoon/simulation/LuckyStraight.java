package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-12-30 1min
// https://www.acmicpc.net/problem/18406
public class LuckyStraight {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int length = str.length();

		int left = 0;
		int right = 0;
		for (int i = 0; i < length / 2; i++) {
			left += str.charAt(i) - '0';
			right += str.charAt(length - i - 1) - '0';
		}

		System.out.println(left == right ? "LUCKY" : "READY");
	}
}
