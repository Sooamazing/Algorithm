package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

// 24-04-02
// https://www.acmicpc.net/problem/25206
public class YourRatingIs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Double> scoreMap = Map.of(
			"A+", 4.5
			, "A0", 4.0
			, "B+", 3.5
			, "B0", 3.0
			, "C+", 2.5
			, "C0", 2.0
			, "D+", 1.5
			, "D0", 1.0
			, "F", 0.0
		);

		double sum = 0;
		double ratingSum = 0;
		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String subject = st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String rating = st.nextToken();

			if (!rating.equals("P")) {
				sum += (credit * scoreMap.get(rating));
				ratingSum += credit;
			}

		}

		// Math.round((Total/CNT) * 1000000) / 1000000.0
		System.out.println(String.format("%.6f", sum / ratingSum));

	}

}
