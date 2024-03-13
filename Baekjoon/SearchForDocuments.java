package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.acmicpc.net/problem/1543
public class SearchForDocuments {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String std = br.readLine();
		String searchWord = br.readLine();

		int result = 0;

		Pattern pattern = Pattern.compile(searchWord);
		Matcher matcher = pattern.matcher(std);

		while (matcher.find()) {
			result++;
		}

		System.out.println(result);

	}
}
