package Programmers.datastructure;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// 24-04-15 50min
// https://school.programmers.co.kr/learn/courses/30/lessons/150370
public class ExpirationDateForCollectingPersonalInformation {
	public int[] solution(String today, String[] terms, String[] privacies) {

		LocalDate todayLocal = getLocalDate(today);

		// 각 약관 개월 수
		Map<String, Integer> termsMap = new HashMap<>();
		// Map<String, Integer> termIdxMap = new HashMap<>();
		int idx = 1;
		for (String term : terms) {
			String[] split = term.split(" ");
			termsMap.put(split[0], Integer.parseInt(split[1]));
			// termIdxMap.put(split[0], idx++);
		}

		// 약관 계산하기
		idx = 1;
		List<Integer> resultList = new LinkedList<>();

		for (String privacy : privacies) {
			String[] split = privacy.split(" ");
			LocalDate agreedLocal = getLocalDate(split[0]);
			String agreedTerm = split[1];

			long termMonth = termsMap.get(agreedTerm);
			LocalDate endedDay = agreedLocal.plusMonths(termMonth);
			if (!todayLocal.isBefore(endedDay)) {
				// today가 약관 종료일(ended)보다 같거나 늦으면 종료, 파기 대상.
				resultList.add(idx);
			}
			idx++;

		}

		// 오름차순 정렬
		Collections.sort(resultList);

		idx = 0;
		int[] answer = new int[resultList.size()];
		for (int result : resultList) {
			answer[idx++] = result;
		}
		return answer;
	}

	// LocalDate 로 변환
	private LocalDate getLocalDate(String today) {

		// \\. 처리 필수
		String[] todays = today.split("\\.");
		int todayYear = Integer.parseInt(todays[0]);
		int todayMonth = Integer.parseInt(todays[1]);
		int todayDay = Integer.parseInt(todays[2]);

		return LocalDate.of(todayYear, todayMonth, todayDay);
	}

}
