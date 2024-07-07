package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-07 20min
// https://www.acmicpc.net/problem/1389
public class KevinBaconsSixStepLaw {

	static int[] results;
	static int userNum, relationshipNum;
	static boolean[][] relationship;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		userNum = Integer.parseInt(st.nextToken());
		relationshipNum = Integer.parseInt(st.nextToken());

		relationship = new boolean[userNum + 1][userNum + 1]; // 최대 100개라 인접 배열로 가능.
		for (int i = 0; i < relationshipNum; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			relationship[a][b] = relationship[b][a] = true;
		}

		results = new int[userNum + 1];
		for (int i = 1; i <= userNum; i++) {
			visit = new boolean[userNum + 1];
			calc(i);
		}

		int result = Integer.MAX_VALUE;
		int ans = 0;
		for (int i = 1; i <= userNum; i++) {
			if (result > results[i]) {
				result = results[i];
				ans = i;
			}
		}

		System.out.println(ans);

	}

	static boolean[] visit;

	static void calc(int userIdx) {

		Queue<int[]> que = new LinkedList<>();
		for (int i = 1; i <= userNum; i++) {
			if (relationship[userIdx][i]) {
				que.add(new int[] {i, 1});
				visit[i] = true;
				results[userIdx]++;
			}
		}

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int tempUser = poll[0];
			int distance = poll[1];

			for (int i = 1; i <= userNum; i++) {
				if (relationship[tempUser][i] && !visit[i]) {
					que.add(new int[] {i, distance + 1});
					visit[i] = true;
					results[userIdx] += distance + 1;
				}
			}
		}
	}
}
