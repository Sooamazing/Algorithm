package Programmers.datastructure;

import java.util.Set;
import java.util.TreeSet;

// 24-04-07 30min
// https://school.programmers.co.kr/learn/courses/30/lessons/68644
public class PickTwoAndAdd {
	private Set<Integer> set;
	private int[] temp;
	private int length;

	public int[] solution(int[] numbers) {

		length = numbers.length;
		set = new TreeSet<>();
		temp = new int[2];

		combi(numbers, 0, 0);
		int[] answer = new int[set.size()];

		// set을 배열로 변환하는 방법
		// answer = set.toArray(answer);
		int i = 0;
		for (int s : set) {
			answer[i++] = s;
		}

		// 배열 정렬
		// Arrays.sort(answer);
		return answer;
	}

	private void combi(int[] numbers, int depth, int idx) {
		if (depth == 2) {
			set.add(temp[0] + temp[1]);
			return;
		}

		for (int i = 0; i < length; i++) {
			if (i != idx) {
				temp[depth] = numbers[i];
				combi(numbers, depth + 1, i);
			}
		}
	}
}
