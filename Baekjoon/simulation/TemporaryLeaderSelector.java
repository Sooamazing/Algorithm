package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 25-01-15 30min
// https://www.acmicpc.net/problem/1268
public class TemporaryLeaderSelector {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int students = Integer.parseInt(br.readLine());

		List<Integer>[][] classes = new List[5 + 1][9 + 1];
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				classes[i][j] = new ArrayList<Integer>();
			}
		}

		StringTokenizer st;
		for (int i = 1; i <= students; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= 5; j++) {
				int classOfGrade = Integer.parseInt(st.nextToken());
				classes[j][classOfGrade].add(i);
			}
		}

		boolean[][] relationships = new boolean[students + 1][students + 1];
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				List aClass = classes[i][j];
				int length = aClass.size();
				for (int k = 0; k < length; k++) {
					int aStudent = (int)aClass.get(k);
					for (int l = k + 1; l < length; l++) {
						int bStudent = (int)aClass.get(l);
						relationships[aStudent][bStudent] = true;
						relationships[bStudent][aStudent] = true;
					}
				}
			}
		}

		int max = 0;
		int maxStudent = 1; // 1번이 기본값, 안 겹치는 경
		for (int i = 1; i <= students; i++) {
			int cnt = 0;
			for (int j = 1; j <= students; j++) {
				if (relationships[i][j]) {
					cnt++;
				}
			}

			if (max < cnt) {
				maxStudent = i;
				max = cnt;
			}
		}

		System.out.println(maxStudent);
	}
}
