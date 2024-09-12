package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-18 20min
// https://www.acmicpc.net/problem/25194
public class TheFridayOfTheShowdown {
	static int worksNum;
	static int[] works;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		worksNum = Integer.parseInt(br.readLine());
		works = new int[worksNum];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < worksNum; i++) {
			works[i] = Integer.parseInt(st.nextToken());
		}
		isExercisePossible(0, 0);
		isExercisePossible(0, works[0]);
		System.out.println(could ? "YES" : "NO");
	}

	static boolean could = false;

	// 시간 초과
	static void isExercisePossible(int idx, int sum) {

		if (could) {
			return;
		}

		if (sum % 7 == 4) {
			could = true;
		} else {
			if (idx + 1 >= worksNum) {
				return;
			}
			isExercisePossible(idx + 1, sum + works[idx + 1]);
			isExercisePossible(idx + 1, sum);
		}
	}
}
