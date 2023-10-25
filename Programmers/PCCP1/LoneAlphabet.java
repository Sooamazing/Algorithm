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
		List<String> list = new ArrayList<>();
		String[] splits = input_string.split("");

		int cnt = 0;
		for (int i = 0; i < splits.length; i++) {
			String temp = splits[i];
			boolean flag = false; //위치 중요
			for (int j = i; j < splits.length; j++) {
				if (!temp.equals(splits[j])) {
					flag = true;
				}
				if (temp.equals(splits[j]) && flag) {
					if (!list.contains(splits[j])) {
						// answer = answer + splits[i];
						list.add(splits[i]);
					}
					break;
				}
			}
		}
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