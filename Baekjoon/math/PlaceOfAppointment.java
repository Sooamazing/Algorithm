package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-07-09 10min
// https://www.acmicpc.net/problem/25542
public class PlaceOfAppointment {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int wordNum = Integer.parseInt(st.nextToken());
		int storeNameLength = Integer.parseInt(st.nextToken());

		String[] nameCandidates = new String[wordNum];
		for (int i = 0; i < wordNum; i++) {
			nameCandidates[i] = br.readLine();
		}
		for (int i = 0; i < storeNameLength; i++) {
			int[] storeName = new int[26];
			for (int j = 0; j < wordNum; j++) {
				storeName[nameCandidates[j].charAt(i) - 'A']++;
			}

		}
	}
}
