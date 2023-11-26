// https://www.acmicpc.net/problem/3758

package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KCPC {

	// 최종 점수 DESC, 제출 횟수 ASD, 마지막 제출 시간 ASD
	static final int TOTAL_SCORE = 0;
	static final int CNT_SUBMITTED = 1;
	static final int LAST_SUBMITTED = 2;

	public static void main(String[] args) throws IOException {
		// 	풀이를 제출한 팀의 ID, 문제 번호, 점수가 서버의 로그에 제출되는 시간 순서대로 저장
		// 	최고 점수가 그 문제에 대한 최종 점수가 된다
		// 	당신 팀의 최종 점수는 각 문제에 대해 받은 점수의 총합이고, 당신의 순위는 (당신 팀보다 높은 점수를 받은 팀의 수)+1
		// 	최종 점수가 같은 경우, 풀이를 제출한 횟수가 적은 팀의 순위가 높다.
		// 	최종 점수도 같고 제출 횟수도 같은 경우, 마지막 제출 시간이 더 빠른 팀의 순위가 높다.
		// 	당신 팀의 순위를 계산하는 프로그램을 작성

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T -- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 팀의 개수 n, 문제의 개수 k, 당신 팀의 ID t, 로그 엔트리의 개수 m
			// 3 ≤ n, k ≤ 100, 1 ≤ t ≤ n, 3 ≤ m ≤ 10,000
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int t = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			// 최종 점수 DESC, 제출 횟수 ASD, 마지막 제출 시간 ASD 순으로 정렬할 pq 생성
			PriorityQueue<int[]> pq = new PriorityQueue<>(
				((o1, o2) -> {
					if (o2[TOTAL_SCORE] == o1[TOTAL_SCORE]) {
						if (o2[CNT_SUBMITTED] == o1[CNT_SUBMITTED]) {
							return o1[LAST_SUBMITTED] - o2[LAST_SUBMITTED];
						}
						return o1[CNT_SUBMITTED] - o2[CNT_SUBMITTED];
					}
					return o2[TOTAL_SCORE] - o1[TOTAL_SCORE];
				})
			);

			// result[][] 팀 ID i, 문제 번호 j에 획득한 점수 s
			int[][] result = new int[n + 1][k + 1];
			// 각 팀 ID i에 마지막 제출 순서
			int[] lastTime = new int[n + 1];
			int[] cntSubmitted = new int[n + 1];
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int teamId = Integer.parseInt(st.nextToken());
				int quizNum = Integer.parseInt(st.nextToken());
				int prevScore = result[teamId][quizNum];
				int newScore = Integer.parseInt(st.nextToken());

				if (prevScore < newScore) {
					result[teamId][quizNum] = newScore;
					result[teamId][0] = result[teamId][0] - prevScore + newScore;
				}

				cntSubmitted[teamId] += 1;
				lastTime[teamId] = i + 1;
			}

			// 최종 점수 DESC, 제출 횟수 ASD, 마지막 제출 시간 ASD, teamId
			for (int i = 1; i < n + 1; i++) {
				pq.add(new int[] {result[i][0], cntSubmitted[i], lastTime[i], i});
			}

			int grade = 0;
			while (true) {
				++grade;
				int[] cur = pq.poll();
				if (cur[3] == t) {
					sb.append(grade).append('\n');
					break;
				}
			}

		}

		System.out.println(sb);

	}
}
