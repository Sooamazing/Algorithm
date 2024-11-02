package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-11-02 20min
// https://www.acmicpc.net/problem/2941
public class CroatianAlphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String croatian = br.readLine();

		char prev = '0';
		int length = croatian.length();
		int cnt = length;
		for (int i = 0; i < length; i++) {
			char c = croatian.charAt(i);
			if (c == '=') {
				if (prev == 'c' || prev == 's') {
					cnt--;
				} else if (prev == 'z') {
					// dz=, z= 구분
					if (i > 1 && croatian.charAt(i - 2) == 'd') {
						cnt -= 2;
					} else {
						cnt--;
					}
				}
			} else if (c == '-') {
				if (prev == 'c' || prev == 'd') {
					cnt--;
				}
			} else if (c == 'j') {
				if (prev == 'l' || prev == 'n') {
					cnt--;
				}
			}

			prev = c;
		}

		System.out.println(cnt);
	}
}
