package Baekjoon.Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25-06-08 10min
// https://www.acmicpc.net/problem/2789
public class NoStudyAbroad {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] deletedSpells = {"C", "A", "M", "B", "R", "I", "D", "G", "E"};

		String mailWord = br.readLine();

		for (String spell : deletedSpells) {
			mailWord = mailWord.replace(spell, "");// '' 불가
		}

		System.out.println(mailWord);
	}
}
