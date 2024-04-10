package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 24-04-10 120min
// https://www.acmicpc.net/problem/16943
// 1000 1000
// 424 333
public class RearrangementOfNumbers {

	private static int length;
	private static char[] std;
	private static char[] prev;
	private static int firstNum;
	private static int target;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");

		std = split[0].toCharArray();
		Arrays.sort(std);
		firstNum = Integer.parseInt(split[0]);
		target = Integer.parseInt(split[1]);

		length = std.length;
		visited = new boolean[length];
		prev = new char[length];
		Arrays.fill(prev, '0');

		System.out.println(getLessThan(0, new char[length]));

	}

	private static boolean[] visited;

	private static int getLessThan(int depth, char[] cur) {

		int result = -1;

		if (depth == length) {

			int curNum = Integer.parseInt(new String(cur));

			if (curNum >= target) {
				int temp = Integer.parseInt(new String(prev));
				if (temp < target
					&& firstNum != temp
					&& (int)(temp / (Math.pow(10, length - 1))) != 0) {
					result = temp;
				}
			} else {
				int i = 0;
				for (char c : cur) {
					prev[i++] = c;
				}
			}
			return result;
		}

		for (int i = 0; i < length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				cur[depth] = std[i];
				result = getLessThan(depth + 1, cur);
				// if (result != -1)
				// 	return result;
				visited[i] = false;
			}

		}
		return result;
	}
}
