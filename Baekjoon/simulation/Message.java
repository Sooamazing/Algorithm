package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-09-03 15min
// https://www.acmicpc.net/problem/1384
public class Message {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int peopleNum;
		int caseNum = 1;
		while ((peopleNum = Integer.parseInt(br.readLine())) > 0) {
			sb.append("Group ").append(caseNum++).append("\n");

			StringTokenizer st;
			String[] names = new String[peopleNum];
			boolean[][] arr = new boolean[peopleNum][peopleNum - 1];
			for (int i = 0; i < peopleNum; i++) {
				st = new StringTokenizer(br.readLine());
				names[i] = st.nextToken();
				for (int j = 0; j < peopleNum - 1; j++) {
					arr[i][j] = st.nextToken().charAt(0) == 'P';
				}
			}

			boolean isNasty = false;
			for (int i = 0; i < peopleNum; i++) {
				for (int j = 0; j < peopleNum - 1; j++) {
					if (!arr[i][j]) {
						isNasty = true;
						int nastyIdx = (i - j - 1) < 0 ? i - j - 1 + peopleNum : i - j - 1;
						sb.append(names[nastyIdx]).append(" was nasty about ").append(names[i]).append("\n");
					}
				}
			}
			if (!isNasty) {
				sb.append("Nobody was nasty\n");
			}
			sb.append("\n");

		}
		System.out.println(sb);
	}
}
