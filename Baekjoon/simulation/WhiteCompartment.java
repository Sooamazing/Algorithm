package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-25 5min
// https://www.acmicpc.net/problem/1100
public class WhiteCompartment {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		for (int i = 0; i < 8; i++) {
			String line = br.readLine();
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0 && line.charAt(j) == 'F') {
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
