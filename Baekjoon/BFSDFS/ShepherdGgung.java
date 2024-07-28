package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-28 20min
// https://www.acmicpc.net/problem/3187
public class ShepherdGgung {
	static int row;
	static int col;
	static char[][] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());

		map = new char[row][col];
		for (int i = 0; i < row; i++) {
			String str = br.readLine();
			for (int j = 0; j < col; j++) {
				map[i][j] = str.charAt(j);
			}
		}

		int wolves = 0;
		int sheep = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (map[i][j] != '#') {
					int lives = calc(i, j);
					if (lives >= 0) {
						wolves += lives;
					} else {
						sheep += (-lives);
					}
				}
			}
		}
		System.out.println(sheep + " " + wolves);
	}

	static int[][] dir = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

	static int calc(int startR, int startC) {

		int sheep = 0;
		int wolves = 0;
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC});
		if (map[startR][startC] == 'v') {
			wolves++;
		} else if (map[startR][startC] == 'k') {
			sheep++;
		}
		map[startR][startC] = '#';

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int r = poll[0];
			int c = poll[1];

			for (int i = 0; i < 4; i++) {
				int tempR = r + dir[i][0];
				int tempC = c + dir[i][1];
				if (tempR >= 0 && tempR < row
					&& tempC >= 0 && tempC < col
					&& map[tempR][tempC] != '#') {
					if (map[tempR][tempC] == 'v') {
						wolves++;
					} else if (map[tempR][tempC] == 'k') {
						sheep++;
					}
					que.add(new int[] {tempR, tempC}); // que에 넣는 걸 잊지 말자..
					map[tempR][tempC] = '#';
				}
			}
		}

		if (wolves >= sheep) {
			return wolves;
		} else {
			return -sheep;
		}
	}
}
