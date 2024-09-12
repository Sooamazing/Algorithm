package Programmers.datastructure;

import java.util.Stack;

public class RotatingParentheses {

	public static void main(String[] args) {
		RotatingParentheses rotatingParentheses = new RotatingParentheses();
		System.out.println(rotatingParentheses.solution("[](){}")); // 3
		System.out.println(rotatingParentheses.solution("}]()[{")); // 2
		System.out.println(rotatingParentheses.solution("[)(]")); // 0
		System.out.println(rotatingParentheses.solution("}}}")); // 0
		System.out.println(rotatingParentheses.solution("{{{{")); // 0

	}

	public int solution(String s) {
		int answer = 0;

		int length = s.length();
		if (length % 2 == 1)
			return 0;

		for (int i = 0; i < length; i++) {

			// stack에 집어 넣기
			Stack<Character> stk = new Stack<>();
			for (int j = i; j < length + i; j++) {
				stk.push(s.charAt(j % length));
			}

			// stack
			Stack<Character> stkRight = new Stack<>();

			while (!stk.isEmpty()) {
				if (stkRight.isEmpty()) {
					stkRight.push(stk.pop());
				}
				while (!stkRight.isEmpty()) {
					char right = stkRight.peek();
					if (stk.isEmpty()) {
						break;
					}
					char left = stk.peek();
					if ((right == ']' && left == '[') || (right == '}' && left == '{') || (right == ')'
						&& left == '(')) {
						stkRight.pop();
						stk.pop();
						// if(stkRight.isEmpty()&&!stk.isEmpty()) stkRight.push(stk.pop());
					} else {
						stkRight.push(stk.pop());
						break;
					}
				}
			}

			// System.out.println(i + "번째 stkRight.isEmpty() : " + stkRight.isEmpty());
			if (stkRight.isEmpty())
				answer++;
		}

		return answer;
	}

}
