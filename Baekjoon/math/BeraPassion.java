package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-12 3min
// http://acmicpc.net/problem/15439
public class BeraPassion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());

		System.out.println(total * (total - 1));
	}
}
