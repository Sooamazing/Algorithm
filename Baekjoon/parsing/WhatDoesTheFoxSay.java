package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-11 15min
// https://www.acmicpc.net/problem/9536
public class WhatDoesTheFoxSay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {
			String[] howls = br.readLine().split(" ");
			String input = br.readLine();
			while (!input.equals("what does the fox say?")) {
				String[] temp = input.split(" ");
				for (int i = 0; i < howls.length; i++) {
					if (howls[i].equals(temp[2])) {
						howls[i] = "";
					}
				}
				input = br.readLine();
			}
			for (String howl : howls) {
				if (!howl.isEmpty()) {
					sb.append(howl).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
