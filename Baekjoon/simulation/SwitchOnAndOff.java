package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-11-03 15min
// https://www.acmicpc.net/problem/1244
public class SwitchOnAndOff {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int switchCount = Integer.parseInt(br.readLine());
		boolean[] switches = new boolean[switchCount + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i < switchCount + 1; i++) {
			switches[i] = st.nextToken().equals("1");
		}
		int studentCount = Integer.parseInt(br.readLine());
		// 남학생은 1, 여학생은 2
		for (int i = 0; i < studentCount; i++) {
			st = new StringTokenizer(br.readLine());
			boolean isMale = st.nextToken().equals("1");

			if (isMale) {
				// 남학생은 자신의 배수의 스위치 상태를 바꾼다.
				int num = Integer.parseInt(st.nextToken());
				for (int j = num; j < switchCount + 1; j += num) {
					switches[j] = !switches[j];
				}
			} else {
				// 여학생은 자신의 좌우 대칭을 기준으로 스위치 상태를 바꾼다.
				int num = Integer.parseInt(st.nextToken());
				int left = num - 1;
				int right = num + 1;
				switches[num] = !switches[num];
				while (left > 0 && right < switchCount + 1 && switches[left] == switches[right]) {
					switches[left] = !switches[left];
					switches[right] = !switches[right];
					left--;
					right++;
				}
			}
		}

		for (int j = 1; j < switchCount + 1; j++) {
			sb.append(switches[j] ? "1 " : "0 ");
			if (j % 20 == 0) {
				sb.append("\n");
			}
		}

		System.out.println(sb);
	}
}