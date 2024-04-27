package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-04-27 30min
// https://www.acmicpc.net/problem/13909
public class ClosingWindow {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int peopleNum = Integer.parseInt(br.readLine());

		int count = 0; //창문이 열려있는 개수
		for (int i = 1; i * i <= peopleNum; i++) { //제곱수만 카운트
			count++;
		}

		System.out.println(count);

		boolean[] windows = new boolean[peopleNum];
		// for (int i = 1; i <= peopleNum; i++) {
		// 	for (int j = 0; j < peopleNum; j++) {
		// 		if (windows[i%j])
		//
		// 	}
		// }
	}
}
