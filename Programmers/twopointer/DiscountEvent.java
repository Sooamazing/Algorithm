package Programmers.twopointer;

import java.util.Arrays;

// 24-04-04 40min
// https://school.programmers.co.kr/learn/courses/30/lessons/131127
public class DiscountEvent {
	public static void main(String[] args) {

	}

	public int solution(String[] want, int[] number, String[] discount) {
		int answer = 0;
		int wantLength = number.length;
		int[] resultCnt = new int[wantLength];

		// 10개까지 resultCnt에 담아 주기.
		for (int i = 0; i < 10; i++) {
			// 이진 탐색은 정렬되어 있어야 함.
			// int idx = Arrays.binarySearch(want, discount[i], (o1, o2)->( o1.compareTo(o2)));
			// if(idx >= 0){
			//     resultCnt[idx]++;
			// }

			String curDis = discount[i];
			for (int j = 0; j < wantLength; j++) {
				if (curDis.equals(want[j])) {
					resultCnt[j]++;
					break;
				}
			}

		}

		// System.out.println(Arrays.toString(resultCnt));

		int discountLength = discount.length;
		for (int i = 10; i < discountLength; i++) {

			if (Arrays.equals(number, resultCnt)) {
				answer++;
			}

			for (int j = 0; j < wantLength; j++) {

				// i-10번째는 빼 주기.
				int minusIdx = i - 10;
				String curMinusDis = discount[minusIdx];
				if (curMinusDis.equals(want[j])) {
					resultCnt[j] = resultCnt[j] == 0
						? 0 : resultCnt[j] - 1;
				}

				// 현재 index 추가
				int plusIdx = i;
				String curPlusDis = discount[plusIdx];
				if (curPlusDis.equals(want[j])) {
					resultCnt[j]++;
				}
			}

		}

		// 마지막으로 바뀐 arr 비교
		if (Arrays.equals(number, resultCnt)) {
			answer++;
		}

		return answer;
	}
}
