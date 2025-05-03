package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-03 5min
// https://www.acmicpc.net/problem/10824
public class FourNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long first = Long.parseLong(st.nextToken() + st.nextToken());
		long second = Long.parseLong(st.nextToken() + st.nextToken());
		long result = first + second;

		System.out.println(result);
	}
}
