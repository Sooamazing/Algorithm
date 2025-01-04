package Baekjoon.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 25-01-04 5min
// https://www.acmicpc.net/problem/10825
public class KoreanEnglishMath {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int total = Integer.parseInt(br.readLine());
		StringTokenizer st;
		PriorityQueue<Student> pq = new PriorityQueue<>();
		while (total-- > 0) {
			st = new StringTokenizer(br.readLine());
			pq.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken())));
		}

		while (!pq.isEmpty()) {
			sb.append(pq.poll().name).append("\n");
		}

		System.out.println(sb);

	}

	static class Student implements Comparable<Student> {
		String name;
		int korean;
		int english;
		int math;

		public Student(String name, int korean, int english, int math) {
			this.name = name;
			this.korean = korean;
			this.english = english;
			this.math = math;
		}

		@Override
		public int compareTo(Student o) {
			if (this.korean == o.korean) {
				if (this.english == o.english) {
					if (this.math == o.math) {
						// 이름 오름차순
						return this.name.compareTo(o.name);
					}
					// 수학 점수 내림차순
					return Integer.compare(o.math, this.math);
				}
				// 영어 점수 오름차순
				return Integer.compare(this.english, o.english);
			}
			// 국어 점수 내림차순
			return Integer.compare(o.korean, this.korean);
		}
	}

}
