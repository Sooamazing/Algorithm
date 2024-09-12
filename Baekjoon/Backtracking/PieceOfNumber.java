package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-07-06 20min
// https://www.acmicpc.net/problem/14629
public class PieceOfNumber {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int length = str.length();
		long goalNum = Long.parseLong(str);
		long maxNum = 9876543210L;
		if (goalNum >= maxNum) {
			// 9876543210 이상인 경우 9876543210 출력.
			System.out.println(maxNum);
			return;
		}
		if (length == 1) {
			// 한 자리인 경우 해당 숫자 출력.
			System.out.println(goalNum);
			return;
		}

		// int upperNum = getUpperNum();
		// int lowerNum = getLowerNum();
		//
		// int ans = lowerNum;
		// if (goalNum - lowerNum > upperNum - goalNum) {
		// 	ans = upperNum;
		// }
		// System.out.println(ans);
	}
	//
	// static int getUpperNum() {
	//
	// }
	//
	// static int getLowerNum() {
	//
	// }

}
