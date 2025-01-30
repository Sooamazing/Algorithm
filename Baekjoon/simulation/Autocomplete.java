package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-01-30 3min
// https://www.acmicpc.net/problem/24883
public class Autocomplete {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String answer = "";
		if (input.toUpperCase().charAt(0) == 'N') {
			answer = "Naver D2";
		} else {
			answer = "Naver Whale";
		}

		System.out.println(answer);
	}
}