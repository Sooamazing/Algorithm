package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-25 5min
// https://www.acmicpc.net/problem/5596
public class TestScores {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minkookScore = 0;
		int manseScore = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			minkookScore += Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			manseScore += Integer.parseInt(st.nextToken());
		}

		int result = 0;
		if (minkookScore >= manseScore) {
			result = minkookScore;
		} else {
			result = manseScore;
		}

		System.out.println(result);

	}
}
