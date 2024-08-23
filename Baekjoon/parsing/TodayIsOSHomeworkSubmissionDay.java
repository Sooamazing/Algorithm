package Baekjoon.parsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

// 5
// 12/25/2005 12/31
// 12/25/2005 1/1
// 12/25/2005 1/2
// 12/31/2005 1/1
// 12/31/2005 1/7
// 24-08-23 75min
// https://www.acmicpc.net/problem/2730
public class TodayIsOSHomeworkSubmissionDay {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st;
		int testCaseNum = Integer.parseInt(br.readLine());

		while (testCaseNum-- > 0) {
			st = new StringTokenizer(br.readLine());
			// String dueDateStr = st.nextToken();
			// String[] dueDateSplit = dueDateStr.split("/");
			// int dueMonth = Integer.parseInt(dueDateSplit[0]);
			// int dueDay = Integer.parseInt(dueDateSplit[1]);
			// int dueYear = Integer.parseInt(dueDateSplit[2]);
			// LocalDate dueDate = LocalDate.of(dueYear, dueMonth, dueDay);

			// String submissionDateStr = st.nextToken();
			// String[] submissionDateSplit = submissionDateStr.split("/");
			// int submissionMonth = Integer.parseInt(submissionDateSplit[0]);
			// int submissionDay = Integer.parseInt(submissionDateSplit[1]);
			// LocalDate submissionDate = LocalDate.of(dueYear, submissionMonth, submissionDay);

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy"); // 0 없으면 M, 0 있으면 MM
			LocalDate dueDate = LocalDate.parse(st.nextToken(), formatter);
			int dueYear = dueDate.getYear();
			LocalDate minDate = LocalDate.parse("12/25/" + dueYear, formatter).minusDays(1);
			LocalDate maxDate = LocalDate.parse("1/7/" + (dueYear + 1), formatter).plusDays(1);

			LocalDate submissionDate = LocalDate.parse(st.nextToken() + "/" + dueYear, formatter);

			// 우선, minDate와 maxDate 사이에 있는지 확인
			if (dueDate.isAfter(minDate)) {
				// 마감 날짜가 12/25 이후고, 제출 날짜가 1월이면 제출 연도를 1년 더해주기
				if (submissionDate.getMonthValue() == 1) {
					submissionDate = submissionDate.plusYears(1);
				}
			} else if (dueDate.isBefore(maxDate) && submissionDate.getMonthValue() == 12) {
				// 마감 날짜가 1/7 이전이고, 제출 날짜가 12월이면 제출 연도를 1년 빼 주기
				submissionDate = submissionDate.minusYears(1);
			}
			String submissionDateStr = submissionDate.format(formatter); // 출력 형식 맞추기

			int diff = (int)dueDate.until(submissionDate, ChronoUnit.DAYS); // dueDate와 submissionDate 사이의 차이를 일로 나타내기

			if (diff < -7) {
				sb.append("OUT OF RANGE\n");
			} else if (diff < 0) {
				sb.append(submissionDateStr)
					.append(" IS ")
					.append(-diff)
					.append(" DAY")
					.append(diff == -1 ? "" : "S") // 차이가 1이면 복수 X
					.append(" PRIOR\n");
			} else if (diff == 0) {
				sb.append("SAME DAY\n");
			} else if (diff <= 7) {
				sb.append(submissionDateStr)
					.append(" IS ")
					.append(diff)
					.append(" DAY")
					.append(diff == 1 ? "" : "S")
					.append(" AFTER\n");
			} else {
				sb.append("OUT OF RANGE\n");
			}
		}

		System.out.println(sb);
	}
}