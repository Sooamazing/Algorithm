package Baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-06-13 45min
// https://www.acmicpc.net/problem/2343
// 참고: https://xntifrxgile.tistory.com/10
public class GuitarLesson {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int lectureNum = Integer.parseInt(st.nextToken());
		int blueRayNum = Integer.parseInt(st.nextToken());

		int[] lectures = new int[lectureNum];
		int sum = 0;
		int longestLectureTime = 0;
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < lectureNum; i++) {
			lectures[i] = Integer.parseInt(st.nextToken());
			sum += lectures[i];
			longestLectureTime = Math.max(longestLectureTime, lectures[i]);
		}

		// 이분 탐색
		int start = longestLectureTime;
		int end = sum;
		// TODO start<end, start=mid+1, end=mid+1 기준. 왜 lowerbound 여야 하는지.
		while (start < end) {
			int mid = (start + end) / 2;

			int curBlueRayNum = 1;
			int tempTime = 0;
			for (int i = 0; i < lectureNum; i++) {
				int curTime = lectures[i];
				if (tempTime + curTime > mid) {
					curBlueRayNum++;
					tempTime = curTime;
				} else {
					tempTime += curTime;
				}
			}

			if (curBlueRayNum > blueRayNum) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		System.out.println(start);

	}
}
