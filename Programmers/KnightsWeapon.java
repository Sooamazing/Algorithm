package Programmers;

// 24-04-03
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
class KnightsWeapon {

	public static void main(String[] args) {
		int solution1 = solution(5, 3, 2); // 10
		int solution2 = solution(10, 3, 2); // 21
		System.out.println(solution1);
		System.out.println(solution2);
	}

	public static int solution(int number, int limit, int power) {
		int answer = 1;

		for (int i = 1; i <= number; i++) {
			int cur = i;
			int curCnt = 0;
			int max = cur;
			for (int j = 1; j < max; j++) {
				if (cur % j == 0) {
					max = cur / j;
					if (max == j) {
						curCnt++;
					} else {
						curCnt += 2;
					}
				}
			}

			if (curCnt > limit) {
				answer += power;
			} else {
				answer += curCnt;
			}

			System.out.println("cur = " + cur + ", max = " + max + ", curCnt = " + curCnt + ", answer"
				+ " = " + answer);
		}
		return answer;
	}
} // Solution