package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoArmedScale {

	static int weightNum, total;
	static int[] weights;
	static boolean[] results;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		weightNum = Integer.parseInt(br.readLine());
		weights = new int[weightNum];
		visit = new boolean[weightNum];
		StringTokenizer st = new StringTokenizer(br.readLine());

		total = 0;
		for (int i = 0; i < weightNum; i++) {
			weights[i] = Integer.parseInt(st.nextToken());
			total += weights[i];
		}

		results = new boolean[total + 1];
		for (int i = 0; i <= weightNum / 2; i++) {
			calculate(0, i, 0);
		}

		int result = 0;
		for (boolean v : results) {
			if (!v) {
				result++;
			}
		}

		System.out.println(result);

	}

	static void calculate(int depth, int goalDepth, int sum) {
		if (depth == goalDepth) {
			results[sum] = true;
			results[total - sum] = true;
			if (total - sum * 2 >= 0) {
				results[total - sum * 2] = true;
			}
		}

		for (int i = 0; i < weightNum; i++) {
			if (!visit[i]) {
				visit[i] = true;
				calculate(depth + 1, goalDepth, sum + weights[i]);
				visit[i] = false;
			}
		}

	}
}
