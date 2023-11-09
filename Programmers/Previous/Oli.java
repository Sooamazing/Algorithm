package Programmers.Previous;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Oli {
	public static void main(String[] args) {

		// int[][] land = {
		// 	{0, 0, 0, 1, 1, 1, 0, 0},
		// 	{0, 0, 0, 0, 1, 1, 0, 0},
		// 	{1, 1, 0, 0, 0, 1, 1, 0},
		// 	{1, 1, 1, 0, 0, 0, 0, 0},
		// 	{1, 1, 1, 0, 0, 0, 1, 1}
		// };

		int[][] land = {
			{1, 0, 1, 0, 1, 1},
			{1, 0, 1, 0, 0, 0},
			{1, 0, 1, 0, 0, 1},
			{1, 0, 0, 1, 0, 0},
			{1, 0, 0, 1, 0, 1},
			{1, 0, 0, 0, 0, 0},
			{1, 1, 1, 1, 1, 1}
		};

		System.out.println(solution(land));

	}

	static int row;
	static int column;
	static boolean[][] visited;

	static public int solution(int[][] land) {

		row = land.length;
		column = land[0].length;

		int sum = 0;
		int max = 0;
		value = 2;

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < column; i++) {

			visited = new boolean[row][column];
			HashSet<Integer> set = new HashSet<>();

			for (int j = 0; j < row; j++) {

				if (land[j][i] == 0 || visited[j][i]) {
					continue;
				}
				if (land[j][i] >= 2) {
					set.add(land[j][i]);
					continue;
				}

				visited[j][i] = true;
				land[j][i] = value;
				set.add(value);
				cnt = 1;

				dfs(land, j, i);

				map.put(value, cnt);
				value++;

				// System.out.println("cnt = " + cnt);
			}

			// System.out.println("sum = " + sum);
			for (int key : set) {
				sum += map.get(key);
			}
			max = Math.max(sum, max);
			sum = 0;
		}

		return max;
	}

	static int cnt = 0;
	static int value;

	static void dfs(int[][] land, int x, int y) {
		int[][] dxdy = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

		for (int i = 0; i < 4; i++) {
			int nx = x + dxdy[i][0];
			int ny = y + dxdy[i][1];

			if (nx >= 0 && nx < row && ny >= 0 && ny < column && land[nx][ny] == 1 && !visited[nx][ny]) {

				cnt++;
				visited[nx][ny] = true;
				land[nx][ny] = value;
				dfs(land, nx, ny);

			}
		}
	}
}
