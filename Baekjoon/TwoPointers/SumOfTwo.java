package Baekjoon.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-04-07 15min
// https://www.acmicpc.net/problem/3273
public class SumOfTwo {

	private static int answer;
	private static int numSize;
	private static int goalNum;
	private static int[] nums;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		numSize = Integer.parseInt(br.readLine());
		nums = new int[numSize];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numSize; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums); // 정렬 필수.
		goalNum = Integer.parseInt(br.readLine());
		// 여기까지 입력 완료

		getSums();

		System.out.println(answer);
	}

	private static void getSums() {

		int leftPtr = 0;
		int rightPtr = 1;

		while (leftPtr != (numSize - 1)) {
			int curSum = nums[leftPtr] + nums[rightPtr];

			if (curSum == goalNum) {
				// 현재 합이 목표값과 같으면 leftPtr 증가, rightPtr는 leftPtr 바로 뒤로 초기화, 정답 증가
				leftPtr++;
				rightPtr = leftPtr + 1;
				answer++;
			} else if (curSum < goalNum) {
				// 현재 합이 목표값보다 작으면 rightPtr 증가
				rightPtr++;
				if (rightPtr == numSize) {
					// rightPtr이 numSize와 같아지면 leftPtr 증가, rightPtr는 leftPtr 바로 뒤로 초기화
					leftPtr++;
					rightPtr = leftPtr + 1;
				}
			} else {
				leftPtr++;
				rightPtr = leftPtr + 1;
			}

		}

	}

}
