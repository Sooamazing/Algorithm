package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-03-21 10min
// https://www.acmicpc.net/problem/2876
public class GraphicsQuiz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());
		int[] dp = new int[5 + 1];
		int maxStudent = 0;
		int minGrade = 5;
		while (total-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			for (int i = 1; i <= 5; i++) {
				// 가장 길게 이을 수 있는 Grade 찾기
				if (i == first || i == second) {
					dp[i]++;
					if (dp[i] > maxStudent) {
						maxStudent = dp[i];
						minGrade = i;
					}
					continue;
				}
				// 이전 책상에 있는 학생과 이어지지 않으면 0으로 초기화
				dp[i] = 0;
			}
		}

		System.out.println(maxStudent + " " + minGrade);

	}
}
