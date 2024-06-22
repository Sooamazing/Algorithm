package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-06-22 5min
// https://www.acmicpc.net/problem/1032
public class CmdPrompt {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(br.readLine());
		String[] strs = new String[size];
		for (int i = 0; i < size; i++) {
			strs[i] = br.readLine();
		}

		int length = strs[0].length();
		for (int i = 0; i < length; i++) {
			char curC = strs[0].charAt(i);
			boolean same = true;
			for (int j = 1; j < size; j++) {
				if (curC != strs[j].charAt(i)) {
					same = false;
					break;
				}
			}
			if (same) {
				sb.append(curC);
			} else {
				sb.append("?");
			}
		}
		System.out.println(sb);

	}
}
