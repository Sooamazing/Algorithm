package Programmers.string;

// 24-04-06 30min
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class StringDivide {
	public int solution(String s) {
		int answer = 0;

		char cur = s.charAt(0);
		char prev = cur;
		int firstCnt = 0;
		int notFirstCnt = 0;

		for (int i = 0; i < s.length(); i++) {
			cur = s.charAt(i);

			// x와 x가 아닌 수의 개수가 일치하면 정답++;
			// 기준 prev를 현재 문자로 업데이트
			// 맨 처음과 바뀐 직후에 정답++;
			if (firstCnt == notFirstCnt) {
				prev = cur;
				answer++;
			}

			if (cur == prev) {
				firstCnt++;
			} else {
				notFirstCnt++;
			}

		}

		return answer;
	}
}
