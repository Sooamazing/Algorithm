package Baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 24-05-19 40min
// https://www.acmicpc.net/problem/2023
public class CuriousPrimeNumber {

	static boolean[] primeNumsBools;
	static boolean[] primeNums;
	static int totalSize;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();

		int digit = Integer.parseInt(br.readLine());
		totalSize = (int)Math.pow(10, digit);
		primeNumsBools = new boolean[totalSize];
		primeNums = new boolean[totalSize];
		startEratosthenes();
		getCuriousPrimeNums(digit);
		System.out.println(sb);
	}

	static void getCuriousPrimeNums(int digit) {
		int rangeStart = (int)Math.pow(10, digit - 1);
		for (int i = rangeStart; i < totalSize; i++) {
			int curNum = i;
			boolean isPrime = true;
			while (curNum > 0) {
				if (!primeNums[curNum]) {
					isPrime = false;
					break;
				}
				curNum /= 10;
			}
			if (isPrime) {
				sb.append(i).append("\n");
			}
		}
	}

	static void startEratosthenes() {
		int totalNumNumber = totalSize - 2;
		int startNum = 2;
		while (totalNumNumber > 0) {
			for (int i = startNum; i < totalSize; i++) {
				if (!primeNumsBools[i]) {
					for (int j = i; j < totalSize; j += i) {
						if (!primeNumsBools[j]) {
							primeNumsBools[j] = true;
							totalNumNumber--;
						}
					}
					primeNums[i] = true;
					startNum = i + 1;
				}
			}
		}
	}
}
