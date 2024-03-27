package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 24-03-27
// https://www.acmicpc.net/problem/1735
public class SumOfFractions {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int numeratorA = Integer.parseInt(st.nextToken());
		int denominatorA = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());

		int numeratorB = Integer.parseInt(st.nextToken());
		int denominatorB = Integer.parseInt(st.nextToken());

		int denominator = denominatorA * denominatorB;
		int numerator = numeratorA * denominatorB + numeratorB * denominatorA;

		int min = Math.min(denominator, numerator);

		for (int i = min; i > 0; i--) {
			if (denominator % i == 0 && numerator % i == 0) {
				denominator /= i;
				numerator /= i;
			}
		}

		System.out.println(numerator + " " + denominator);

	}
}
