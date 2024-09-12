package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-08-21 60min
// https://acmicpc.net/problem/30036
public class Ink {

	static int size;
	static int inkNum;
	static int cmdNum;
	static char[][] stages;
	static String ink;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		inkNum = Integer.parseInt(st.nextToken());
		size = Integer.parseInt(st.nextToken());
		cmdNum = Integer.parseInt(st.nextToken());
		stages = new char[size][size];
		ink = br.readLine();
		int startR = 0;
		int startC = 0;
		for (int i = 0; i < size; i++) {
			String str = br.readLine();
			for (int j = 0; j < size; j++) {
				stages[i][j] = str.charAt(j);
				if (stages[i][j] == '@') {
					stages[i][j] = '.';
					startR = i;
					startC = j;
				}
			}
		}
		String cmds = br.readLine();

		int inkCharged = 0;
		int inkIdx = 0;
		for (int i = 0; i < cmdNum; i++) {
			char cmd = cmds.charAt(i);

			if (cmd == 'j') {
				// 잉크 충전
				inkCharged++;
			} else if (cmd == 'J') {
				// 점프
				for (int j = 0; j < 4; j++) {
					for (int k = 0; k < inkCharged + 1; k++) {
						for (int l = 0; l < inkCharged + 1; l++) {
							int tempR = startR + dir[j][0] * k;
							int tempC = startC + dir[j][1] * l;
							if (tempR >= 0 && tempR < size && tempC >= 0 && tempC < size
								&& k + l <= inkCharged
								&& stages[tempR][tempC] != '.') {
								stages[tempR][tempC] = ink.charAt(inkIdx);
								// break;
							}
						}
					}
				}

				// 충전 잉크 소진으로 0
				inkCharged = 0;
				// ink 문자열 원형 큐 모양으로 돎.
				inkIdx = (inkIdx + 1) % inkNum;
			} else {
				int[] dir;
				switch (cmd) {
					case 'U':
						dir = new int[] {-1, 0};
						break;
					case 'D':
						dir = new int[] {1, 0};
						break;
					case 'L':
						dir = new int[] {0, -1};
						break;
					default: // 'R'
						dir = new int[] {0, 1};
				}
				int tempR = startR + dir[0];
				int tempC = startC + dir[1];

				// 갈 수 있는 경우('.'인 경우), 해당 위치로 이동.
				if (tempR >= 0 && tempR < size && tempC >= 0 && tempC < size && stages[tempR][tempC] == '.') {
					startR = tempR;
					startC = tempC;
				}
			}

		}

		stages[startR][startC] = '@';
		for (char[] stage : stages) {
			for (char v : stage) {
				sb.append(v);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

	static int[][] dir = new int[][] {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

	static void bfs(int startR, int startC) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC});

		while (que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];

			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];

				if (tempR >= 0 && tempR < size && tempC >= 0 && tempC < size && stages[tempR][tempC] != '#') {

				}
			}

		}
	}
}
