package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 24-08-13,14 75min
// https://www.acmicpc.net/problem/16938
public class CampPreparation {
	static int quizNum;
	static int minLevelSum;
	static int maxLevelSum;
	static int minLevelDiffer;
	static int[] quizLevels;
	static boolean[] visited;
	// static int[] accumulatedSum;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		quizNum = Integer.parseInt(st.nextToken());
		minLevelSum = Integer.parseInt(st.nextToken());
		maxLevelSum = Integer.parseInt(st.nextToken());
		minLevelDiffer = Integer.parseInt(st.nextToken());

		quizLevels = new int[quizNum + 1];

		// accumulatedSum = new int[quizNum + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= quizNum; i++) {
			quizLevels[i] = Integer.parseInt(st.nextToken());
			// accumulatedSum[i] += accumulatedSum[i - 1] + quizLevels[i];
		}
		Arrays.sort(quizLevels);

		int ans = 0;
		for (int i = 2; i <= quizNum; i++) {
			visited = new boolean[quizNum + 1];
			ans += getCombinationNumWith(16, 0, 0, 0, 0, i);
		}

		// 풀이 1. 이분 탐색, 누적합 이용 - 틀림
		// 10 20 30 25 불가.
		// for (int i = 1; i <= quizNum; i++) {
		// 	// 최소 난이도 차를 만족하는 문제의 idx를 추출
		// 	int idx = getMinLevelDifference();
		// 	// idx가 초과되는 경우 예외 처리
		// 	// 해당 idx부터 최소 합과 최대 합 사이인 경우 구하기
		// 	ans += getSizeBetweenMinAndMax(i, idx);
		// }

		System.out.println(ans);
	}

	static int getCombinationNumWith(int start, int end, int idx, int curSum, int curSize, int goal) {
		int cnt = 0;

		// 오름차순 정렬이라 maxLevelSum 기준 넘어가면, 그 뒤는 더 크기에 조건 만족 X.
		if (curSum > maxLevelSum) {
			return 0;
		}

		if (goal == curSize) {
			// 난이도 차, 난이도 합 조건 검증
			// curSum <= maxLevelSum는 위 조건에서 이미 걸렀으므로 무조건 true
			if (quizLevels[end] - quizLevels[start] >= minLevelDiffer
				&& curSum >= minLevelSum) {
				return 1;
			} else {
				return 0;
			}
		}

		// idx+1을 받고, i=idx부터 시작 시 idxEx 날 수 있으니, idx 그대로 넘기로 idx+1 시작이 안전.
		for (int i = idx + 1; i <= quizNum; i++) {
			if (!visited[i]) {
				visited[i] = true;
				// 이렇게 하면, 지나쳤던 end도 max로 포함됨.
				// start = Math.min(start, i);
				// end = Math.max(end, i);
				if (curSize == 0) {
					start = i;
				}
				end = i; // idx는 항상 앞으로 진행하므로 end=i;
				// curSum += quizLevels[i]; // 후처리를 또 해야 함.
				cnt += getCombinationNumWith(start, end, i, curSum + quizLevels[i], curSize + 1, goal);
				visited[i] = false;
			}
		}
		return cnt;
	}

	// static int getMinLevelDifference() {
	// 	int idx = Arrays.binarySearch(quizLevels, minLevelDiffer);
	// 	if (idx < 0) {
	// 		return -(idx + 1);
	// 	} else {
	// 		return idx;
	// 	}
	// }

	// static int getSizeBetweenMinAndMax(int std, int idx) {
	// 	int cnt = 0;
	// 	for (int i = idx; i <= quizNum; i++) {
	// 		int sum = accumulatedSum[i] - accumulatedSum[std - 1];
	//
	// 		if (sum >= minLevelSum
	// 			&& sum <= maxLevelSum) {
	// 			cnt++;
	// 		}
	// 		if (sum > maxLevelSum) {
	// 			break;
	// 		}
	// 	}
	// 	return cnt;
	// }
}
