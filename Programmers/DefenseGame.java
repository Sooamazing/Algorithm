package Programmers;

import java.util.Arrays;

// 24-04-05~06 150min
// https://school.programmers.co.kr/learn/courses/30/lessons/142085
public class DefenseGame {

	private static int round;
	private static int[] enemies;
	private static int curN;

	public int solution(int n, int k, int[] enemy) {

		curN = n;
		enemies = enemy;
		round = enemy.length;
		visited = new boolean[round];
		kIdxResult = new int[k];
		getCombi(0, k, -1);

		return max;
	}

	private boolean[] visited;
	private int[] kIdxResult;
	private int max;

	private void getCombi(int curDepth, int targetDepth, int prev) {

		if (curDepth == targetDepth) {
			int finalRound = getFinalRound(kIdxResult);
			max = Math.max(max, finalRound);
			return;
		}

		// 조합 구하기 - 겹치지 않게, 오름차순으로!
		for (int i = curDepth; i < round; i++) {

			if (!visited[i] && prev < i) {

				visited[i] = true;
				kIdxResult[curDepth] = i;
				getCombi(curDepth + 1, targetDepth, i);
				visited[i] = false;
				prev = i;

			}

		}

	}

	private int getFinalRound(int[] kIdxResult) {
		int result = 0;
		int weapons = curN; // 아군 병사
		System.out.println(Arrays.toString(kIdxResult));
		// kIdxResult 빼고 라운드 진행 시 최대 라운드 구하기
		for (int i = 0; i < round; i++) {

			// System.out.println(Arrays.toString(kIdxResult));
			// 무적권 사용 시 pass, result++;
			if (Arrays.binarySearch(kIdxResult, i) >= 0) {
				result++;
				// System.out.println(i+"가 kIdxResult에 있습니다. 무적권 사용, Round: "+round);

				// 무적권 사용 X, 싸워서 0이상인 경우 -> 아군 계산, result++;
			} else if ((weapons - enemies[i]) >= 0) {
				weapons -= enemies[i];
				result++;
				// System.out.println(i+"가 kIdxResult에 없습니다. 현재 weapons: "+weapons+", enemies: "+enemies[i]);
				// 싸웠는데, 진 경우 종료.
			} else {
				return result;
			}

		}

		return result;

	}

}
