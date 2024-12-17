package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 24-12-17 5min
// https://www.acmicpc.net/problem/11718
public class PrintAsIs2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// br.lines() == Stream<String>
		br.lines().forEach(s -> sb.append(s).append("\n"));

		System.out.println(sb);
	}
}
