package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 초과
// 500000
// 10
// 0 1 2 3 4 5 6 7 8 9
// 24-06-06 80min
// https://www.acmicpc.net/problem/1107
public class RemoteControl {
	static String goalStr;
	static int totalDigit;
	static boolean[] brokens;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		goalStr = br.readLine();
		totalDigit = goalStr.length();
		int goal = Integer.parseInt(goalStr);
		if (goal >= 98 && goal <= 103) {
			int cur = 0; // 100 == 0
			switch (goal) {
				case 98:
				case 99:
					cur = 2;
					break;
				case 101:
				case 102:
				case 103:
					cur = 3;
					break;
			}
			System.out.println(cur);
			return;
		}

		int brokenNum = Integer.parseInt(br.readLine());
		brokens = new boolean[10];

		StringTokenizer st;
		if (brokenNum > 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < brokenNum; i++) {
				brokens[Integer.parseInt(st.nextToken())] = true;
			}
		}

		int cur = 100;
		int distance = 0;
		int answer = 0;
		int brokenDigit = -1;

		// broken totalDigit 있는지 확인
		for (int i = 0; i < totalDigit; i++) {
			int c = goalStr.charAt(i) - '0';
			if (brokens[c]) {
				brokenDigit = i;
				break;
			}
			answer++;
		}
		// broken Digit 있으면
		if (brokenDigit != -1) {
			// 1->0, 10<-9 이 부분 주의
			int unBrokenNum = Integer.parseInt(
				goalStr.substring(0, brokenDigit) + "000000".substring(brokenDigit, totalDigit));
			int upNumber = getUpNumber(brokenDigit);
			int downNumber = getDownNumber(brokenDigit);
			int upResult = Math.abs(unBrokenNum + upNumber - goal);
			int downResult = Math.abs(unBrokenNum + downNumber - goal);
			//
			System.out.println(Math.min(upResult, downResult) + totalDigit);
		} else {
			// 없으면 입력한 자릿수만큼 출력
			System.out.println(answer);
			return;
		}

	}

	static int getUpNumber(int brokenDigit) {
		String temp = "";
		int brokenDigitNum = 0;
		int curDigit = brokenDigit;
		// 처음 자리는 +1로 시작
		if (totalDigit - curDigit >= 1) {
			brokenDigitNum = goalStr.charAt(curDigit) - '0';
			while (brokens[brokenDigitNum]) {
				brokenDigitNum++;
				if (brokenDigitNum == 10) {
					brokenDigitNum = 0;
					temp += "1"; // 20이 될 일..?
				}
			}
			temp += brokenDigitNum;
			curDigit++;
		}

		while (totalDigit - curDigit >= 1) {
			brokenDigitNum = 0;
			while (brokens[brokenDigitNum]) {
				brokenDigitNum++;
				if (brokenDigitNum == 10) {
					brokenDigitNum = 0;
					temp += "1"; // 20이 될 일..?
				}
			}
			temp += brokenDigitNum;
			curDigit++;
		}
		return Integer.parseInt(temp);
	}

	static int getDownNumber(int brokenDigit) {
		String temp = "";
		int brokenDigitNum = 0;
		int curDigit = brokenDigit;
		// 처음 자리는 -1로 시작
		if (totalDigit - curDigit >= 1) {
			brokenDigitNum = goalStr.charAt(curDigit) - '0';
			while (brokens[brokenDigitNum]) {
				brokenDigitNum--;
				if (brokenDigitNum == -1) {
					brokenDigitNum = 9;
					// temp += "0"; // TODO 0-> -로 되는 것?
				}
			}
			temp += brokenDigitNum;
			curDigit++;
		}

		while (totalDigit - curDigit >= 1) {
			brokenDigitNum = 9;
			while (brokens[brokenDigitNum]) {
				brokenDigitNum--;
				if (brokenDigitNum == -1) {
					brokenDigitNum = 9;
					// temp += "1"; // 20이 될 일..?
				}
			}
			temp += brokenDigitNum;
			curDigit++;
		}
		return Integer.parseInt(temp);
	}

}
