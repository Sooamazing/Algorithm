package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

// 24-04-08 20min
// https://www.acmicpc.net/problem/13417
public class CardStrings {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int testSize = Integer.parseInt(br.readLine());

		while (testSize-- > 0) {
			int cardSize = Integer.parseInt(br.readLine());
			String cur = br.readLine();

			List<Character> charList = new LinkedList<>();
			charList.add(cur.charAt(0));
			for (int i = 1; i < cardSize; i++) {
				char curChar = cur.charAt(2 * i);
				int curListSize = charList.size();

				char cFirst = charList.get(0);
				char cLast = charList.get(curListSize - 1);
				if (curChar <= cFirst) {
					charList.add(0, curChar);
					// } else if (cLast <= curChar) {
				} else {
					charList.add(curChar);
				}

			}

			for (Character c : charList) {
				sb.append(c);
			}

			sb.append('\n');

		}
		System.out.println(sb);
	}
}
