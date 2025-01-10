package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-01-10 45min
// https://www.acmicpc.net/problem/2840
public class WheelOfFortune {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		int wheels = Integer.parseInt(st.nextToken());
		int rounds = Integer.parseInt(st.nextToken());

		char[] wheel = new char[wheels];
		boolean[] alphabets = new boolean[26];

		boolean isAbsent = false;
		int lastIndex = 0;
		for (int i = 0; i < rounds; i++) {
			st = new StringTokenizer(br.readLine());
			int skip = Integer.parseInt(st.nextToken());
			char alphabet = st.nextToken().charAt(0);

			int skippedIndex = (lastIndex + skip) % wheels;

			if (wheel[skippedIndex] != 0) {
				// 같은 자리에 다른 알파벳인 상황은 없어야 함
				if (wheel[skippedIndex] != alphabet) {
					isAbsent = true;
					break;
				}

				if (wheel[skippedIndex] == alphabet) {
					lastIndex = skippedIndex;
					continue;
				}
			}

			// 바퀴에 중복 알파벳이 있는 경우는 없어야 함
			if (alphabets[alphabet - 'A']) {
				isAbsent = true;
				break;
			}

			wheel[skippedIndex] = alphabet;
			alphabets[alphabet - 'A'] = true;
			lastIndex = skippedIndex;
		}

		if (isAbsent) {
			sb.append('!');
		} else {
			for (int i = 0; i < wheels; i++) {
				char v = wheel[(lastIndex + wheels - i) % wheels] == 0 ? '?' : wheel[(lastIndex + wheels - i) % wheels];
				sb.append(v);
			}
		}

		System.out.println(sb);

	}
}
