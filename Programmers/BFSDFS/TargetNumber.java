package Programmers.BFSDFS;

// 24-04-07 60min
// https://school.programmers.co.kr/learn/courses/30/lessons/43165
public class TargetNumber {

	private int answer;
	private int length;

	public int solution(int[] numbers, int target) {

		length = numbers.length;

		getCombis(numbers, target, 0, 0);

		return answer;

	}

	private void getCombis(int[] numbers, int target, int tempSum, int depth) {

		if (depth == length) {

			if (target == tempSum) {
				answer++;
			}

			return;
		}

		getCombis(numbers, target, tempSum + numbers[depth], depth + 1);
		getCombis(numbers, target, tempSum - numbers[depth], depth + 1);

	}

}
