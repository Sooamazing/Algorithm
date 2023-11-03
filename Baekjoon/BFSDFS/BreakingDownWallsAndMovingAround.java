package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BreakingDownWallsAndMovingAround {

	static int N, M;
	static int[][] inputArr;
	static boolean[][][] visited; // 0 = non-broken, 1 = broken

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		inputArr = new int[N][M];
		visited = new boolean[N][M][2];

		// 입력 받기부터 오류.. ㅎㅅㅎ....
		// N+2 는 사용하는 의미가 없는 게 맞나? 어차피 벽을 부숴서..
		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < M; j++) {
				inputArr[i][j] = Integer.parseInt(split[j]);
				// if (inputArr[i][j] == 0) {
				// 	toGo[i][j][0] = true;
				// 	toGo[i][j][1] = true;
				// }
			}
		}// 입력 및 초기화 완료

		bfs(0, 0, 0, 0);

		// System.out.println("===");

	}

	static int[][] dxdy = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

	static void bfs(int firstX, int firstY, int firstDepth, int firstIsBroken) {

		Queue<Node> que = new LinkedList<>();
		visited[firstX][firstY][0] = true;
		que.add(new Node(firstX, firstY, firstDepth, firstIsBroken));

		while (!que.isEmpty()) {
			Node node = que.poll();
			int x = node.x;
			int y = node.y;
			int depth = node.depth;
			int isBroken = node.isBroken;

			// System.out.println(
			// 	"x = " + x + ", y = " + y + ", depth = " + depth + ", isBroken = "
			// 		+ isBroken);

			if (x == N - 1 && y == M - 1) {
				System.out.println(node.depth + 1);
				return;
			}

			for (int[] item : dxdy) {
				int tempX = x + item[0];
				int tempY = y + item[1];

				if (tempX < 0 || tempX >= N || tempY < 0 || tempY >= M) {
					continue;
				}

				if (!visited[tempX][tempY][isBroken] && inputArr[tempX][tempY] == 0) {

					visited[tempX][tempY][isBroken] = true;
					que.add(new Node(tempX, tempY, depth + 1, isBroken));

				} else if (inputArr[tempX][tempY] == 1 && isBroken == 0 && !visited[tempX][tempY][0]) {
					// 조건: toGo[tempX][tempY][isBroken] X
					visited[tempX][tempY][0] = true;
					que.add(new Node(tempX, tempY, depth + 1, 1));
				}
			}
		}
		System.out.println(-1);
	}

	static class Node {
		int x, y, depth;
		int isBroken;

		public Node(int x, int y, int depth, int isBroken) {
			this.x = x;
			this.y = y;
			this.depth = depth;
			this.isBroken = isBroken;
		}
	}
}
