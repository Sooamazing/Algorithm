package Baekjoon.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Slurpy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int testCase = Integer.parseInt(br.readLine());

		String slumpRegex = "^[DE]F+([DE]F+|G)$";
		Pattern slumpPattern = Pattern.compile(slumpRegex);
		String slimpRegex2 = "^AH";
		String slimpRegex3more = "^A(B()+|" + slumpRegex + ")C$";
		Pattern slimpPattern = Pattern.compile(slimpRegex3more);
		sb.append("SLURPYS OUTPUT\n");

		while (testCase-- > 0) {
			String string = br.readLine();
			if (slumpPattern.matcher(string).matches()) {
				sb.append("YES\n");
			} else {
				sb.append("NO\n");
			}
		}
		sb.append("END OF OUTPUT");

	}
}
