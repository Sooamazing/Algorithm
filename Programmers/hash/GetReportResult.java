package Programmers.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// 24-04-15 35min
// https://school.programmers.co.kr/learn/courses/30/lessons/92334
public class GetReportResult {
	public int[] solution(String[] id_list, String[] report, int k) {
		int length = id_list.length;
		int[] answer = new int[length];
		Map<String, Integer> idIdxMap = new HashMap<>();
		for (int i = 0; i < length; i++) {
			String str = id_list[i];
			idIdxMap.put(str, i);
		}
		Map<String, Integer> reportNumsMap = new HashMap<>();
		Map<String, Set<String>> reporterNameMap = new HashMap<>();
		// List<String> mailList = new ArrayList<>();

		for (String rep : report) {
			String[] reports = rep.split(" ");
			String reporter = reports[0];
			String block = reports[1];

			// // 신고 횟수 관리
			// reportNumsMap.compute(block, (K, V)-> V==null?1:V+1);

			// 신고자들 리스트 관리
			if (reporterNameMap.containsKey(block)) {
				// 이미 있으면, 해당 신고받은 사람에 신고자 추가
				Set<String> set = reporterNameMap.get(block);
				set.add(reporter);
			} else {
				Set<String> set = new HashSet<>();
				set.add(reporter);
				reporterNameMap.put(block, set);
			}

		}
		Set<String> keySet = reporterNameMap.keySet();
		for (String key : keySet) {
			Set<String> set = reporterNameMap.get(key);
			if (set.size() >= k) {
				for (String str : set) {
					// System.out.print(str+", ");
					int idx = idIdxMap.get(str);
					answer[idx]++;
				}
				// System.out.println(Arrays.toString(answer));
			}

		}

		return answer;
	}
}
