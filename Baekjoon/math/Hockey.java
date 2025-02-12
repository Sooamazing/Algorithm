package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-02-12 15min
// https://www.acmicpc.net/problem/1358
public class Hockey {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int width = Integer.parseInt(st.nextToken());
		int height = Integer.parseInt(st.nextToken());
		int radius = height / 2;
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int players = Integer.parseInt(st.nextToken());

		int result = 0;
		for (int i = 0; i < players; i++) {
			st = new StringTokenizer(br.readLine());
			int playerX = Integer.parseInt(st.nextToken());
			int playerY = Integer.parseInt(st.nextToken());

			boolean isLeftIn =
				(playerX - x) * (playerX - x) + (playerY - y - radius) * (playerY - y - radius) <= radius * radius;
			boolean isRightIn =
				(playerX - x - width) * (playerX - x - width) + (playerY - y - radius) * (playerY - y - radius)
					<= radius * radius;

			if (isLeftIn || isRightIn) { // 원 내부에 있는 경우
				result++;
			} else if (playerX >= x && playerX <= x + width
				&& playerY >= y && playerY <= y + height) { // 사각형 내부에 있는 경우
				result++;
			}
		}

		System.out.println(result);

	}
}
