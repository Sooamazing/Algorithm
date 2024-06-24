package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-24 25min
// https://www.acmicpc.net/problem/1527
public class TheNumberOfGoldMinsu {

	static long start, end;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String str = st.nextToken();
		int startLength = str.length();
		start = Integer.parseInt(str);
		str = st.nextToken();
		int endLength = str.length();
		end = Integer.parseInt(str);

		int result = 0;
		for (int i = startLength; i <= endLength; i++) {
			temp = new int[i];
			// int curNum = Integer.parseInt("4".repeat(i - 1) + "0");
			result += getGodMinsu(i, 0);
			// System.out.println(i);
		}

		System.out.println(result);
	}

	static int[] temp;
	static int[] nums = new int[] {4, 7};

	static int getGodMinsu(int digitNum, int depth) {

		if (digitNum == depth) {
			long num = 0;
			for (int v : temp) {
				num *= 10;
				num += v;
			}
			if (num >= start
				&& num <= end) {
				// System.out.println(num);
				return 1;
			}
			return 0;
		}

		int result = 0;
		for (int i = 0; i < 2; i++) {
			temp[depth] = nums[i];
			result += getGodMinsu(digitNum, depth + 1);
			// int tempNum = curNum * 10 + nums[i];
			// if (tempNum >= start
			// 	&& tempNum <= end) {
			// 	System.out.println(tempNum);
			// 	result += getGodMinsu(digitNum, depth + 1, tempNum);
			// }
		}
		return result;
	}
}
