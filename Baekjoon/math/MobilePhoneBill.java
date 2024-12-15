package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-12-15 10min
// https://www.acmicpc.net/problem/1267
public class MobilePhoneBill {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int yLimit = 30;
		int yCost = 0;
		int mLimit = 60;
		int mCost = 0;
		for (int i = 0; i < total; i++) {
			int callTime = Integer.parseInt(st.nextToken());

			// 영식 - 30초마다 10원씩
			yCost += ((callTime / yLimit) + 1) * 10;

			// 민식 - 60초마다 15원씩
			mCost += ((callTime / mLimit) + 1) * 15;
		}

		if (yCost > mCost) {
			System.out.println("M " + mCost);
		} else if (yCost < mCost) {
			System.out.println("Y " + yCost);
		} else {
			System.out.println("Y M " + yCost);
		}

	}
}
