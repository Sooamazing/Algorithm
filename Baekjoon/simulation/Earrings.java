package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-21 15min
// https://www.acmicpc.net/problem/1380
public class Earrings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int nameNum = Integer.parseInt(br.readLine());

		// nameNum 입력이 0이 들어올 때까지 반복.
		for (int testCase = 1; nameNum > 0; testCase++) {
			String[] names = new String[nameNum + 1]; // 이름 배열
			int[] checks = new int[nameNum + 1]; // 확인 배열
			for (int i = 1; i < nameNum + 1; i++) {
				names[i] = br.readLine();
			}
			for (int i = 0; i < 2 * nameNum - 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int idx = Integer.parseInt(st.nextToken());
				char backAlp = st.nextToken().charAt(0);

				// A인 경우, 1 더해 확인, B인 경우 2를 더해 확인
				if (backAlp == 'A') {
					checks[idx]++;
				} else {
					checks[idx] += 2;
				}
			}
			for (int i = 1; i < nameNum + 1; i++) {
				if (checks[i] != 3) {
					sb.append(testCase).append(" ")
						.append(names[i]).append("\n");
				}
			}
			nameNum = Integer.parseInt(br.readLine());
		}
		System.out.println(sb);
	}
}
