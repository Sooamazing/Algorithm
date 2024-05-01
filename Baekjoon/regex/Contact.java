package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 24-05-01 10min
// https://www.acmicpc.net/problem/1013
public class Contact {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int size = Integer.parseInt(br.readLine());

		// 100000001111111, 01의 반복 표현.
		String regex = "(100+1+|01)+";
		// 같은 패턴이라 1개 생성
		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < size; i++) {
			String curStr = br.readLine();
			Matcher matcher = pattern.matcher(curStr);
			boolean matches = matcher.matches();
			if (matches) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}

		System.out.println(sb);

	}
}
