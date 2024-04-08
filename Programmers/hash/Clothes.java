package Programmers.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// 24-04-07 40min - hint
// https://school.programmers.co.kr/learn/courses/30/lessons/42578
public class Clothes {
	// private int answer;
	// private int length;
	// private int[] numArr;
	private Map<String, Integer> map;

	// private String[] keyArr;
	public int solution(String[][] clothes) {

		map = new HashMap<>();
		for (String[] str : clothes) {
			map.compute(str[1], (K, V) -> V == null ? 1 : V + 1);
		}

		// System.out.println(map);
		Set<String> keySet = map.keySet();
		// length = keySet.size();
		// keyArr = new String[length];
		// int idx = 0;
		// for(String s: keySet){
		//     keyArr[idx++]=s;
		// }
		// System.out.println(length);
		// for(int i = 1 ; i<= length;i++){
		//     numArr=new int[i];
		//     getSums(0, i, 0);
		// }
		//         (하의 2개+안입은 경우) * (상의 2개 + 안입은 경우) = 3 * 4 = 12
		// 그리고 전체에서 -1 (전부다 안입는 경우의 수를 뺀다)
		int sum = 1;
		for (String key : keySet) {
			sum *= (map.get(key) + 1);
		}
		return sum - 1;
	}

	//     private void getSums(int depth, int targetDepth, int curIdx){
	//         if(targetDepth==depth){
	//             // System.out.println(Arrays.toString(numArr));
	//             int sum = 1;
	//             for(int a:numArr){
	//                 sum*=a;
	//             }
	//             answer+=sum;
	//             return;
	//         }
	//         // System.out.println(Arrays.toString(keyArr));
	//         for(int i = curIdx+1 ; i <= length; i++){
	//             // System.out.println(keyArr[i-1]);
	//             numArr[depth]=map.get(keyArr[i-1]);
	//             getSums(depth+1, targetDepth, i);

	//         }

	//     }
}
