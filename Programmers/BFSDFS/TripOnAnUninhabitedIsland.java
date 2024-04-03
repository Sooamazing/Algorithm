package Programmers.BFSDFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 24-04-03
// https://school.programmers.co.kr/learn/courses/30/lessons/154540
class TripOnAnUninhabitedIsland {

	public static void main(String[] args) {
		TripOnAnUninhabitedIsland tripOnAnUninhabitedIsland = new TripOnAnUninhabitedIsland();

		int[] solution1 = tripOnAnUninhabitedIsland.solution(
			new String[] {"X591X", "X1X5X", "X231X", "1XXX1"}); // 1, 1, 27
		int[] solution2 = tripOnAnUninhabitedIsland.solution(new String[] {"XXX", "XXX", "XXX"});// -1
		System.out.println(Arrays.toString(solution1));
		System.out.println(Arrays.toString(solution2));

	}

	private int[][] islands;
	private List<Integer> results = new ArrayList<>();

	public int[] solution(String[] maps) {

		// islands에 옮겨 담기
		int iSize = maps.length;
		int jSize = maps[0].length();
		islands = new int[iSize + 2][jSize + 2];
		for (int i = 1; i < iSize + 1; i++) {
			String[] split = maps[i - 1].split(""); // i-1 주의
			for (int j = 1; j < jSize + 1; j++) {
				islands[i][j] = split[j - 1].equals("X") ? 0 : Integer.parseInt(split[j - 1]);
			}
		}

		// bfs
		// int answerIdx = 0;
		for (int i = 1; i < iSize + 1; i++) {
			for (int j = 1; j < jSize + 1; j++) {
				int cur = islands[i][j];
				if (cur != 0) {
					int meal = cur;
					islands[i][j] = 0;
					meal += bfs(i, j);
					if (meal == 0) {
						if (results.size() == 0) {
							break;
						}
					} else {
						results.add(meal);
						// answer[answerIdx++] = meal;
					}
				}
			}
		}

		int[] answer;
		if (results.size() == 0) {
			answer = new int[] {-1};
		} else {
			answer = new int[results.size()];
			for (int i = 0; i < results.size(); i++) {
				answer[i] = results.get(i);
			}
			Arrays.sort(answer);
		}

		return answer;
	}

	private int bfs(int x, int y) {
		int[] dx = new int[] {0, 0, 1, -1};
		int[] dy = new int[] {1, -1, 0, 0};

		Queue<int[]> que = new LinkedList<>();

		que.add(new int[] {x, y});

		int meals = 0;
		while (!que.isEmpty()) {
			int[] cur = que.poll();
			int curX = cur[0];
			int curY = cur[1];
			// meals += islands[curX][curY];

			for (int i = 0; i < 4; i++) {
				int newX = curX + dx[i];
				int newY = curY + dy[i];

				if (islands[newX][newY] != 0) {
					meals += islands[newX][newY];
					islands[newX][newY] = 0;
					que.add(new int[] {newX, newY});
				}
			}

		}

		return meals;

	}
}
