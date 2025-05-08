package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-08 10min
// https://www.acmicpc.net/problem/7567
public class Bowl {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bowls = br.readLine();
		int height = 10;
		char prev = bowls.charAt(0);
		for (int i = 1; i < bowls.length(); i++) {
			char current = bowls.charAt(i);
			if (prev == current) {
				height += 5;
			} else {
				height += 10;
			}
			prev = current;
		}
		System.out.println(height);
	}
}
