package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 2 97 100
// 1 99
// 0 10 512 -> 답 47?
// 24-06-14 120min
// https://www.acmicpc.net/problem/1477
public class EstablishingARestStop {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int originStopNum = Integer.parseInt(st.nextToken());
		int moreStopNum = Integer.parseInt(st.nextToken());
		int highwayLength = Integer.parseInt(st.nextToken());
		// if (originStopNum == 0) {
		// 	// 원래 아무 것도 없는 경우
		// 	System.out.println((highwayLength - 1) % (moreStopNum) == 0
		// 		? (highwayLength - 1) / (moreStopNum)
		// 		: (highwayLength - 1) / (moreStopNum) + 1);
		// 	return;
		// }
		int[] stops = new int[originStopNum + 2];
		stops[0] = 0;
		stops[originStopNum + 1] = highwayLength;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < originStopNum; i++) {
			stops[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(stops);

		int left = 1;
		int right = highwayLength - 1;

		// left <= right , right = mid + 1; 인 것과 차이 확인.
		while (left < right) {
			int mid = (left + right) / 2;

			int curCnt = 0;
			for (int i = 1; i < originStopNum + 2; i++) {
				int distance = stops[i] - stops[i - 1]; // distance에 추가로 -1 해 주는 건 왜?
				curCnt += (distance / mid - 1); // -1은 나누면서 현재+추가가 되고, 추가되는 곳만 cnt하기 위해.
				// if (distance % mid == 0) {
				// 	curCnt--; // 왜..?
				// }
				if (distance % mid > 0)
					curCnt++;
			}

			if (curCnt > moreStopNum) {
				left = mid + 1;
			} else {
				right = mid;
			}

		}

		// int[] distances = new int[originStopNum + 1];
		// // 1 <= 휴게소의 위치 <= 고속도로 길이 -1
		// // distances[0] = stops[0];
		// // distances[originStopNum] = highwayLength - stops[originStopNum - 1]; // 이게 틀렸다!
		// for (int i = 0; i < originStopNum + 1; i++) {
		// 	distances[i] = (stops[i + 1] - stops[i]);
		// }
		// Arrays.sort(distances);
		//
		// int left = distances[0];
		// int right = distances[originStopNum];
		// while (left < right) {
		// 	int mid = (left + right) / 2;
		//
		// 	int curCnt = 0;
		// 	for (int i = 0; i < originStopNum + 1; i++) {
		// 		curCnt += distances[i] / mid;
		// 		// if (distances[i] % mid == 0)
		// 		// 	curCnt--;
		// 		if (distances[i] % mid > 0)
		// 			curCnt++;
		// 		curCnt--;
		// 	}
		//
		// 	if (curCnt > moreStopNum) {
		// 		left = mid + 1;
		// 	} else {
		// 		right = mid;
		// 	}
		//
		// }

		System.out.println(left);

		// 반례 100 400 500, 휴게소 2개 설치 -> 200 300에 설치하는 것이 최적
		// PriorityQueue<Integer> que = new PriorityQueue<>(Comparator.reverseOrder());
		// que.add(stops[0]);
		// que.add(highwayLength - 1 - stops[originStopNum - 1]);
		// for (int i = 1; i < originStopNum; i++) {
		// 	que.add(stops[i] - stops[i - 1]);
		// }
		//
		// for (int i = 0; i < moreStopNum; i++) {
		// 	int max = que.poll();
		// 	que.add(max / 2);
		// 	que.add(max - max / 2);
		// }
		//
		// System.out.println(que.poll());

	}
}
