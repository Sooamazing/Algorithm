package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringExplosion {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String subject = br.readLine();
		String explosionWord = br.readLine();
		char[] explosionWordCharArray = explosionWord.toCharArray();
		int explosionSize = explosionWord.length();

		List<Character> list = new ArrayList<>();

		for (char c : subject.toCharArray()) {
			list.add(c);
		}

		// list로 구현
		for (int i = explosionSize - 1; i < list.size(); i++) {
			int curIdx = i - (explosionSize - 1);
			if (curIdx < 0) {
				continue;
			}

			if (curIdx + explosionSize > list.size()) {
				break;
			}

			boolean isSame = true;
			for (int j = curIdx; j < curIdx + explosionSize; j++) {
				if (explosionWordCharArray[j - curIdx] != list.get(j)) {
					isSame = false;
					break;
				}
			}

			if (isSame) {
				int tempWordSize = explosionSize;
				while (tempWordSize-- > 0) {
					i--;
					list.remove(curIdx);
				}
			}

		}

		if (list.isEmpty()) {
			System.out.println("FRULA");
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (char c : list) {
			sb.append(c);
		}

		System.out.println(sb);

		// 메모리 초과. why? 왜지?
		// while (subject.contains(explosionWord)) {
		// 	// replaceAll, replace 차이?
		// 	subject = subject.replaceAll(explosionWord, "");
		// }
		//
		// if (subject.isBlank()) {
		// 	System.out.println("FRULA");
		// 	return;
		// }
		//
		// System.out.println(subject);

	}
}
