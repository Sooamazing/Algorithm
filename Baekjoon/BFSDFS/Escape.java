package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-24 60min
// https://www.acmicpc.net/problem/3055
// 반례: https://www.acmicpc.net/board/view/125622
public class Escape {

	static int row;
	static int col;
	static char[][] forest;
	static int[][] dir = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	// static Queue<int[]> hedgehogMove = new LinkedList<>();
	static Queue<int[]> firstWater = new LinkedList<>();
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		// char 배열 이용
		forest = new char[row][col];
		visited = new boolean[row][col];
		int r = 0;
		int c = 0;
		for (int i = 0; i < row; i++) {
			String str = br.readLine();
			for (int j = 0; j < col; j++) {
				char cur = forest[i][j] = str.charAt(j);
				if (cur == 'S') {
					r = i;
					c = j;
				} else if (cur == '*') {
					firstWater.add(new int[] {i, j, 0, 0});
				} else if (cur == 'X') {
					visited[i][j] = true;
				}
			}
		}

		int ans = goCave(r, c);

		System.out.println(ans == -1 ? "KAKTUS" : ans);

	}

	static int goCave(int startR, int startC) {
		int distance = 0;

		Queue<int[]> hedgehogMove = new LinkedList<>();

		// 고슴도치 이동 준비
		hedgehogMove.add(new int[] {startR, startC, 0, 0});
		visited[startR][startC] = true;
		// 물이 차오를 곳은 갈 수 없으니 1초 먼저 물 이동.
		while (!firstWater.isEmpty()) {
			int[] firstWaterPoll = firstWater.poll();
			int firstWaterR = firstWaterPoll[0];
			int firstWaterC = firstWaterPoll[1];
			visited[firstWaterR][firstWaterC] = true;
			for (int k = 0; k < 4; k++) {
				int tempWaterR = firstWaterR + dir[k][0];
				int tempWaterC = firstWaterC + dir[k][1];
				if (tempWaterR >= 0 && tempWaterR < row
					&& tempWaterC >= 0 && tempWaterC < col
				) {
					if (forest[tempWaterR][tempWaterC] == '.') {
						visited[tempWaterR][tempWaterC] = true;
						forest[tempWaterR][tempWaterC] = '*';
						hedgehogMove.add(new int[] {tempWaterR, tempWaterC, 1, 1});
					}
				}
			}
		}

		while (!hedgehogMove.isEmpty()) {
			int[] poll = hedgehogMove.poll();
			int r = poll[0];
			int c = poll[1];
			int cur = poll[3]; // 0이면 고슴도치, 1이면 물
			if (forest[r][c] == 'D') {
				distance = poll[2];
				break;
			}

			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];
				if (tempR >= 0 && tempR < row
					&& tempC >= 0 && tempC < col
					&& !visited[tempR][tempC]
				) {
					if (cur == 0 && forest[tempR][tempC] != '*') {
						// 디버깅 용
						// forest[r][c] = '.';
						// forest[tempR][tempC] = 'S';
						visited[tempR][tempC] = true;
						hedgehogMove.add(new int[] {tempR, tempC, poll[2] + 1, 0});
					}
					if (cur == 1 && forest[tempR][tempC] == '.') {
						visited[tempR][tempC] = true;
						forest[tempR][tempC] = '*';
						hedgehogMove.add(new int[] {tempR, tempC, poll[2] + 1, 1});
					}
				}
			}

		}

		// 못 가면 -1
		return distance == 0 ? -1 : distance;
	}
}
