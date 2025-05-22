package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-05-22 15min
// https://www.acmicpc.net/problem/28702
public class FizzBuzz {

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String first = br.readLine();
		String second = br.readLine();
		String third = br.readLine();

		if (!(first.contains(FIZZ) || first.contains(BUZZ))) {
			int answerNumber = Integer.parseInt(first) + 3;
			System.out.println(convertToFizzBuzz(answerNumber));
			return;
		} else if (!(second.contains(FIZZ) || second.contains(BUZZ))) {
			int answerNumber = Integer.parseInt(second) + 2;
			System.out.println(convertToFizzBuzz(answerNumber));
			return;
		} else if (!(third.contains(FIZZ) || third.contains(BUZZ))) {
			int answerNumber = Integer.parseInt(third) + 1;
			System.out.println(convertToFizzBuzz(answerNumber));
			return;
		}

		// 문자가 연속으로 나오는 경우가 있을까? 우선 없다고 가정하고 제출함.

	}

	private static String convertToFizzBuzz(int number) {

		if (number % 15 == 0) {
			return FIZZ + BUZZ;
		} else if (number % 3 == 0) {
			return FIZZ;
		} else if (number % 5 == 0) {
			return BUZZ;
		}
		return String.valueOf(number);
	}
}
