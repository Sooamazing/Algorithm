package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class RobotVacuumCleaner {

	static int rowNum;
	static int colNum;
	static int[][] room;
	static int cleanCount;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		rowNum = Integer.parseInt(st.nextToken());
		colNum = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int startRow = Integer.parseInt(st.nextToken());
		int startCol = Integer.parseInt(st.nextToken());
		int direction = Integer.parseInt(st.nextToken());

		room = new int[rowNum][colNum];
		for (int i = 0; i < rowNum; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < colNum; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		cleanRoom(startRow, startCol, direction);

		System.out.println();
	}

	static int[] dr = {-1, 0, 1, 0}; // 북부터 반시계 방향 유지.
	static int[] dc = {0, 1, 0, -1};

	static void cleanRoom(int startRow, int startCol, int direction) {

		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startRow, startCol, direction});

		if (room[startRow][startCol] == 0) {
			room[startRow][startCol] = 1;
			cleanCount++;
		}

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int curR = poll[0];
			int curC = poll[1];
			int curDir = poll[2];

			boolean allClean = true;
			
			// 바라보는 뱡향부터 가야 함.
			for (int i = 0; i < 4; i++) {
				int tempR = curR + dr[i];
				int tempC = curC + dc[i];

				// 이미 청소됐으면
				if (tempR >= 0 && tempR < rowNum
					&& tempC >= 0 && tempC < colNum
					&& room[tempR][tempC] != 0) {
					allClean = false;
				}
			}

			// 4칸 전부 청소되었으면
			if (allClean) {
				int tempR = curR - dr[direction];
				int tempC = curC - dc[direction];
				if (tempR >= 0
					&& tempR < rowNum
					&& tempC >= 0
					&& tempC < colNum) {
					que.add(new int[] {tempR, tempC, direction});
				}
			} else {
				// 청소되지 않은 빈 칸이 있는 경우

			}

		}

		// copilot
		// int curRow = startRow;
		// int curCol = startCol;
		// int curDirection = direction;

		// while (true) {
		// 	// 현재 위치 청소
		// 	room[curRow][curCol] = 2;
		//
		// 	// 네 방향 모두 청소가 되어있거나 벽인 경우
		// 	if (room[curRow + 1][curCol] != 0 && room[curRow - 1][curCol] != 0 && room[curRow][curCol + 1] != 0 && room[curRow][curCol - 1] != 0) {
		// 		// 후진
		// 		int backRow = curRow - dr[curDirection];
		// 		int backCol = curCol - dc[curDirection];
		//
		// 		// 후진할 수 없는 경우
		// 		if (room[backRow][backCol] == 1) {
		// 			break;
		// 		}
		//
		// 		// 후진
		// 		curRow = backRow;
		// 		curCol = backCol;
		// 	} else {
		// 		// 왼쪽 방향으로 회전
		// 		curDirection = (curDirection + 3) % 4;
		//
		// 		// 왼쪽 방향에 청소하지 않은 공간이 존재하는 경우
		// 		if (room[curRow + dr[curDirection]][curCol + dc[curDirection]] == 0) {
		// 			curRow += dr[curDirection];
		// 			curCol += dc[curDirection];
		// 		}
		// 	}
		// }
	}
}
