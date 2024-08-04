package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-04 15min
// https://www.acmicpc.net/problem/12785
public class TojaengsWayToSchool {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int toastRow = Integer.parseInt(st.nextToken());
		int toastCol = Integer.parseInt(st.nextToken());

		int[][] toastRoad = new int[toastRow + 1][toastCol + 1];
		toastRoad[1][1] = 1;
		for (int i = 1; i <= toastRow; i++) {
			for (int j = 1; j <= toastCol; j++) {
				if (i == 1 || j == 1) {
					toastRoad[i][j] = 1;
					continue;
				}
				toastRoad[i][j] = (toastRoad[i - 1][j] + toastRoad[i][j - 1]) % 1_000_007;
			}
		}

		int toastToSchoolRow = row - toastRow + 1;
		int toastToSchoolCol = col - toastCol + 1;
		int[][] schoolRoad = new int[toastToSchoolRow][toastToSchoolCol];
		schoolRoad[0][0] = toastRoad[toastRow][toastCol];
		for (int i = 0; i < toastToSchoolRow; i++) {
			for (int j = 0; j < toastToSchoolCol; j++) {
				if (i == 0 || j == 0) {
					schoolRoad[i][j] = schoolRoad[0][0];
					continue;
				}
				schoolRoad[i][j] = (schoolRoad[i - 1][j] + schoolRoad[i][j - 1]) % 1_000_007;
			}
		}

		System.out.println(schoolRoad[toastToSchoolRow - 1][toastToSchoolCol - 1]);
	}
}
