package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-04 1min
// https://www.acmicpc.net/problem/18108
public class BornIn1998HereAndBornIn2541InThailand {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());

		System.out.println(year - 543);
	}
}
