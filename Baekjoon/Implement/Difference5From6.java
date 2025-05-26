package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-26 5min
// https://www.acmicpc.net/problem/2864
public class Difference5From6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = st.nextToken();
		String b = st.nextToken();

		int max = Integer.parseInt(a.replace("5", "6")) + Integer.parseInt(b.replace("5", "6"));
		int min = Integer.parseInt(a.replace("6", "5")) + Integer.parseInt(b.replace("6", "5"));

		System.out.println(min + " " + max);
	}
}
