package Baekjoon.BFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 24-06-16 10:30 20min
// https://www.acmicpc.net/problem/21608
public class JawsElementarySchool {

	static int size;
	static int[][] classMap;
	static Map<Integer, int[]> studentLocationMap;
	static int[][] lovers;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		size = Integer.parseInt(br.readLine());
		classMap = new int[size][size];
		studentLocationMap = new HashMap<>();

		lovers = new int[size * size][4];
		for (int i = 0; i < size * size; i++) {
			st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken());
			lovers[student] = new int[] {
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken())
			};
		}

	}

	static int[] dr = {0, 0, -1, 1};
	static int[] dc = {-1, 1, 0, 0};

	static void findLocation() {
		int[][] scoreMap = new int[size][size];
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				if (classMap[r][c] != 0) {
					continue;
				}
				int score = getScore(classMap, new int[] {r, c}, lovers);
				scoreMap[r][c] = score;
			}
		}
	}

	static int getScore(int[][] classMap, int[] studentLocation, int[][] lovers) {
		int score = 0;
		int r = studentLocation[0];
		int c = studentLocation[1];
		int student = classMap[r][c];
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (nr < 0 || nr >= classMap.length || nc < 0 || nc >= classMap[0].length) {
				continue;
			}
			if (classMap[nr][nc] == lovers[student][0] || classMap[nr][nc] == lovers[student][1]
				|| classMap[nr][nc] == lovers[student][2] || classMap[nr][nc] == lovers[student][3]) {
				score++;
			}
		}
		return score;
	}

}
