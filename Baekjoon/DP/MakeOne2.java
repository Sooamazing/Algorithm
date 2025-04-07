package Baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-04-07 40min
// https://www.acmicpc.net/problem/12852
// 참고1: https://www.acmicpc.net/board/view/127317
// 참고2: https://www.acmicpc.net/board/view/129327
// 참고3: https://www.acmicpc.net/board/view/155993
public class MakeOne2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());

		// 가장 작은 횟수를 가질 수 있는 이전 수를 저장
		final int MAX = 1_000_001;
		int[] previousNumbers = new int[total + 1];
		int[] minDivides = new int[total + 1];
		previousNumbers[1] = 0;
		if (total >= 2) {
			previousNumbers[2] = 1;
			minDivides[2] = 1;
		}
		if (total >= 3) {
			previousNumbers[3] = 1;
			minDivides[3] = 1;
		}
		for (int i = 4; i <= total; i++) {

			int minDivideMinusOne = minDivides[i - 1];
			int minDivideDivideTwo = i % 2 == 0 ? minDivides[i / 2] : MAX;
			int minDivideDivideThree = i % 3 == 0 ? minDivides[i / 3] : MAX;

			if (minDivideDivideThree <= minDivideDivideTwo && minDivideDivideThree <= minDivideMinusOne) {
				// 3으로 나눈 경우가 가장 작을 때
				minDivides[i] = minDivideDivideThree + 1;
				previousNumbers[i] = i / 3;
			} else if (minDivideDivideTwo <= minDivideMinusOne && minDivideDivideTwo <= minDivideDivideThree) {
				// 2로 나눈 경우가 가장 작을 때
				minDivides[i] = minDivideDivideTwo + 1;
				previousNumbers[i] = i / 2;
			} else {
				// 1을 뺀 경우가 가장 작을 때
				minDivides[i] = minDivideMinusOne + 1;
				previousNumbers[i] = i - 1;
			}
		}

		int count = 0;
		int index = total;
		while (true) {
			sb.append(index).append(" ");
			index = previousNumbers[index];
			if (index == 0) {
				break;
			}
			count++;
		}

		sb.insert(0, count + "\n");

		System.out.println(sb);
	}
}
