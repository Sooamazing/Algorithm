package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 24-03-19
// https://www.acmicpc.net/problem/10814
public class SortByAge {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Person> pq = new PriorityQueue<>(
			(o1, o2) -> {
				if (o1.getAge() == o2.getAge()) {
					return o1.getOrder() - o2.getOrder();
				}
				return o1.getAge() - o2.getAge();
			}
		);

		int total = Integer.parseInt(br.readLine());
		for (int i = 0; i < total; i++) {
			String[] input = br.readLine().split(" ");
			pq.add(new Person(Integer.parseInt(input[0]), input[1], i + 1));
		}

		while (!pq.isEmpty()) {
			Person cur = pq.poll();
			sb.append(cur.getAge()).append(' ').append(cur.getName()).append('\n');
		}

		System.out.println(sb);

	}

	private static class Person {

		private int age;
		private String name;
		private int order;

		public Person(int age, String name, int order) {
			this.age = age;
			this.name = name;
			this.order = order;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}

		public int getOrder() {
			return order;
		}

	}
}
