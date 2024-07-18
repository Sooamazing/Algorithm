package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-18 70min
// https://www.acmicpc.net/problem/2615
// 여섯 알 이상 제외, 5개가 있으면 무조건 승리.
// 대각선 오른쪽 아래, 오른쪽 위 가능.
// 출력은 왼쪽, 위 순서.
// 출력 때문에 대각선 오른쪽 위를 했지만, 이러면 왼쪽이 생략될 수 있음. -> 왼쪽 아래로 변경
public class Omok {

	static int[][] boardW;
	static int[][] boardH;
	static int[][] boardDR;
	static int[][] boardDL;
	static int[][] dir = {{0, 1}, {1, 0}, {1, 1}, {1, -1}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		boardW = new int[19][19];
		boardH = new int[19][19];
		boardDR = new int[19][19];
		boardDL = new int[19][19];
		StringTokenizer st;
		for (int i = 0; i < 19; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 19; j++) {
				int cur = Integer.parseInt(st.nextToken());
				boardW[i][j] = cur;
				boardH[i][j] = cur;
				boardDR[i][j] = cur;
				boardDL[i][j] = cur;
			}
		}

		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 19; j++) {

				int curColor = boardW[i][j];
				int curWNum = boardW[i][j];
				if (curWNum != 0) {
					curWNum = dfs(i, j, curWNum, 0);
				}

				int curHNum = boardH[i][j];
				if (curHNum != 0) {
					curColor = boardH[i][j];
					curHNum = dfs(i, j, curHNum, 1);
				}

				int curDRNum = boardDR[i][j];
				if (curDRNum != 0) {
					curColor = boardDR[i][j];
					curDRNum = dfs(i, j, curDRNum, 2);
				}

				int curDLNum = boardDL[i][j];
				if (curDLNum != 0) {
					curColor = boardDL[i][j];
					curDLNum = dfs(i, j, curDLNum, 3);
				}

				if (curWNum == 5 || curHNum == 5 || curDRNum == 5 || curDLNum == 5) {
					sb.append(curColor).append("\n");
					if (curDLNum == 5) {
						i += 4;
						j -= 4;
					}
					sb.append(i + 1).append(" ").append(j + 1);
					System.out.println(sb);
					return;
				}
			}
		}

		System.out.println(0);

	}

	static int dfs(int r, int c, int color, int dir) {

		// boardW[r][c] = 0; // 방향에 따라 배열을 나눴기 때문에, 일괄로 여기서 방문 처리할 수 없음.

		if (dir == 0) {
			boardW[r][c] = 0;
			// 가로
			if (c + 1 < 19 && boardW[r][c + 1] == color) {
				return dfs(r, c + 1, color, dir) + 1;
			}
		} else if (dir == 1) {
			boardH[r][c] = 0;
			// 세로
			if (r + 1 < 19 && boardH[r + 1][c] == color) {
				return dfs(r + 1, c, color, dir) + 1;
			}
		} else if (dir == 2) {
			boardDR[r][c] = 0;
			// 대각선 오른쪽 아래
			if (r + 1 < 19 && c + 1 < 19 && boardDR[r + 1][c + 1] == color) {
				return dfs(r + 1, c + 1, color, dir) + 1;
			}
		} else {
			boardDL[r][c] = 0;
			// 대각선 왼쪽 아래
			if (r + 1 < 19 && c - 1 >= 0 && boardDL[r + 1][c - 1] == color) {
				return dfs(r + 1, c - 1, color, dir) + 1;
			}

		}

		return 1;

	}
}
