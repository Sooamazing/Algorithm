package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-08-05 110min
// https://www.acmicpc.net/problem/11509
// 반례: https://www.acmicpc.net/board/view/141845
public class ShootingBalloons {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int balloonsNum = Integer.parseInt(br.readLine());
		// int[] arr = new int[1_000_000 + 1];
		int[] arr = new int[balloonsNum];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ans = 0;

		// binary search - 시간 초과
		// int cnt = 0;
		// for (int i = 0; i < balloonsNum; i++) {
		// 	int curBalloonHeight = Integer.parseInt(st.nextToken());
		//
		//
		// 	int left = balloonsNum - 1 - cnt;
		// 	int right = balloonsNum - 1;
		// 	int mid = 0;
		// 	boolean isFound = false;
		// 	while (left <= right) {
		// 		mid = (left + right) / 2;
		// 		int curHeight = arr[mid];
		// 		if (curHeight == curBalloonHeight) {
		// 			isFound = true;
		// 			break;
		// 		} else if (curHeight < curBalloonHeight) {
		// 			// 지금 풍선 높이보다 낮은 경우
		// 			left = mid + 1;
		// 		} else {
		// 			right = mid - 1;
		// 		}
		// 	}
		//
		// 	if (isFound) {
		// 		if (arr[mid] <= 1) {
		// 			arr[mid] = 0;
		// 			cnt--;
		// 		} else {
		// 			arr[mid]--;
		// 		}
		// 	} else {
		// 		if (balloonsNum - 1 < left) {
		// 			// 오른쪽으로 벗어난 경우, 새로 삽입
		// 			arr[cnt++] = curBalloonHeight - 1;
		// 			ans++;
		// 		} else {
		// 			// 왼쪽으로 벗어난 경우, 중간 값이라 만족하지 않는 경우, 왼쪽 값 이용
		//
		// 			// 무조건 풍선 값보다 left 값이 큼.
		// 			if (curBalloonHeight == 1) {
		// 				// 1인 경우, left++, 탐색 범위 줄이기.
		// 				arr[left] = 0;
		// 				cnt--;
		// 			} else {
		// 				arr[left] = curBalloonHeight - 1;
		// 			}
		// 		}
		// 	}
		//
		// 	Arrays.sort(arr);
		// }

		// 시도 2 시간 초과
		// PriorityQueue<Integer> pq = new PriorityQueue<>();
		// for (int i = 0; i < balloonsNum; i++) {
		// 	int curBalloonHeight = Integer.parseInt(st.nextToken());
		// 	if (pq.isEmpty()) {
		// 		ans++;
		// 		if (curBalloonHeight != 1) {
		// 			pq.add(curBalloonHeight - 1);
		// 		}
		// 		continue;
		// 	}
		//
		// 	Queue<Integer> tempQue = new LinkedList<>();
		// 	boolean isFound = false;
		// 	while (!pq.isEmpty()) {
		// 		int poll = pq.poll();
		// 		if (poll >= curBalloonHeight) {
		// 			if (curBalloonHeight != 1) {
		// 				pq.add(curBalloonHeight - 1);
		// 			}
		// 			isFound = true;
		// 			break;
		// 		} else {
		// 			tempQue.add(poll);
		// 		}
		// 	}
		// 	if (!isFound) {
		// 		ans++;
		// 		if (curBalloonHeight != 1) {
		// 			pq.add(curBalloonHeight - 1);
		// 		}
		// 	}
		// 	while (!tempQue.isEmpty()) {
		// 		pq.add(tempQue.poll());
		// 	}
		// }

		// 시도 1
		// 반례
		// 8
		// 5 4 5 4 1 3 3 5
		// for (int i = 0; i < balloonsNum; i++) {
		// 	int curBalloonHeight = Integer.parseInt(st.nextToken());
		// 	if (arr[curBalloonHeight] == 0) {
		// 		ans++;
		// 		// 자기 자신은 이미 터져서 포함 X
		// 		for (int j = 1; j < curBalloonHeight; j++) {
		// 			arr[j]++;
		// 		}
		// 	} else {
		// 		arr[curBalloonHeight]--;
		// 	}
		//
		// }
		System.out.println(ans);

	}
}
