package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 21-03-30
// https://www.acmicpc.net/problem/1094
public class Pole {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		String binaryString = Integer.toBinaryString(x);

		int count = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) == '1') {
				count++;
			}
		}

		System.out.println(count);

	}
}
