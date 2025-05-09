package Baekjoon.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

// 25-05-09 10min
// https://www.acmicpc.net/problem/11365
public class TerceSpoT {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder tempSb = new StringBuilder();
		StringJoiner answerSj = new StringJoiner("\n");

		String sentence = null;
		while (!(sentence = br.readLine()).equals("END")) {
			tempSb.append(sentence).reverse();
			answerSj.add(tempSb);
			tempSb = new StringBuilder();
		}

		System.out.println(answerSj);

	}
}
