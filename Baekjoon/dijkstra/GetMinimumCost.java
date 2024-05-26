package Baekjoon.dijkstra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 24-05-16, 25 70min
// https://www.acmicpc.net/problem/1916
public class GetMinimumCost {

	static final int NODE = 0;
	static final int EXPENSE = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cityNum = Integer.parseInt(br.readLine());
		int busNum = Integer.parseInt(br.readLine());
		boolean[] visit = new boolean[cityNum + 1];

		PriorityQueue<int[]>[] pqArr = new PriorityQueue[cityNum + 1];
		for (int i = 1; i < cityNum; i++) {
			pqArr[i] = new PriorityQueue<>((o1, o2) -> o1[EXPENSE] - o2[EXPENSE]);
		}

		StringTokenizer st;
		for (int i = 0; i < busNum; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int expense = Integer.parseInt(st.nextToken());
			pqArr[start].add(new int[] {end, expense});
		}

		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int goal = Integer.parseInt(st.nextToken());

		// 정렬 조건 쓰지 않으면 CAST EXCEPTION - I cannot be cast to class java.lang.Comparable
		PriorityQueue<int[]> daPq = new PriorityQueue<>((o1, o2) -> {
			return o1[1] - o2[1];
		});
		daPq.add(new int[] {start, 0});
		while (!daPq.isEmpty()) {

			// 가장 비용이 작은 도시 방문
			int[] curInfo = daPq.poll();
			int curCity = curInfo[NODE];
			int curExpense = curInfo[EXPENSE];

			if (curCity == goal) {
				System.out.println(curExpense);
				return;
			}

			if (!visit[curCity]) {
				// 방문하지 않은 도시면 방문 처리
				visit[curCity] = true;
				// sum += curExpense;
				while (!pqArr[curCity].isEmpty()) {

					int[] nearIno = pqArr[curCity].poll();
					int nearCity = nearIno[0];
					int nearExpense = nearIno[1];

					daPq.add(new int[] {nearCity, curExpense + nearExpense});

				}
			}

		}

	}
}