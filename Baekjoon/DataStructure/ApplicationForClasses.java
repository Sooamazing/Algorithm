package Baekjoon.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 24-04-21 60min
// https://www.acmicpc.net/problem/13414
public class ApplicationForClasses {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int maxPeopleNum = Integer.parseInt(st.nextToken());
		int appliersNum = Integer.parseInt(st.nextToken());

		// list에서 조건 분기로 하는 게 나을까? set이 나을까?
		// List<Integer> waitingList = new ArrayList<>();
		Map<Integer, Integer> allApplierMap = new HashMap<>();
		int[] arr = new int[appliersNum * 2 + 1];
		Arrays.fill(arr, -1); // 0번 학번 검사 필요해 -1로 채움.
		// int curStudentId = Integer.parseInt(br.readLine());
		// allApplierMap.put(curStudentId, 0);
		// waitingList.add(curStudentId);

		for (int i = 0; i < appliersNum; i++) {
			int curStudentId = Integer.parseInt(br.readLine());
			int curStudentIdx = allApplierMap.getOrDefault(curStudentId, -1);
			if (curStudentIdx != -1) {
				// 이미 대기열 목록에 포함되어 있는 경우
				arr[curStudentIdx] = -1;
			}
			arr[i] = curStudentId;
			allApplierMap.put(curStudentId, i);
			// if (curMapSize != curStudentIdx) {
			// 	// 이미 대기열 목록에 포함되어 있는 경우
			// 	allApplierMap.put(curStudentId, curStudentIdx);
			// 	// waitingList.remove(curStudentIdx);
			// 	// waitingList.add(curStudentId);
			// } else {
			// 	// 처음으로 수강 신청하는 경우
			// 	allApplierMap.put(curStudentId, curStudentIdx);
			// 	// waitingList.add(curStudentId);
			// }

		}

		// Set<Integer> keySet = allApplierMap.keySet();
		// List<Map.Entry<Integer, Integer>> list = entrySet.stream().collect(Collectors.toList());
		// list.sort((o1, o2) -> {
		// 	return o1.getValue() - o2.getValue();
		// });

		StringBuilder sb = new StringBuilder();
		// 수강 신청하려는 학생이 총 가능한 인원보다 적을 수 있음.
		int availableNum = Math.min(allApplierMap.size(), maxPeopleNum);
		for (int curId : arr) {
			if (availableNum > 0) {
				// int curId = entry.getKey();
				if (curId > -1) {
					// 앞 자리가 0일 수 있음.
					sb.append(String.format("%08d", curId)).append('\n');
					availableNum--;
				}
			} else {
				break;
			}
		}

		System.out.println(sb);

	}
}
