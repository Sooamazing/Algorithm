package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// 24-07-29, 08-15 115min, 31% 틀림.
// https://www.acmicpc.net/problem/3987
// 반례: https://www.acmicpc.net/board/view/65088 - StackOverFlow / D Voyager
public class Voyager1 {
	static int row;
	static int col;
	static char[][] space;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		space = new char[row][col];
		visited = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			String str = br.readLine();
			for (int j = 0; j < col; j++) {
				space[i][j] = str.charAt(j);
			}
		}
		st = new StringTokenizer(br.readLine());
		int startR = Integer.parseInt(st.nextToken()) - 1;
		int startC = Integer.parseInt(st.nextToken()) - 1;

		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1[1] == o2[1]) {
				return o1[0] - o2[0]; // 순서 오름차순
			}
			return o2[1] - o1[1]; // 시간 내림차순
		});

		visited = new boolean[row][col];
		int upTime = bfs(startR, startC, 'U', 1);
		// int upTime = makeAVoyageRecursion(startR, startC, 'U', 1);
		pq.add(new int[] {1, upTime});
		visited = new boolean[row][col];
		int rightTime = bfs(startR, startC, 'R', 1);
		// int rightTime = makeAVoyageRecursion(startR, startC, 'R', 1);
		pq.add(new int[] {2, rightTime});
		visited = new boolean[row][col];
		int downTime = bfs(startR, startC, 'D', 1);
		// int downTime = makeAVoyageRecursion(startR, startC, 'D', 1);
		pq.add(new int[] {3, downTime});
		visited = new boolean[row][col];
		int leftTime = bfs(startR, startC, 'L', 1);
		// int leftTime = makeAVoyageRecursion(startR, startC, 'L', 1);
		pq.add(new int[] {4, leftTime});

		int[] poll = pq.poll();
		switch (poll[0]) {
			case 1:
				sb.append("U\n");
				break;
			case 2:
				sb.append("R\n");
				break;
			case 3:
				sb.append("D\n");
				break;
			default:
				sb.append("L\n");
		}
		sb.append(poll[1] == Integer.MAX_VALUE ? "Voyager" : poll[1]);
		System.out.println(sb);

	}

	static int bfs(int startR, int startC, char startDir, int startDepth) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {startR, startC, startDir, startDepth});

		int ans = -1;
		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int tempR = poll[0];
			int tempC = poll[1];
			int dir = poll[2];
			int depth = poll[3];

			char cur = space[tempR][tempC];
			if (cur == '.' && visited[tempR][tempC]) {
				// 지금이 '.'이고, 방문한 곳이면 중복 처리.
				// 중복이면 Integer.MAX_VALUE
				return Integer.MAX_VALUE;
			}
			visited[tempR][tempC] = true;
			ans = Math.max(ans, depth);

			if (cur == 'C') {
				return depth - 1;
			} else if (cur == '/') {
				switch (dir) {
					case 'U':
						if (++tempC < col) {
							que.add(new int[] {tempR, tempC, 'R', depth + 1});
						}
						break;
					case 'R':
						if (--tempR >= 0) {
							que.add(new int[] {tempR, tempC, 'U', depth + 1});
						}
						break;
					case 'D':
						if (--tempC >= 0) {
							que.add(new int[] {tempR, tempC, 'L', depth + 1});
						}
						break;
					default:
						if (++tempR < row) {
							que.add(new int[] {tempR, tempC, 'D', depth + 1});
						}
				}
			} else if (cur == '\\') {
				switch (dir) {
					case 'U':
						if (--tempC >= 0) {
							que.add(new int[] {tempR, tempC, 'L', depth + 1});
						}
						break;
					case 'R':
						if (++tempR < row) {
							que.add(new int[] {tempR, tempC, 'D', depth + 1});
						}
						break;
					case 'D':
						if (++tempC < col) {
							que.add(new int[] {tempR, tempC, 'R', depth + 1});
						}
						break;
					default:
						if (--tempR >= 0) {
							que.add(new int[] {tempR, tempC, 'U', depth + 1});
						}
				}
			} else {
				switch (dir) {
					case 'U':
						if (--tempR >= 0) {
							que.add(new int[] {tempR, tempC, dir, depth + 1});
						}
						break;
					case 'R':
						if (++tempC < col) {
							que.add(new int[] {tempR, tempC, dir, depth + 1});
						}
						break;
					case 'D':
						if (++tempR < row) {
							que.add(new int[] {tempR, tempC, dir, depth + 1});
						}
						break;
					default:
						if (--tempC >= 0) {
							que.add(new int[] {tempR, tempC, dir, depth + 1});
						}
				}
			}

		}
		return ans;
	}

	// StackOverFlow
	static int makeAVoyageRecursion(int r, int c, char dir, int depth) {

		char cur = space[r][c];
		if (cur == '.' && visited[r][c]) {
			// 지금이 '.'이고, 방문한 곳이면 중복 처리.
			// 중복이면 Integer.MAX_VALUE
			return Integer.MAX_VALUE;
		}
		visited[r][c] = true;

		int tempR = r;
		int tempC = c;
		if (cur == 'C') {
			return depth - 1;
		} else if (cur == '/') {
			switch (dir) {
				case 'U':
					if (++tempC < col) {
						return makeAVoyageRecursion(tempR, tempC, 'R', depth + 1);
					}
					break;
				case 'R':
					if (--tempR >= 0) {
						return makeAVoyageRecursion(tempR, tempC, 'U', depth + 1);
					}
					break;
				case 'D':
					if (--tempC >= 0) {
						return makeAVoyageRecursion(tempR, tempC, 'L', depth + 1);
					}
					break;
				default:
					if (++tempR < row) {
						return makeAVoyageRecursion(tempR, tempC, 'D', depth + 1);
					}
			}
		} else if (cur == '\\') {
			switch (dir) {
				case 'U':
					if (--tempC >= 0) {
						return makeAVoyageRecursion(tempR, tempC, 'L', depth + 1);
					}
					break;
				case 'R':
					if (++tempR < row) {
						return makeAVoyageRecursion(tempR, tempC, 'D', depth + 1);
					}
					break;
				case 'D':
					if (++tempC < col) {
						return makeAVoyageRecursion(tempR, tempC, 'R', depth + 1);
					}
					break;
				default:
					if (--tempR >= 0) {
						return makeAVoyageRecursion(tempR, tempC, 'U', depth + 1);
					}
			}
		} else {
			switch (dir) {
				case 'U':
					if (--tempR >= 0) {
						return makeAVoyageRecursion(tempR, tempC, dir, depth + 1);
					}
					break;
				case 'R':
					if (++tempC < col) {
						return makeAVoyageRecursion(tempR, tempC, dir, depth + 1);
					}
					break;
				case 'D':
					if (++tempR < row) {
						return makeAVoyageRecursion(tempR, tempC, dir, depth + 1);
					}
					break;
				default:
					if (--tempC >= 0) {
						return makeAVoyageRecursion(tempR, tempC, dir, depth + 1);
					}
			}
		}
		return depth;
	}
}
