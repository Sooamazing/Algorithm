package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-01 8min
// https://www.acmicpc.net/problem/2908
public class Snagsu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken();
		int aLen = a.length();
		int aReverse = 0;
		for (int i = aLen - 1; i >= 0; i--) {
			aReverse = (aReverse * 10 + (a.charAt(i) - '0'));
		}
		String b = st.nextToken();
		int bLen = b.length();
		int bReverse = 0;
		for (int i = bLen - 1; i >= 0; i--) {
			bReverse = (bReverse * 10 + (b.charAt(i) - '0'));
		}
		System.out.println(Math.max(aReverse, bReverse));
	}
}
