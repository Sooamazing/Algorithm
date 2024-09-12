package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

// 24-05-18 30min
// https://www.acmicpc.net/problem/10835
public class CardGame {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int roundNum = Integer.parseInt(br.readLine());

		int[] leftArr = new int[roundNum];
		int leftMax = 0;
		List<Integer> leftList = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < roundNum; i++) {
			int leftNum = Integer.parseInt(st.nextToken());
			leftList.add(leftNum);
			leftArr[i] = leftNum;
			leftMax = Math.max(leftMax, leftNum);
		}
		leftList.sort(Comparator.naturalOrder());

		st = new StringTokenizer(br.readLine());
		int rightIdx = 0;
		int leftIdx = 0;
		int sum = 0;
		while (leftIdx < roundNum && rightIdx < roundNum) {
			int rightNum = Integer.parseInt(st.nextToken());
			int leftNum = leftArr[leftIdx];

			// 왼쪽 덱의 최댓값과 같을 때 왼쪽, 오른쪽 버리기
			// 오른쪽 덱의 최댓값이 왼쪽 덱의 최댓값보다 큰 경우는?
			if (leftMax <= rightNum) {
				leftIdx++;
				leftList.remove(Integer.valueOf(leftNum));
				rightIdx++;
				continue;
			}

			// 왼쪽 값이 오른쪽 값보다 큰 경우, 오른쪽 값의 점수를 얻음.
			if (leftNum > rightNum) {
				sum += rightNum;
				rightIdx++;
				continue;
			}

			int idx = Collections.binarySearch(leftList, rightNum);
			if (idx < 0) {
				int originIdx = -(idx + 1);
				if (originIdx >= leftList.size()) {
					// 왼쪽 덱에 남아 있는 카드 숫자의 최댓값보다 오른쪽이 클 때
					leftIdx++;
				}
			} else {

			}

		}
	}
}
