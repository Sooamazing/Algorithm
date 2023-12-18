package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Chromosome {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			//
			// 문자열은 {A, B, C, D, E, F} 중 0개 또는 1개로 시작해야 한다.
			// 	그 다음에는 A가 하나 또는 그 이상 있어야 한다.
			// 그 다음에는 F가 하나 또는 그 이상 있어야 한다.
			// 	그 다음에는 C가 하나 또는 그 이상 있어야 한다.
			// 그 다음에는 {A, B, C, D, E, F} 중 0개 또는 1개가 있으며, 더 이상의 문자는 없어야 한다.

			// Pattern.compile("^[ABCDEF]?[A]+[B]+[C]+[ABCDEF]?$")
			boolean matches = br.readLine().trim().matches("^[ABCDEF]?[A]+[F]+[C]+[ABCDEF]?$");
			if (matches) {
				sb.append("Infected!").append('\n');
			}else{
				sb.append("Good").append('\n');
			}

			// String[] split = br.readLine().split("");
			// Set<String> set = new LinkedHashSet<>(List.of(split));
			//
			// boolean isFirst = true;
			// boolean isFirstA = false;
			// for (String s : set) {
			// 	if (isFirst && s.equals("B") || s.equals("E") || s.equals("D") || s.equals("F") || s.equals("C")) {
			// 		// 첫 문자에 {B, C, D, E, F} 중 1개
			// 		isFirst = false;
			// 		isFirstA = false;
			// 		continue;
			// 	} else if (isFirst && s.equals("A")) {
			// 		// 첫 문자에 A
			// 		isFirst = false;
			// 		isFirstA = true;
			// 	} else if (!isFirst && !isOther && !s.equals("F")) {
			// 		// 첫 문자에 A가 아닌 글자 -> A, F, C 순
			//
			// 	} else if () {
			//
			// 	} else if () {
			//
			// 	}
			// }


		}
		System.out.println(sb);
	}
}
