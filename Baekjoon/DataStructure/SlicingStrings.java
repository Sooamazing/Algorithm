package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 24-07-21 20min
// https://www.acmicpc.net/problem/2866
public class SlicingStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int wordNum = Integer.parseInt(st.nextToken());
		int wordLength = Integer.parseInt(st.nextToken());

		String[] words = new String[wordNum];
		for (int i = 0; i < wordNum; i++) {
			words[i] = br.readLine();
		}
		String[] wordsByCol = new String[wordLength];
		Arrays.fill(wordsByCol, "");
		for (int i = 0; i < wordNum; i++) {
			for (int j = 0; j < wordLength; j++) {
				wordsByCol[j] += words[i].charAt(j);
			}
		}

		for (int i = 0; i < wordNum; i++) {
			Set<String> set = new HashSet<>();
			for (int j = 0; j < wordLength; j++) {
				set.add(wordsByCol[j].substring(i));
			}
			if (set.size() != wordLength) {
				System.out.println(i - 1);
				return;
			}
		}
		System.out.println(wordNum - 1);
	}
}
