package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-07-25 5min, 24-09-28 25min
// https://www.acmicpc.net/problem/6443
public class Anagram {
	static char[] charArr;

	static char[] temp;
	static boolean[] visited;
	static int length;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());
		while (testCase-- > 0) {

			String str = br.readLine();
			length = str.length();
			charArr = str.toCharArray();
			Arrays.sort(charArr);
			temp = new char[length];
			visited = new boolean[length];

			calcAnagram(0, 0);
		}

		System.out.println(sb);
	}

	static void calcAnagram(int idx, int depth) {
		if (idx == length) {
			for (char c : temp) {
				sb.append(c);
			}
			sb.append('\n');
			return;
		}

		char prev = '0'; // 임의의 값으로 초기화
		for (int i = 0; i < length; i++) {
			// 이미 방문한 경우와 현재 depth에서 이전에 방문한 문자와 같은 경우 제외
			if (visited[i] || prev == charArr[i]) {
				continue;
			}
			visited[i] = true;
			temp[depth] = charArr[i];
			calcAnagram(idx + 1, depth + 1);
			visited[i] = false;

			prev = charArr[i];
		}
	}
}
