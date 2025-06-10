package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-10 5min
// https://www.acmicpc.net/problem/11948
public class SubjectChoice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int totalScore = 0;
		int min = 100;
		for (int i = 0; i < 4; i++) {
			int score = Integer.parseInt(br.readLine());
			totalScore += score;
			min = Math.min(score, min);
		}
		totalScore -= min;
		min = 100;
		for (int i = 0; i < 2; i++) {
			int score = Integer.parseInt(br.readLine());
			totalScore += score;
			min = Math.min(score, min);
		}
		totalScore -= min;

		System.out.println(totalScore);
	}
}
