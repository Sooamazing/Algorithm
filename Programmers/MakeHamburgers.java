package Programmers;

import java.util.ArrayList;
import java.util.List;

// 24-04-01
// https://school.programmers.co.kr/learn/courses/30/lessons/133502
public class MakeHamburgers {
	public static void main(String[] args) {
		int result = solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}); // 2
		int solution1 = solution(new int[] {1, 3, 2, 3, 1}); // 0
		int solution2 = solution(new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3}); // 2
		int solution3 = solution(new int[] {2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 3, 1, 3, 1}); // 2
		System.out.println(result);
		System.out.println(solution1);
		System.out.println(solution2);
		System.out.println(solution3);
	}

	public static int solution(int[] ingredient) {
		int answer = 0;

		List<Integer> ingredientList = new ArrayList<>();
		for (int i = 0; i < ingredient.length; i++) {
			ingredientList.add(ingredient[i]);
		}

		int idx = 0;
		int resultIdx = 0;
		int[] orders = new int[] {1, 2, 3, 1};
		while (idx < ingredientList.size()) {
			if (orders[resultIdx] == ingredientList.get(idx)) {
				if (resultIdx == 3) {
					answer++;
					resultIdx = 0;
					for (int i = 0; i < 4; i++) {
						ingredientList.remove(idx--);
						if (idx < 0) {
							break;
						}
					}
					if (--idx < 0) {
						idx = 0;
					}
				} else {
					resultIdx++;
				}
				System.out.println(ingredientList);

			} else {
				if (ingredientList.get(idx) == 1) {
					resultIdx = 1;
				} else {
					resultIdx = 0;
				}
			}
			idx++;
		}

		return answer;
	}

}
