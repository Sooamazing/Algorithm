package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 25-01-31 15min
// https://www.acmicpc.net/problem/17952
public class EndlessAssignment {
	static int totalScore = 0;
	static Stack<Assignment> assignments;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		totalScore = 0;
		assignments = new Stack<>(); // 점수, 남은 시간(분)
		StringTokenizer st;
		int score = 0;
		int time = 0;
		for (int i = 0; i < total; i++) {
			st = new StringTokenizer(br.readLine());
			int command = Integer.parseInt(st.nextToken());
			if (command == 0) {
				Assignment assignment = takeAssignment(score, time);
				score = assignment.score;
				time = assignment.time;
				continue;
			}
			// 새로운 과제가 있는 경우
			// 기존 과제가 아직 남아 있다면, 과제 목록에 집어 넣기
			if (time > 0) {
				assignments.push(new Assignment(score, time));
			}
			// 새로운 과제 시작
			score = Integer.parseInt(st.nextToken());
			time = Integer.parseInt(st.nextToken());

			Assignment assignment = takeAssignment(score, time);
			score = assignment.score;
			time = assignment.time;
		}

		System.out.println(totalScore);
	}

	private static Assignment takeAssignment(int score, int time) {
		time--;
		if (time == 0) {
			// 다 끝났으면 점수 추가
			totalScore += score;
			// 새로운 과제 할당
			if (!assignments.isEmpty()) {
				Assignment pop = assignments.pop();
				score = pop.score;
				time = pop.time;
			}
		}

		return new Assignment(score, time);
	}

	private static class Assignment {
		int score;
		int time;

		public Assignment(int score, int time) {
			this.score = score;
			this.time = time;
		}
	}
}
