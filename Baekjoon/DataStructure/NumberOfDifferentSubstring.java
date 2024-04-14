package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

// 24-04-14 20min
// https://www.acmicpc.net/problem/11478
public class NumberOfDifferentSubstring {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String string = br.readLine();
		Set<String> set = new HashSet<>();

		int length = string.length();
		int curLength = length + 1;
		while (curLength-- > 0) {

			for (int i = 0; i < curLength; i++) {
				set.add(string.substring(i, curLength));
			}
		}

		System.out.println(set.size());

	}
}

