package Baekjoon.Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 24-04-01, 06 6h
// https://www.acmicpc.net/problem/1759
public class MakePassword {

	private static int passwordLength;
	private static int alphabetSize;

	private static char[] tempChar;

	private static char[] candidateGroupCharArray;
	private static StringBuilder sb = new StringBuilder();

	private static final String ALL_PATTERN = "(?=.*[aeiou])(?=.*[bcdfghjklmnpqrstvwxyz].*[bcdfghjklmnpqrstvwxyz]).*";
	// private static final String ALL_PATTERN = "^(?=.*[a|e|i|o|u])(?=.[b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z]{2,})"
	// 	+ ".*";
	private static final String VOWELS_PATTERN = "[aeiou]+";
	private static final String CONSONANTS_PATTERN = ".*[bcdfghjklmnpqrstvwxyz].*[bcdfghjklmnpqrstvwxyz].*";

	private static final Pattern patternAll = Pattern.compile(
		".*[aeiou].*[bcdfghjklmnpqrstvwxyz].*[bcdfghjklmnpqrstvwxyz].*");
	// private static final Pattern patternAll = Pattern.compile(
	// 	"(?=.*[aeiou])(?=.*[bcdfghjklmnpqrstvwxyz].*[bcdfghjklmnpqrstvwxyz]).*");

	private static final Pattern patternVowels = Pattern.compile("[aeiou]+");
	private static final Pattern patternConsonants = Pattern.compile(
		".*[bcdfghjklmnpqrstvwxyz]" + ".*[bcdfghjklmnpqrstvwxyz].*"); // 연속 X
	// private static final Pattern patternConsonants = Pattern.compile("[bcdfghjklmnpqrstvwxyz]{2,}"); // 이건 연속일 때를 의미

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		passwordLength = Integer.parseInt(st.nextToken());
		alphabetSize = Integer.parseInt(st.nextToken());
		tempChar = new char[passwordLength];

		String pwdCandidateGroup = br.readLine().replace(" ", "");
		candidateGroupCharArray = pwdCandidateGroup.toCharArray();
		Arrays.sort(candidateGroupCharArray);

		// st = new StringTokenizer(br.readLine());

		// List<String> alphabetVowel = new ArrayList<>();

		// List<String> alphabetConsonant = new ArrayList<>();

		// for (int i = 0; i < passwordLength; i++) {
		// 	String cur = st.nextToken();
		// 	if (cur.matches("[aeiou]")) {
		// 		alphabetVowel.add(cur);
		// 	} else {
		// 		alphabetConsonant.add(cur);
		// 	}
		// }

		getPassword(0, -1);
		System.out.print(sb);

	}

	private static void getPassword(int depth, int prev) {
		if (depth == passwordLength) {
			String tempStr = new String(tempChar);
			// Matcher matcherVowels = patternVowels.matcher(tempStr);
			// Matcher matcherConsonants = patternConsonants.matcher(tempStr);
			Matcher matcherAll = patternAll.matcher(tempStr);
			if (matcherAll.find()) {
				// if (matcherVowels.find() && matcherConsonants.find()) {
				sb.append(tempStr).append('\n');
			}
			// if (Pattern.matches(ALL_PATTERN, tempStr)) {
			// if (Pattern.matches(VOWELS_PATTERN, tempStr)
			// 	&& Pattern.matches(CONSONANTS_PATTERN, tempStr)) {
			// 	sb.append(tempStr).append('\n');
			// }
			return;
		}

		for (int i = prev + 1; i < alphabetSize; i++) {
			// if (prev < i) {
			tempChar[depth] = candidateGroupCharArray[i];
			getPassword(depth + 1, i);
			// }
		}

	}

}
