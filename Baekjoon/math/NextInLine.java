package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-15 5min
// https://www.acmicpc.net/problem/6749
public class NextInLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int low = Integer.parseInt(br.readLine());
		int middle = Integer.parseInt(br.readLine());

		System.out.println(middle + (middle - low));

	}
}
