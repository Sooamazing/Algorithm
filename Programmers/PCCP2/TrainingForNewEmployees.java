package Programmers.PCCP2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class TrainingForNewEmployees {
	public static void main(String[] args) {

		int a = solution(new int[] {10, 3, 7, 2}, 2);
		int b = solution(new int[] {1, 2, 3, 4}, 3);

		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

	static public int solution(int[] ability, int number) {

		int answer = 0;

		PriorityQueue que = new PriorityQueue();
		for (int i = 0; i < ability.length; i++) {
			que.add(ability[i]);
		}

		for (int i = 0; i < number; i++) {
			int first = (int)que.poll();
			int second = (int)que.poll();
			first = second= first +second;
			que.add(first);
			que.add(second);
		}
		while(!que.isEmpty()){
			answer+=(int)que.poll();
		}

		return answer;
	}
}
