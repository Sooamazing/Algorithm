package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 25-01-23 10min
// https://www.acmicpc.net/problem/4158
public class CD {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;

		while (true) {
			st = new StringTokenizer(br.readLine());
			int sangeun = Integer.parseInt(st.nextToken());
			int sunyoung = Integer.parseInt(st.nextToken());
			if (sangeun == 0 && sunyoung == 0) {
				break;
			}

			Set<Integer> sangeunCDs = new HashSet<>();

			// 상근이가 가진 CD 입력
			for (int i = 0; i < sangeun; i++) {
				sangeunCDs.add(Integer.parseInt(br.readLine()));
			}

			int same = 0;
			// 선영이가 가진 CD 번호 중 상근이가 가진 것과 동일한 것 찾기
			for (int i = 0; i < sunyoung; i++) {
				int cd = Integer.parseInt(br.readLine());
				if (sangeunCDs.contains(cd)) {
					same++;
				}
			}

			sb.append(same).append("\n");

		}

		System.out.println(sb);
	}
}
