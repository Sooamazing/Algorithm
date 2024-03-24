package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class GetArea {

	private static int[][] area;
	private static int height;
	private static int width;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] split = br.readLine().split(" ");

		height = Integer.parseInt(split[0]);
		width = Integer.parseInt(split[1]);
		int squareNum = Integer.parseInt(split[2]);

		area = new int[height][width];

		for (int i = 0; i < squareNum; i++) {
			String[] square = br.readLine().split(" ");
			int x1 = Integer.parseInt(square[0]);
			int y1 = Integer.parseInt(square[1]);
			int x2 = Integer.parseInt(square[2]);
			int y2 = Integer.parseInt(square[3]);

			for (int x = x1; x < x2; x++) {
				for (int y = y1; y < y2; y++) {
					area[y][x] = 1;
				}
			}
		}

		int result = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (area[i][j] == 0) {
					area[i][j] = 1;
					pq.add(getArea(i, j));
					result++;
				}
			}
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll()).append(' ');
		}
		System.out.println(result + "\n" + sb);

	}

	private static int getArea(int y, int x) {

		int size = 1;
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};

		for (int i = 0; i < 4; i++) {

			int curX = x + dx[i];
			int curY = y + dy[i];

			if (curX >= 0 && curX < width && curY >= 0 && curY < height && area[curY][curX] == 0) {
				area[curY][curX] = 1;
				size += getArea(curY, curX);
			}

		}

		return size;

	}
}
