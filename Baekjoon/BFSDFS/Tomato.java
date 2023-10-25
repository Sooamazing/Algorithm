package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
	static int N, M;
	static int[][] tomatoArr;
	static boolean[][] visitedArr;
	static List<int[]> list = new ArrayList<>();
	static int[][] dxdy = {{0, 1
	}, {0, -1}, {1, 0}, {-1, 0}};

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		tomatoArr = new int[N + 2][M + 2];
		visitedArr = new boolean[N + 2][M + 2];
		Queue<int[]> que = new LinkedList<>();

		for (int i = 1; i < N + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < M + 1; j++) {
				tomatoArr[i][j] = Integer.parseInt(st.nextToken());

				//가야 할 곳(0인 경우) true
				if (tomatoArr[i][j] == 0) {
					visitedArr[i][j] = true;
				} else if (tomatoArr[i][j] == 1) {
					int[] temp = {i, j};
					que.add(temp);
				}
			}
		}//입력 및 초기화 완료

		bfs(que, 0);
		if(!isAllchecked()){
			cnt=-1;
		}
		System.out.println(cnt);
		// System.out.println(sb);

	}

	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();

	static void bfs(Queue<int[]> que, int depth) {
		Queue<int[]> newQue = new LinkedList<>();
		if (isAllchecked()) {
			cnt = depth;
			return;
		}
		while (!que.isEmpty()) {
			int[] temp = que.poll();
			visitedArr[temp[0]][temp[1]] = false;

			sb.append(temp[0]).append(", ").append(temp[1]).append(" / ");

			for (int[] udlr : dxdy) {
				int tempX = udlr[0] + temp[0];
				int tempY = udlr[1] + temp[1];

				if (visitedArr[tempX][tempY]) {
					visitedArr[tempX][tempY] = false;
					newQue.add(new int[] {tempX, tempY});
				}
			}
		}
		if(newQue.isEmpty()){
			return;
		}
		sb.append("\n");
		bfs(newQue, depth + 1);

	}

	private static boolean isAllchecked() {
		for (int i = 1; i < N + 1; i++) {
			for (int j = 1; j < M + 1; j++) {
				if (visitedArr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
