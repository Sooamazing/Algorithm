package Programmers.datastructure;

import java.util.Stack;

public class DeliveryBox {
	public static void main(String[] args) {

		DeliveryBox deliveryBox = new DeliveryBox();
		int solution = deliveryBox.solution(new int[] {4, 3, 1, 2, 5}); // 2
		int solution1 = deliveryBox.solution(new int[] {5, 4, 3, 2, 1}); // 5
		System.out.println(solution);
		System.out.println(solution1);

	}

	public int solution(int[] order) {
		int answer = 0;

		int orderLen = order.length;
		Stack<Integer> stack = new Stack<>();

		// 컨베이어 벨트 운영
		int curIdx = 0;
		int cur = order[curIdx];
		for (int i = 1; i <= orderLen; i++) {
			cur = order[curIdx];
			// System.out.println("for문 내부: "+i);
			// 현재 컨베이어 벨트 순서와 order가 같다면 answer++;
			if (cur == i) {
				answer++;
				curIdx++;
				// System.out.println("현재 컨베이어 벨트와 같음: "+i);
				// 보조 컨베이어 벨트 순서와 order가 같다면 answer++;
			} else if (!stack.isEmpty() && stack.peek() == cur) {

				int pop = stack.pop();
				answer++;
				curIdx++;
				i--;
				// System.out.println("stack에서 빼기: "+pop);

				// 같은 게 없다면 보조 컨베이어 벨트로 옮기기
				// 보조 컨베이어 벨트에 이미 있을 때와 없을 때?
			} else {
				stack.push(i);
				// System.out.println("stack에 집어 넣기: "+i);
			}
		}

		// 메인은 끝나고 보조만 남은 경우
		while (!stack.isEmpty()) {
			cur = order[curIdx];
			if (stack.peek() == cur) {

				int pop = stack.pop();
				answer++;
				curIdx++;
				// System.out.println("마지막 보조 stack에서 빼기: "+pop);

			} else {
				break;
			}
		}

		return answer;
	}
}
