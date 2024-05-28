package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-05-28 90min
// https://www.acmicpc.net/problem/14891
public class SawtoothWheel {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] wheels = new boolean[5][8];
		int[] idxes = new int[5];
		StringTokenizer st;
		for (int i = 1; i <= 4; i++) {
			String str = br.readLine();
			for (int j = 0; j < 8; j++) {
				if (str.charAt(j) == '1') {
					wheels[i][j] = true;
				}
			}
		}

		int rollNumber = Integer.parseInt(br.readLine());
		while (rollNumber-- > 0) {
			st = new StringTokenizer(br.readLine());
			int wheelNum = Integer.parseInt(st.nextToken());
			int orientation = Integer.parseInt(st.nextToken());

			int curOrientation = orientation;
			if (curOrientation == 1) {
				// 시계방향 회전
				idxes[wheelNum] = (idxes[wheelNum] + 7) % 8;
			} else {
				// 반시계 방향 회전
				idxes[wheelNum] = (idxes[wheelNum] + 1) % 8;
			}

			// 기준 왼쪽
			for (int i = wheelNum - 1; i >= 1; i--) {
				// 시계방향 회전
				int oriIdx = (idxes[i + 1] + 1) % 8;
				if (curOrientation == -1) {
					// 반시계 방향 회전
					oriIdx = (idxes[i + 1] + 7) % 8;
				}
				int affectIdx = idxes[i];
				boolean oriIsN = wheels[i + 1][(oriIdx + 6) % 8];
				boolean affectIsN = wheels[i][(affectIdx + 2) % 8];
				if (oriIsN != affectIsN) {
					curOrientation = -curOrientation;
					if (curOrientation == 1) {
						// 시계방향 회전
						idxes[i] = (idxes[i] + 7) % 8;
					} else {
						// 반시계 방향 회전
						idxes[i] = (idxes[i] + 1) % 8;
					}
				} else {
					break;
				}
			}

			curOrientation = orientation;
			// 기준 오른쪽
			for (int i = wheelNum + 1; i <= 4; i++) {
				int oriIdx = (idxes[i - 1] + 1) % 8;

				if (curOrientation == -1) {
					// 반시계 방향 회전
					oriIdx = (idxes[i - 1] + 7) % 8;
				}
				int affectIdx = idxes[i];
				boolean oriIsN = wheels[i - 1][(oriIdx + 2) % 8];
				boolean affectIsN = wheels[i][(affectIdx + 6) % 8];
				if (oriIsN != affectIsN) {
					curOrientation = -curOrientation;
					if (curOrientation == 1) {
						// 시계방향 회전
						idxes[i] = (idxes[i] + 7) % 8;
					} else {
						// 반시계 방향 회전
						idxes[i] = (idxes[i] + 1) % 8;
					}
				} else {
					break;
				}

			}

		}

		int sum = 0;
		for (int i = 1; i <= 4; i++) {
			int idx = idxes[i];
			if (wheels[i][idx]) {
				sum += Math.pow(2, i - 1);
			}
		}

		System.out.println(sum);

	}
}
