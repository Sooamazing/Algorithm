package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-06-04 40min
// https://www.acmicpc.net/problem/14567
public class Prerequisite {
	static int[] semesters;
	static Queue<Integer>[] subjects;
	// static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int subjectNum = Integer.parseInt(st.nextToken());
		int prerequisiteNum = Integer.parseInt(st.nextToken());

		semesters = new int[subjectNum + 1];
		Arrays.fill(semesters, 1); // 목적은 선수과목 없는 경우 1개 수강 확인, 없으면 오류, why?
		subjects = new Queue[subjectNum + 1];
		visit = new boolean[subjectNum + 1];

		for (int i = 0; i < subjectNum + 1; i++) {
			subjects[i] = new LinkedList<>();
		}

		for (int i = 0; i < prerequisiteNum; i++) {
			st = new StringTokenizer(br.readLine());
			int pre = Integer.parseInt(st.nextToken());
			int curSubject = Integer.parseInt(st.nextToken());
			subjects[curSubject].add(pre);
		}

		// for (int i = 1; i <= subjectNum; i++) {
		// 	cnt = 0;
		// 	semesters[i] = find(i, 0);
		// }

		for (int i = 1; i <= subjectNum; i++) {
			if (!visit[i]) {
				calculate(i);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < subjectNum + 1; i++) {
			sb.append(semesters[i]).append(" ");
		}
		System.out.println(sb);

	}

	static boolean[] visit;

	static void calculate(int start) {

		visit[start] = true;

		while (!subjects[start].isEmpty()) {
			// 현재 과목의 선수 과목이 있다면
			int tempPoll = subjects[start].poll();
			if (!visit[tempPoll]) {
				calculate(tempPoll);
			} else {
				semesters[start] = Math.max(semesters[start], semesters[tempPoll] + 1);
			}
		}

		// return Math.max(depth, cnt);

		// Queue<Integer> que = new LinkedList<>();
		//
		// que.add(start);
		// while (!que.isEmpty()) {
		// 	int cur = que.poll(); // 현재 과목
		// 	while (!subjects[cur].isEmpty()) {
		// 		// 현재 과목의 선수 과목이 있다면
		// 		int tempPoll = subjects[cur].poll();
		//
		// 	}
		//
		// }

	}

	// static int find(int cur, int goal) {
	// 	cnt++;
	// 	if (subjects[cur] == 0) {
	// 		return cnt;
	// 	} else {
	// 		return find(subjects[cur], goal);
	// 	}
	// }
}