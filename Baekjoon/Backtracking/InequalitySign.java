package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-05-16 35min
// https://www.acmicpc.net/problem/2529
public class InequalitySign {

	static char[] inequalitySigns;
	static int size;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		size = Integer.parseInt(br.readLine());
		temp = new int[size + 1];
		nums = new boolean[10];

		String string = br.readLine();
		inequalitySigns = new char[size];

		for (int i = 0; i < size; i++) {
			inequalitySigns[i] = string.charAt(2 * i);
		}

		for (int i = 0; i <= 9; i++) {
			nums[i] = true;
			temp[0] = i;
			calculate(1, i);
			nums[i] = false;
		}

		// string format으로 앞 부분 0 필수.
		System.out.printf("%0" + (size + 1) + "d" + "\n" + "%0" + (size + 1) + "d", max, min);

	}

	static int[] temp;
	static boolean[] nums;
	static long max = Long.MIN_VALUE;
	static long min = Long.MAX_VALUE;

	static void calculate(int depth, int prevNum) {
		if (depth == size + 1) {
			long tempSum = 0;
			for (int i = 0; i < size + 1; i++) {
				tempSum += (long)(temp[i] * Math.pow(10, size - i));
			}
			max = Math.max(max, tempSum);
			min = Math.min(min, tempSum);
			return;
		}

		// depth == 부등호 idx
		// curIdx == 숫자 idx
		for (int i = 0; i <= 9; i++) {
			if (!nums[i]
				&& ((inequalitySigns[depth - 1] == '<' && prevNum < i)
				|| (inequalitySigns[depth - 1] == '>' && prevNum > i))) {
				nums[i] = true;
				temp[depth] = i;
				calculate(depth + 1, i);
				nums[i] = false;
			}
		}
	}

}
