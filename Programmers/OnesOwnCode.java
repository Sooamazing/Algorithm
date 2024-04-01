package Programmers;

// 24-04-01
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class OnesOwnCode {
	public static void main(String[] args) {
		String solution = solution("aukks", "wbqd", 5);
		String solution1 = solution("bcdefghijklmnopqrstuvwxyz", "a", 1);

		System.out.println(solution);
		System.out.println(solution1);
		solution.equals("happy");
		solution1.equals("cdefghijklmnopqrstuvwxyzb");

	}

	public static String solution(String s, String skip, int index) {
		char[] std = s.toCharArray();
		String result = "";

		for (int i = 0; i < std.length; i++) {
			char cur = std[i];

			for (int j = 0; j < index; j++) {

				// 다음 문자로 넘어간다.
				cur++;

				// z를 넘어가면 다시 a로
				if (cur > 'z') {
					cur = 'a';
				}

				// skip에 해당하는 문자가 있으면 j를 줄인다.
				if (skip.contains(String.valueOf((cur)))) {
					j--;
				}

			}
			result += ((char)(cur));
		}

		return result;
		// int skipIdx = 0;
		// for (int i = 0; i < std.length; i++) {
		// 	if (std[i] == skipArr[skipIdx]) {
		// 		skipIdx++;
		// 		if (skipIdx == skipArr.length) {
		// 			i = i - skipIdx;
		// 			skipIdx = 0;
		// 		}
		// 	}
		// }
		// StringBuilder sb = new StringBuilder();
		// for (int i = 0; i < std.length; i++) {
		// 	if (i == index) {
		// 		continue;
		// 	}
		// 	sb.append(std[i]);
		// }
		// return sb.toString();
	}
}
