package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 4
 * 43silos000002w000000000000000000000000000000000000000
 * zita0020
 * le2sim
 * 0000231233a0234zi03596823948676890000453456737
 *
 */
public class MathAssignment {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());

		List<String> list = new ArrayList<>();
		while (testCase-- > 0) {
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(br.readLine());

			while (matcher.find()) {
				String cur = matcher.group();
				while (cur.startsWith("0")) {
					cur = cur.replaceFirst("0", "");
				}
				if (cur.equals("")) {
					list.add("0");
					continue;
				}
				list.add(cur);
			}

		}

		Collections.sort(list,
			(o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : Integer.compare(o1.length(), o2.length()));

		for (String i : list) {
			System.out.println(i);
		}
	}
}
