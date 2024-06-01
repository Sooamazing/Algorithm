package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-06-01 15min
// https://www.acmicpc.net/problem/15723
public class NUnitArgument {

	static char[] parent;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stateNum = Integer.parseInt(br.readLine());

		parent = new char[26];
		Arrays.fill(parent, 'F');
		for (int i = 0; i < stateNum; i++) {
			String str = br.readLine();
			char a = str.charAt(0);
			char b = str.charAt(5);
			parent[a - 'a'] = b;
		}

		StringBuilder sb = new StringBuilder();
		int caseNum = Integer.parseInt(br.readLine());
		for (int i = 0; i < caseNum; i++) {
			String str = br.readLine();
			char a = str.charAt(0);
			char b = str.charAt(5);

			sb.append(find(a, b)).append('\n');
		}

		System.out.println(sb);

	}

	static char find(char x, char y) {
		if (parent[x - 'a'] == 'F') {
			return 'F';
		} else if (parent[x - 'a'] == y) {
			return 'T';
		} else {
			return find(parent[x - 'a'], y);
		}
	}
}
