package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-09-07 15min
// https://www.acmicpc.net/problem/3190
public class Snake {
	static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // R, D, L, U
	static int size, appleNum, dirNum;
	static boolean[][] map, snake;
	static Queue<int[]> dirQueue, snakeQueue;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(br.readLine());
		appleNum = Integer.parseInt(br.readLine());
		map = new boolean[size + 1][size + 1];
		snake = new boolean[size + 1][size + 1];
		StringTokenizer st;
		for (int i = 0; i < appleNum; i++) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
		}

		dirNum = Integer.parseInt(br.readLine());
		dirQueue = new LinkedList<>();
		for (int i = 0; i < dirNum; i++) {
			st = new StringTokenizer(br.readLine());
			dirQueue.add(new int[] {Integer.parseInt(st.nextToken()), st.nextToken().charAt(0) == 'D' ? 1 : 3});
		}

		snakeQueue = new LinkedList<>();

		System.out.println(move());

	}

	// with Copilot
	static int move() {
		int[] head = {1, 1};
		int[] tail = {1, 1};
		int d = 0;
		int time = 0;
		snake[1][1] = true;
		snakeQueue.add(new int[] {1, 1});
		while (true) {
			time++;
			head[0] += dir[d][0];
			head[1] += dir[d][1];
			if (head[0] < 1 || head[0] > size || head[1] < 1 || head[1] > size || snake[head[0]][head[1]]) {
				break;
			}
			snake[head[0]][head[1]] = true;
			snakeQueue.add(new int[] {head[0], head[1]});
			if (map[head[0]][head[1]]) {
				map[head[0]][head[1]] = false;
			} else {
				int[] tailPos = snakeQueue.poll();
				snake[tailPos[0]][tailPos[1]] = false;
			}
			if (!dirQueue.isEmpty() && dirQueue.peek()[0] == time) {
				d = (d + dirQueue.poll()[1]) % 4;
			}
		}
		return time;
	}
}
