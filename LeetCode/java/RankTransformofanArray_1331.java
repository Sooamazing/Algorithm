package LeetCode.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 26-07-12 20min
// https://leetcode.com/problems/rank-transform-of-an-array
public class RankTransformofanArray_1331 {

    public int[] arrayRankTransform(int[] arr) {

        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        Map<Integer, Integer> map = new HashMap<>();

        int rank = 1;
        for (int i = 0; i < sortedArr.length; i++) {
            int current = sortedArr[i];
            if (map.containsKey(current)) {
                continue;
            }
            map.put(current, rank++);
        }
        // for(int i = 0 ; i <arr.length;i++){
        //     System.out.println(arr[i]+ ", "+ sortedArr[i]);
        // }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}