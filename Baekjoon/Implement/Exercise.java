package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 25-05-29 20min
// https://www.acmicpc.net/problem/1173
public class Exercise {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int goalTime = Integer.parseInt(st.nextToken());
		int minPulse = Integer.parseInt(st.nextToken());
		int currentPulse = minPulse;
		int maxPulse = Integer.parseInt(st.nextToken());
		int afterExercise = Integer.parseInt(st.nextToken());
		int afterRest = Integer.parseInt(st.nextToken());

		// 현재 맥박 + 운동 후 맥박이 최대 맥박보다 크면 절대 불가
		if (currentPulse + afterExercise > maxPulse) {
			System.out.println("-1");
			return;
		}

		int currentTime = 0;
		int currentExercise = 0;
		while (true) {
			currentTime++;

			// 운동 가능하다면, 운동하기
			if (currentPulse + afterExercise <= maxPulse) {
				currentPulse += afterExercise;
				currentExercise++;
			} else {
				// 쉴 때 최저 맥박 유지하기
				currentPulse = Math.max(minPulse, currentPulse - afterRest);
			}

			// 목표한 시간만큼 운동했다면 현재 시간 출력 후 끝내기
			if (currentExercise == goalTime) {
				System.out.println(currentTime);
				return;
			}

		}
	}
}
