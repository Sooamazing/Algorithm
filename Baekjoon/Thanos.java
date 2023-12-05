// https://www.acmicpc.net/problem/20310
package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thanos {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] split = br.readLine().split("");

		int zeroCnt = 0;
		int oneCnt = 0;
		for (String s : split) {
			if (s.equals("0")) {
				zeroCnt++;
			} else {
				oneCnt++;
			}
		}

		int zeroCur = 0;
		int oneCur = 0;
		for (int i = 0; i < split.length; i++) {

			if (split[i].equals("0")) {
				zeroCur++;
				if (zeroCur <= zeroCnt / 2) {
					sb.append('0');
				}

			} else {
				oneCur++;
				if (oneCur > oneCnt / 2) {
					sb.append('1');
				}
			}

		}

		System.out.println(sb);

	}
}
