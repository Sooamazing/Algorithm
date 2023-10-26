//https://certi.programmers.co.kr/about/sample

package Programmers.PCCP1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LoneAlphabet {
	public static void main(String[] args) {
		System.out.println(solution("zbzbz"	));
	}

	static String solution(String input_string) {
		String answer = "";
		List<String> list = new ArrayList<>(); //정답 글자 담는 list
		String[] splits = input_string.split(""); //input_string 쪼개기

		for (int i = 0; i < splits.length; i++) {

			String temp = splits[i]; // temp = 이후 splits 배열에서 찾을 글자
			boolean flag = false; // 다른 글자가 만난 적 있니? //위치 중요
			for (int j = i; j < splits.length; j++) {

				// 다른 글자 발견! flag true
				if (!temp.equals(splits[j])) {
					flag = true;
				}

				// 정답 리스트에 포함 안 됐다? 그럼 담자!
				// 다른 글자 발견 이후 같은 숫자? 정답입니다!
				if (temp.equals(splits[j]) && flag) {
					if (!list.contains(splits[j])) {
						// answer = answer + splits[i];
						list.add(splits[i]);
					}
					// 다른 글자 발견한 순간 이후는 보지 않아도 됨!
					break;
				}
			}
		}

		// 전부 완료된 후 오름차순으로 정렬 및 answer에 더하고, 값이 없으면 N 저장. -> list.size에 따른 분기로 해도 됐을 듯.

		// list.stream().sorted();
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			answer+=list.get(i);
		}
		if(answer==""){
			answer="N";
		}
		return answer;
	}
}