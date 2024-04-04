package Programmers;

public class Carpet {
	class Solution {
		public int[] solution(int brown, int yellow) {
			int[] answer = new int[2];

			// 면적 구하기
			int square = brown + yellow;

			// 만족하는 변 찾기
			int length = 1;
			for (int i = 3; i < square / 2; i++) {

				// brown 가로 == i
				// yellow 가로 == i-2
				// brown 세로 == square/i
				// yellow 세로 == square/i-2

				int curYellow = (i - 2) * (square / i - 2);
				// int curBrown = i * (square / i) - curYellow;

				if (square % i == 0 // 한 변을 만족하는 나누어 떨어지는 수
					// &&(square%(i-2))==0
					&& curYellow == yellow // yellow 만족
					// && (curYellow + curBrown) == square // 주어진 면적 만족
				) {
					length = i;
					break;
				}

			}

			answer[0] = square / length;
			answer[1] = length;
			return answer;

		}

		// 다른 풀이
		// 24-04-04 20min
		public int[] solution2(int brown, int yellow) {
			int[] answer = new int[2];

			int square = brown + yellow;
			for (int i = 1; i <= yellow; i++) {

				int a = i;
				int b = yellow / i;

				// yellow 면적의 한 변(약수)이고, 총 면적과 일치하면 정답
				if (yellow % i == 0
					&& (a + 2) * (b + 2) == square) {
					answer = new int[] {b + 2, a + 2};
					break;
				}

			}

			return answer;

		}

	}
}
