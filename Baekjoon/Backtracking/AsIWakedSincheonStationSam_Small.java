package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-09 20min
// https://www.acmicpc.net/problem/14650
public class AsIWakedSincheonStationSam_Small {
	private static int digit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		digit = Integer.parseInt(br.readLine());
		temp = new int[digit];
		// visited = new boolean[digit];

		nums = new int[] {0, 1, 2};

		System.out.println(getThreeMultipleNum(1, 0));

	}

	private static int[] temp;
	private static int[] nums;
	// private static boolean[] visited;

	private static int getThreeMultipleNum(int idx, int depth) {
		int sum = 0;
		if (depth == digit) {
			// System.out.println(Arrays.toString(temp));
			int sum3 = 0;
			for (int t : temp) {
				sum3 += t;
			}
			if (sum3 % 3 == 0) {
				return 1;
			}
			return 0;
		}

		for (int i = idx; i < 3; i++) {
			// if (!visited[i]) {
			// visited[i] = true;
			temp[depth] = nums[i];
			sum += getThreeMultipleNum(0, depth + 1);
			//visited[i] = false;
			// }
		}

		return sum;
	}
}
