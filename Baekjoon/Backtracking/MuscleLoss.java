package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 3 4
// 7 5 3
// 24-04-10 40min
// https://www.acmicpc.net/problem/18429
public class MuscleLoss {

	private static int[] muscle;
	private static int day;
	private static int loss;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		day = Integer.parseInt(st.nextToken());
		loss = Integer.parseInt(st.nextToken());
		visited = new boolean[day];

		st = new StringTokenizer(br.readLine());
		muscle = new int[day];
		for (int i = 0; i < day; i++) {
			muscle[i] = Integer.parseInt(st.nextToken());
		}

		int sum = 0;

		sum = getMoreThan500(500, 0);

		System.out.println(sum);

	}

	private static boolean[] visited;

	private static int getMoreThan500(int dayMuscle, int depth) {
		int sum = 0;
		if (depth == day) {
			// System.out.println(dayMuscle);
			if (dayMuscle < 500) {
				return sum;
			}
			return sum + 1;
		}
		for (int i = 0; i < day; i++) {

			if (!visited[i]) {
				visited[i] = true;
				dayMuscle += muscle[i];
				dayMuscle -= loss;
				if (dayMuscle < 500) {
					dayMuscle -= muscle[i];
					dayMuscle += loss;
					visited[i] = false;
					continue;
				}
				sum += getMoreThan500(dayMuscle, depth + 1);
				dayMuscle -= muscle[i];
				dayMuscle += loss;
				visited[i] = false;
			}
		}

		return sum;
	}
}
