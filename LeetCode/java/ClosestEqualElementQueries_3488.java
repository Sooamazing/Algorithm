package LeetCode.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// 26-07-10 55min
// https://leetcode.com/problems/closest-equal-element-queries
public class ClosestEqualElementQueries_3488 {

    public List<Integer> solveQueries(int[] nums, int[] queries) {

        List<Integer> answer = new LinkedList<>();
        // value, index list
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> indexes = map.getOrDefault(nums[i], new LinkedList());

            indexes.add(i);
            map.put(nums[i], indexes);
        }

        // 무제한 같은 숫자일 때의 꼼수.
        if (map.size() == 1 && nums.length != 1) {
            for (int i = 0; i < queries.length; i++) {
                answer.add(1);
            }
            return answer;
        }

        for (int query : queries) {
            int currentNumber = nums[query];
            List<Integer> list = map.get(currentNumber);
            if (list.size() == 1) {
                answer.add(-1);
                continue;
            }
            int listIndex = list.indexOf(query);
            int leftIndex = ((listIndex - 1) < 0) ? (list.size() - 1) : (listIndex - 1);
            int rightIndex = (listIndex + 1) % list.size();

            int leftDiff = 0;
            if (leftIndex < listIndex) {
                leftDiff = list.get(listIndex) - list.get(leftIndex);
            } else {
                leftDiff = list.get(listIndex) + (nums.length - list.get(leftIndex));
            }
            int rightDiff = list.get(rightIndex) - list.get(listIndex);
            if (rightIndex < listIndex) {
                rightDiff = list.get(rightIndex) + (nums.length - list.get(listIndex));
            }

            // System.out.println("query: "+query+", listIndex: "+listIndex+", leftIndex: "+leftIndex+", rightIndex:"+rightIndex+", leftDiff: "+leftDiff+", rightDiff: "+rightDiff);

            answer.add(Math.min(leftDiff, rightDiff));
        }

        // time limit exceeded

        // int length = nums.length;

        // for(int i = 0 ; i<queries.length;i++){
        //     int index = queries[i];
        //     int current = nums[index];
        //     // System.out.println("index: "+index);
        //     boolean found = false;
        //     for(int j = 1; j<=((length)/ 2);j++){
        //         int left = (index - j +length) % length;
        //         int right = (index + j) % length;
        //         // System.out.println(left+", "+right);

        //         if(nums[left] == current){
        //             answer.add(j);
        //     // System.out.println("left");
        //             found = true;
        //             break;
        //         }else if(nums[right] == current){
        //             answer.add(j);
        //     // System.out.println("right");
        //             found = true;
        //             break;
        //         }
        //     }
        //     // System.out.println("---");
        //     if(!found){
        //     // System.out.println("not");
        //         answer.add(-1);
        //     }
        // }

        return answer;
    }
}