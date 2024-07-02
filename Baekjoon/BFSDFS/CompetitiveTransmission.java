package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-02 35min
// https://www.acmicpc.net/problem/18405
public class CompetitiveTransmission {
	static int tubeSize;
	static int[][] testTubes;
	// static PriorityQueue<int[]> pq;

	static Queue<int[]> que;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		tubeSize = Integer.parseInt(st.nextToken());
		int virusNum = Integer.parseInt(st.nextToken()); // 문제를 잘 읽자..! n*m이 아님.

		testTubes = new int[tubeSize][tubeSize];
		// { time, number, r, c }
		// pq = new PriorityQueue<>((o1, o2) -> {
		// 	if (o1[0] == o2[0]) {
		// 		return o1[1] - o2[1];
		// 	}
		// 	return o1[0] - o2[0];
		// });
		for (int i = 0; i < tubeSize; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < tubeSize; j++) {
				testTubes[i][j] = Integer.parseInt(st.nextToken());
				// pq.add(new int[] {0, testTubes[i][j], i, j});
			}
		}

		que = new LinkedList<>();
		for (int i = 1; i <= virusNum; i++) {
			for (int j = 0; j < tubeSize; j++) {
				for (int k = 0; k < tubeSize; k++) {
					if (testTubes[j][k] == i)
						que.add(new int[] {0, testTubes[j][k], j, k});
				}
			}
		}

		st = new StringTokenizer(br.readLine());
		int timeSecond = Integer.parseInt(st.nextToken());
		// 지문이 (1, 1)부터 시작하기 때문에 -1 처리.
		int goalRow = Integer.parseInt(st.nextToken()) - 1;
		int goalColumn = Integer.parseInt(st.nextToken()) - 1;

		timePasses(timeSecond);

		System.out.println(testTubes[goalRow][goalColumn]);
	}

	static int[][] dir = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

	static void timePasses(int goalTime) {
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int curTime = poll[0];
			if (curTime == goalTime)
				return;
			int curNum = poll[1];
			int curR = poll[2];
			int curC = poll[3];

			for (int i = 0; i < 4; i++) {
				int tempR = curR + dir[i][0];
				int tempC = curC + dir[i][1];
				if (tempR >= 0 && tempR < tubeSize && tempC >= 0 && tempC < tubeSize && testTubes[tempR][tempC] == 0) {
					testTubes[tempR][tempC] = curNum;
					// pq.add(new int[] {curTime + 1, curNum, tempR, tempC});
					que.add(new int[] {curTime + 1, curNum, tempR, tempC});
				}
			}
		}
	}
}
