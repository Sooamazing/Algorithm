package Baekjoon.floydwarshall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-07-27 75min
// https://www.acmicpc.net/problem/2660
public class ElectingTheChairman {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int candidateNum = Integer.parseInt(br.readLine());
		List[] relationship = new List[candidateNum + 1];
		StringTokenizer st;
		for (int i = 1; i < candidateNum + 1; i++) {
			relationship[i] = new ArrayList<Integer>();
		}
		while (true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == -1)
				break;
			int m = Integer.parseInt(st.nextToken());
			relationship[n].add(m);
			relationship[m].add(n);
		} // 관계 입력 완료

		// 후보자 한 명씩 관계 점수 구하기
		int[] mins = new int[candidateNum + 1];
		int cnt = 0;
		int min = candidateNum + 1;
		for (int i = 1; i < candidateNum + 1; i++) {

			int max = 0;
			int goal = candidateNum - 1; // 방문해야 하는 수
			int[] degree = new int[candidateNum + 1];

			Arrays.fill(degree, candidateNum + 1); // max 값으로 초기화

			PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}); // 도착지, 비용

			pq.add(new int[] {i, 0});
			degree[i] = 0; // 자기 자신은 0으로 초기화
			while (goal > 0 && !pq.isEmpty()) {
				int[] poll = pq.poll();
				int destination = poll[0];
				int expense = poll[1];

				// 현재 친구와 연결된 친구 방문하기.
				List<Integer> friendsWithCur = relationship[destination];
				for (int j = 0; j < friendsWithCur.size(); j++) {
					int friend = friendsWithCur.get(j);
					// 이전 방문 비용보다 현재 방문 비용이 작은 경우 방문 처리.
					int curExpense = expense + 1;
					if (degree[friend] > curExpense) {
						goal--;
						degree[friend] = curExpense;
						pq.add(new int[] {friend, curExpense});

						max = Math.max(curExpense, max);
					}
				}
			}

			// mins 집합에 점수 입력
			mins[i] = max;
			if (min > max) {
				// 최솟값 갱신되면 min값, cnt = 1 초기화
				cnt = 1; // 초기화 0이 아닌 1 주의.
				min = max;
			} else if (min == max) {
				// 최솟값과 같다면 cnt++;
				cnt++;
			}
		}

		sb.append(min).append(" ").append(cnt).append("\n");
		for (int i = 1; i < candidateNum + 1; i++) {
			if (mins[i] == min) {
				sb.append(i).append(" ");
			}
		}

		System.out.println(sb);
	}
}
