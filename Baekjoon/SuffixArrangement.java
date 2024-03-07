package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuffixArrangement {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split("");

		String[] suffixes = new String[split.length];

		for (int i = 0; i < split.length; i++) {

			suffixes[i] = "";
			for (int j = i; j < split.length; j++) {
				suffixes[i] += split[j];
			}

		}

		Arrays.sort(suffixes);

		for (String s : suffixes) {
			System.out.println(s);
		}

	}

}
