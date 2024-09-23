package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-09-23 30min
// https://www.acmicpc.net/problem/16493
public class MaximumNumberOfPages {
	static int daysMax;
	static int chapterNum;
	static int[][] chapterPages;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		daysMax = Integer.parseInt(st.nextToken());
		chapterNum = Integer.parseInt(st.nextToken());
		chapterPages = new int[chapterNum][2];

		for (int i = 0; i < chapterNum; i++) {
			st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken());
			int pages = Integer.parseInt(st.nextToken());
			chapterPages[i][0] = day;
			chapterPages[i][1] = pages;
			// for (int j = 1; j <= pagesNum; j++) {
			// 	dayPages[i][j] = dayPages[i - 1][j];
			// 	if (j >= pages) {
			// 		dayPages[i][j] = Math.max(dayPages[i][j], dayPages[i - 1][j - pages] + day);
			// 	}
			// }
		}

		Arrays.sort(chapterPages, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			}
			return a[0] - b[0];
		});
		getMaximumPages(0, chapterPages[0][0], chapterPages[0][1]);
		getMaximumPages(0, 0, 0);
		System.out.println(maxPage);
	}

	static int maxPage = 0;

	static void getMaximumPages(int idx, int day, int page) {
		if (day > daysMax) {
			return;
		}
		maxPage = Math.max(page, maxPage);
		if (idx + 1 >= chapterNum) {
			return;
		}

		getMaximumPages(idx + 1, day + chapterPages[idx + 1][0], page + chapterPages[idx + 1][1]);
		getMaximumPages(idx + 1, day, page);

		// int[][] dp = new int[daysNum + 1][pagesNum + 1];
		// for (int i = 1; i <= daysNum; i++) {
		// 	for (int j = 1; j <= pagesNum; j++) {
		// 		dp[i][j] = dp[i - 1][j];
		// 		if (j >= dayPages[i][1]) {
		// 			dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - dayPages[i][1]] + dayPages[i][0]);
		// 		}
		// 	}
		// }
		// return dp[daysNum][pagesNum];
	}
}
