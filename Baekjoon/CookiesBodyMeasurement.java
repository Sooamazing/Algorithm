// https://www.acmicpc.net/problem/20125
package Baekjoon;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookiesBodyMeasurement {
	static Point waist = new Point();
	static String[][] arr;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());

		arr = new String[N ][N];
		Point heart = new Point();
		boolean isHead = false;
		for (int i = 0; i < N ; i++) {
			String[] split = br.readLine().split("");
			for (int j = 0; j < N ; j++) {
				String temp = arr[i][j] = split[j];
				if (!isHead && temp.equals("*")) {
					isHead = true;
					heart.setLocation(i+1, j);
					sb.append(heart.x+1).append(' ')
						.append(heart.y+1).append('\n');
				}
			}
		}

		sb.append(getLeftArmLength(heart.x, heart.y)).append(' ');
		sb.append(getRightArmLength(heart.x, heart.y)).append(' ');
		sb.append(getWaistLength(heart.x, heart.y)).append(' ');
		int  i = 0;
		sb.append(getLeftLegLength(waist.x, waist.y)).append(' ');
		sb.append(getLeftRightLength(waist.x, waist.y));

		System.out.println(sb);

	}

	private static int getLeftRightLength(int x, int y) {
		int curX = x+1;
		int curY = y+1;
		int cnt = 0;
		while (true) {
			if (curX < N  && arr[curX++][curY].equals("*")) {
				cnt++;
			} else {
				return cnt;
			}
		}
	}

	private static int getLeftLegLength(int x, int y) {
		int curX = x+1;
		int curY = y-1;
		int cnt = 0;
		while (true) {
			if (curX < N  && arr[curX++][curY].equals("*")) {
				cnt++;
			} else {
				return cnt;
			}
		}
	}

	private static int getWaistLength(int x, int y) {
		int curX = x+1;
		int cnt = 0;
		while (true) {
			if (curX < N  && arr[curX++][y].equals("*")) {
				cnt++;
			} else {
				break;
			}
		}
		waist.setLocation(curX-2,y );
		return cnt;
	}

	private static int getRightArmLength(int x, int y) {
		int curY = y+1;
		int cnt = 0;
		while (true) {
			if (curY < N && arr[x][curY++].equals("*")) {
				cnt++;
			} else {
				return cnt;
			}
		}
	}

	private static int getLeftArmLength(int x, int y) {

		int curY = y-1;
		int cnt = 0;
		while (true) {
			if (curY >= 0 && arr[x][curY--].equals("*")) {
				cnt++;
			} else {
				return cnt;
			}
		}

	}
}
