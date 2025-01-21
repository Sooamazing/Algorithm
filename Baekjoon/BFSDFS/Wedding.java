package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

// 25-01-21 30min
// https://www.acmicpc.net/problem/5567
public class Wedding {
	private static int friends;
	private static boolean[][] isFriend;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		friends = Integer.parseInt(br.readLine());
		int relations = Integer.parseInt(br.readLine());

		StringTokenizer st;
		isFriend = new boolean[friends + 1][friends + 1];
		for (int i = 0; i < relations; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			isFriend[a][b] = isFriend[b][a] = true;
		}

		int result = calculateInvitations(0, 1);
		System.out.println(result);
	}

	private static int calculateInvitations(int startDepth, int start) {
		Set<Integer> invitations = new HashSet<>();
		invitations.add(start); // 시작 1 추가

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startDepth, start});

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int depth = poll[0];
			int current = poll[1];

			for (int i = 1; i <= friends; i++) {
				// 친구가 아니면 넘어감.
				if (!isFriend[current][i]) {
					continue;
				}

				// 친구인 경우
				if (depth == 0) {
					que.add(new int[] {depth + 1, i});
					invitations.add(i);
				}

				// 친구의 친구인 경우
				if (depth == 1) {
					invitations.add(i);
				}
			}

		}

		return invitations.size() - 1; // start 1 제외
	}
}
