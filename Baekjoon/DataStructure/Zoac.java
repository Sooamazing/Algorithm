package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

// 24-05-16, 24-06-10, 08-15 45min
// https://www.acmicpc.net/problem/16719
public class Zoac {

	static String str;
	static int length;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		str = br.readLine();
		length = str.length();
		// 알파벳 사전 순, 원래 문자에서의 순서
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
			return o1[0] - o2[0];
		});
		for (int i = 0; i < length; i++) {
			pq.add(new int[] {str.charAt(i) - 'A', i});
		}

		StringBuilder resultSb = new StringBuilder();
		StringBuilder tempSb = new StringBuilder();
		List<Integer> orderList = new LinkedList<>();

		int[] poll = pq.poll();
		orderList.add(poll[1]);
		tempSb.append((char)(poll[0] + 'A'));
		resultSb.append(tempSb).append("\n");

		while (!pq.isEmpty()) {
			poll = pq.poll();

			int idx = Collections.binarySearch(orderList, poll[1]);
			if (idx < 0) {
				idx = -idx - 1;
			}
			orderList.add(poll[1]);
			tempSb.insert(idx, (char)(poll[0] + 'A'));
			resultSb.append(tempSb).append("\n");
		}

		System.out.println(resultSb);

	}

	static StringBuilder find(int start, int end, String strSubs) {
		StringBuilder tempSb = new StringBuilder();

		int findIdx = strSubs.indexOf('A', start);
		return tempSb.append(str.charAt(findIdx));
	}

	static class Spell {
		char c;
		int sequence;

		public static Spell of(int sequence, char c) {
			Spell spell = new Spell();
			spell.c = c;
			spell.sequence = sequence;
			return spell;
		}
	}
}
