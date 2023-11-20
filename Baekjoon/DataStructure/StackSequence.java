// https://www.acmicpc.net/problem/1874

package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		int N = Integer.parseInt(br.readLine());
		int[] todoArr = new int[N];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int temp = todoArr[i] = Integer.parseInt(br.readLine());
			pq.add(temp);
		} // todoArr, pq 입력 완료

		Stack<Integer> stack = new Stack<>();

		// 맨 처음은 무조건 push('+')
		stack.push(pq.poll().intValue());
		sb.append('+').append('\n');
		int todoIdx = 0;

		// stack이 빌 때까지
		while (!stack.isEmpty()) {

			// stack의 맨 위와 todoArr 값이 같으면
			if (stack.peek() == todoArr[todoIdx]) {

				// stack에서 pop('-'), todoIdx+1 진행
				stack.pop();
				sb.append('-').append('\n');
				todoIdx++;
				// System.out.println("todoIdx = " + todoIdx);

				// stack이 비었는데, pq는 비지 않았다면, 바로 pq 다음 값 push하기.
				if(stack.isEmpty()&&!pq.isEmpty()){
					stack.push(pq.poll().intValue());
					sb.append('+').append('\n');
					// System.out.println("stack1 = " + stack.peek());
				}

			} else {

				// System.out.println("stack2 = " + stack.peek());
				// pq에 남아 있는 값이 더 없다면 NO 출력
				if(pq.isEmpty()){
					sb = new StringBuilder("NO");
					break;
				}

				// 다르면 pop이 불가해 push('+') 뿐.
				stack.push(pq.poll().intValue());
				sb.append('+').append('\n');

			}
		}

		System.out.println(sb);

	}
}
