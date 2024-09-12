package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

// aaaaaaaaaa
// 2
// aaaa
// aaa
public class DeterminingString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder()); // 길이 긴 것부터 확인 필요.

		String mainStr = br.readLine();

		// 영어 소문자만 있어야 확인 가능.
		if (!mainStr.matches("[a-z]*")) {
			System.out.println(0);
			return;
		}

		int wordNum = Integer.parseInt(br.readLine());
		for (int i = 0; i < wordNum; i++) {
			pq.add(br.readLine());
		}

		while (!pq.isEmpty()) {
			String curPartialWord = pq.poll();

			if (mainStr.contains(curPartialWord)) {
				mainStr = mainStr.replaceAll(curPartialWord, "1");
			} else {
				System.out.println(0);
				return;
			}
		}

		if (mainStr.matches("1*")) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}
}
