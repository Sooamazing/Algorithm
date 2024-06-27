package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-27 70min
// https://www.acmicpc.net/problem/15662
public class SawToothedWheel2 {
	static int[][] wheels;
	static int[] wheelIdxes;
	static int wheelSize;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		wheelSize = Integer.parseInt(br.readLine());

		wheelIdxes = new int[wheelSize + 1];
		wheels = new int[wheelSize + 1][8];
		for (int i = 1; i <= wheelSize; i++) {
			String wheel = br.readLine();
			for (int j = 0; j < 8; j++) {
				wheels[i][j] = wheel.charAt(j) - '0';
			}
		}

		int rotateNum = Integer.parseInt(br.readLine());
		StringTokenizer st;
		while (rotateNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			int wheelNum = Integer.parseInt(st.nextToken());
			boolean isRight = st.nextToken().equals("1");

			int originIdx = wheelIdxes[wheelNum];

			// 회전
			if (isRight) {
				wheelIdxes[wheelNum] = (originIdx - 1) < 0 ? 7 : originIdx - 1;
			} else {
				wheelIdxes[wheelNum] = (originIdx + 1) % 8;
			}

			// tempWheelNum = wheelNum; // 지역 변수로 사용하는 방법은?
			// left
			// while (tempWheelNum > 1) {
			goLeft(wheelNum, originIdx, isRight);
			// }
			// right
			// tempWheelNum = wheelNum;
			// while (tempWheelNum < wheelSize) {
			goRight(wheelNum, originIdx, isRight);
			// }
		}

		int ans = 0;
		for (int i = 1; i <= wheelSize; i++) {
			int wheelIdx = wheelIdxes[i];
			if (wheels[i][wheelIdx] == 1) {
				ans++;
			}
		}

		System.out.println(ans);
	}

	// static int tempWheelNum;

	static void goLeft(int wheelNum, int originIdx, boolean isCurRotateDirRight) {

		if (wheelNum < 2)
			return;

		int leftSideIdxOfCurWheel = (originIdx + 6) % 8;
		int leftSideMagOfCurWheel = wheels[wheelNum][leftSideIdxOfCurWheel];

		int leftWheelNum = wheelNum - 1;
		int leftWheelIdx = wheelIdxes[leftWheelNum];
		int rightSideIdxOfLeftWheel = (wheelIdxes[leftWheelNum] + 2) % 8;
		int rightSideMagOfLeftWheel = wheels[leftWheelNum][rightSideIdxOfLeftWheel];

		// 다른 극이면
		if (leftSideMagOfCurWheel + rightSideMagOfLeftWheel == 1) {

			// 회전 - 현재 rotate와 반대
			if (isCurRotateDirRight) {
				wheelIdxes[leftWheelNum] = (leftWheelIdx + 1) % 8;
			} else {
				wheelIdxes[leftWheelNum] = (leftWheelIdx - 1) < 0 ? 7 : leftWheelIdx - 1;
			}

			// left
			goLeft(leftWheelNum, leftWheelIdx, !isCurRotateDirRight);
		}
		// 같은 극이면		return;

	}

	static void goRight(int wheelNum, int originIdx, boolean isCurRotateDirRight) {
		if (wheelNum >= wheelSize)
			return;

		int rightSideIdxOfCurWheel = (originIdx + 2) % 8;
		int rightSideMagOfCurWheel = wheels[wheelNum][rightSideIdxOfCurWheel];

		int rightWheelNum = wheelNum + 1;
		int rightWheelIdx = wheelIdxes[rightWheelNum];
		int leftSideIdxOfRightWheel = (wheelIdxes[rightWheelNum] + 6) % 8;
		int leftSideMagOfRightWheel = wheels[rightWheelNum][leftSideIdxOfRightWheel];

		// 다른 극이면
		if (rightSideMagOfCurWheel + leftSideMagOfRightWheel == 1) {

			// 회전 - 현재 rotate와 반대
			if (isCurRotateDirRight) {
				wheelIdxes[rightWheelNum] = (rightWheelIdx + 1) % 8;
			} else {
				wheelIdxes[rightWheelNum] = (rightWheelIdx - 1) < 0 ? 7 : rightWheelIdx - 1;
			}

			// right
			goRight(rightWheelNum, rightWheelIdx, !isCurRotateDirRight);
		}
	}
}
