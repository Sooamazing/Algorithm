package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-30 50min (참고)
// https://www.acmicpc.net/problem/14728
public class Cramming {
	static int maxTime;
	static int subjectNum;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		subjectNum = Integer.parseInt(st.nextToken());
		maxTime = Integer.parseInt(st.nextToken());

		//maxTime+1 이유?
		int[][] dp = new int[subjectNum + 1][maxTime + 1];
		for (int i = 1; i <= subjectNum; i++) {
			st = new StringTokenizer(br.readLine());
			int time = Integer.parseInt(st.nextToken());
			int score = Integer.parseInt(st.nextToken());
			for (int j = 0; j <= maxTime; j++) {
				if (j < time) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - time] + score);
				}
			}
			// for (int j = maxTime; j >= time; j--) {
			// 	dp[j] = Math.max(dp[j], dp[j - time] + score);
			// }
		}

		System.out.println(dp[subjectNum][maxTime]);

		// int[] subjects = new int[subjectNum];
		// int[] scores = new int[subjectNum];
		// boolean[] visit = new boolean[subjectNum];

		// for (int i = 0; i < subjectNum; i++) {
		// 	st = new StringTokenizer(br.readLine());
		// 	subjects[i] = Integer.parseInt(st.nextToken());
		// 	scores[i] = Integer.parseInt(st.nextToken());
		// }

		// cramming(subjects, scores, 0, 0, 0);

		// System.out.println(maxScore);
	}

	static int maxScore = 0;

	static void cramming(int[] subjects, int[] scores, int curIdx, int time, int score) {
		if (time > maxTime) {
			return;
		} else if (curIdx == subjectNum) {
			maxScore = Math.max(score, maxScore);
			return;
		}
		maxScore = Math.max(score, maxScore);
		cramming(subjects, scores, curIdx + 1, time, score);
		cramming(subjects, scores, curIdx + 1, time + subjects[curIdx], score + scores[curIdx]);

	}
}
