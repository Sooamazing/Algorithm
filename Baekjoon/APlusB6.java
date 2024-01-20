package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusB6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(",");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			System.out.println(a + b);
		}
	}
}
