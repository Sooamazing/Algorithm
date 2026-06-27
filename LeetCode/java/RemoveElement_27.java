package Leetcode.java;

// 26-06-27 8min
// https://leetcode.com/problems/remove-element/
class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0 ; i<nums.length;i++){
            int v = nums[i];
            if(v!=val){
                count++;
            }else{
                nums[i] =51;
            }
        }
        Arrays.sort(nums);
        return count;
    }
}
