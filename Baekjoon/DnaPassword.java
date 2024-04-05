package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 필수임에 주의
// 4 2
// AAAA
// 0 0 0 0

// 24-04-05 40min
// https://www.acmicpc.net/problem/12891
public class DnaPassword {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int dnaLength = Integer.parseInt(st.nextToken());
		int passwordLength = Integer.parseInt(st.nextToken());

		String dna = br.readLine();

		int[] stdDnaNums = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			stdDnaNums[i] = Integer.parseInt(st.nextToken());
		}

		// 슬라이딩 윈도우 초기 설정
		int[] curDnaNums = new int[4];
		for (int i = 0; i < passwordLength; i++) {
			int idx = getIdx(dna, i);
			if (idx != -1) {
				curDnaNums[idx]++;
			}
		}

		int result = 0;
		if (isMetTheRequirements(stdDnaNums, curDnaNums)) {
			result++;
		}

		// 끝까지 확인하기
		for (int i = passwordLength; i < dnaLength; i++) {

			int idx = getIdx(dna, i - passwordLength);
			if (idx != -1) {
				curDnaNums[idx]--;
			}

			idx = getIdx(dna, i);
			if (idx != -1) {
				curDnaNums[idx]++;
			}

			if (isMetTheRequirements(stdDnaNums, curDnaNums)) {
				result++;
			}
		}

		System.out.println(result);

	}

	private static boolean isMetTheRequirements(int[] stdArr, int[] sub) {
		int length = stdArr.length;
		for (int i = 0; i < length; i++) {

			if (stdArr[i] > sub[i]) {
				return false;
			}
		}
		return true;
	}

	private static int getIdx(String str, int idx) {

		switch (str.charAt(idx)) {
			case 'A':
				return 0;
			case 'C':
				return 1;
			case 'G':
				return 2;
			case 'T':
				return 3;
			default:
				return -1;
		}

		// return switch (str.charAt(idx)) {
		// 	case 'A' -> 0;
		// 	case 'C' -> 1;
		// 	case 'G' -> 2;
		// 	case 'T' -> 3;
		// 	default -> -1;
		// };

	}

}
