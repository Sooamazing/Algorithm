package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

// 24-05-02 5min
// https://www.acmicpc.net/problem/2671
public class SubmarineIdentification {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String string = br.readLine();

		String regex = "(100+1+|01)+";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(string).matches()) {
			System.out.println("SUBMARINE");
		} else {
			System.out.println("NOISE");
		}

	}
}
