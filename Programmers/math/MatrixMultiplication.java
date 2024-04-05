package Programmers.math;

// 24-04-05 20min
// https://school.programmers.co.kr/learn/courses/30/lessons/12949
public class MatrixMultiplication {

	public int[][] solution(int[][] arr1, int[][] arr2) {
		int iSize = arr1.length;
		int multiplyIdxMax = arr2.length;
		int jSize = arr2[0].length;
		int[][] answer = new int[iSize][jSize];
		for (int i = 0; i < iSize; i++) {
			int[] cur1 = arr1[i];
			for (int j = 0; j < jSize; j++) {
				int sum = 0;
				for (int k = 0; k < multiplyIdxMax; k++) {
					sum += cur1[k] * arr2[k][j];
				}
				answer[i][j] = sum;
			}
		}
		return answer;
	}
}
