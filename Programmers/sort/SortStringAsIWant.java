package Programmers.sort;

import java.util.PriorityQueue;

// 24-04-06 15min
// https://school.programmers.co.kr/learn/courses/30/lessons/12915
public class SortStringAsIWant {
	public String[] solution(String[] strings, int n) {

		int length = strings.length;
		String[] answer = new String[length];
		PriorityQueue<CharString> pq = new PriorityQueue<>((o1, o2) -> {
			if (o1.getChars()[n] == o2.getChars()[n]) {
				return o1.getStr().compareTo(o2.getStr());
			}

			return o1.getChars()[n] - o2.getChars()[n];
		});

		for (int i = 0; i < length; i++) {
			String cur = strings[i];
			pq.add(new CharString(cur.toCharArray(), cur));
		}

		int idx = 0;
		while (!pq.isEmpty()) {
			answer[idx++] = pq.poll().getStr();
		}

		return answer;

	}

	private class CharString {
		private char[] chars;
		private String str;

		public CharString(char[] chars, String str) {
			this.chars = chars;
			this.str = str;
		}

		public char[] getChars() {
			return this.chars;
		}

		public String getStr() {
			return this.str;
		}

	}
}
