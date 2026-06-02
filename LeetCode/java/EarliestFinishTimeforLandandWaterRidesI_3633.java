package LeetCode.java;

// 26-06-02
// https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i
// class Solution {
//     public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

//         int landLength = landStartTime.length;
//         int waterLength = waterStartTime.length;
//         int earliestFinished = 2000;

//         // land first
//         int landFinished = landStartTime[0] + landDuration[0];
//         int waterFinished = 2000;
//         for(int i = 0 ; i < waterLength; i++){
//             if(landFinished <= waterStartTime[i]){
//                 waterFinished = waterStartTime[i] + waterDuration[i];
//                 break;
//             }
//         }
//         earliestFinished = waterFinished;

//         // water first
//         waterFinished = waterStartTime[0] + waterDuration[0];
//         landFinished = 2000;
//         for(int i = 0 ; i < landLength; i++){
//             if(waterFinished <= landStartTime[i]){
//                 landFinished = landStartTime[i] + landDuration[i];
//                 break;
//             }
//         }
//         earliestFinished = Math.min(landFinished, earliestFinished);
//         return earliestFinished;
//     }
// }

public class EarliestFinishTimeforLandandWaterRidesI_3633 {

    public int earliestFinishTime(
            int[] landStartTime,
            int[] landDuration,
            int[] waterStartTime,
            int[] waterDuration
    ) {

        int n = landStartTime.length;
        int m = waterStartTime.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int land = landStartTime[i] + landDuration[i];
                int land_water =
                        Math.max(land, waterStartTime[j]) + waterDuration[j];
                res = Math.min(res, land_water);

                int water = waterStartTime[j] + waterDuration[j];
                int water_land =
                        Math.max(water, landStartTime[i]) + landDuration[i];
                res = Math.min(res, water_land);
            }
        }
        return res;
    }
}