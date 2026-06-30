package LeetCode.java;

// 26-06-30
// https://leetcode.com/problems/string-compression-iii/
public class StringCompressionIII_3163 {

// class Solution {
//     public String compressedString(String word) {
//         StringBuilder sb = new StringBuilder();

//         int count = 0;
//         char prev = word.charAt(0);
//         for(int i = 1; i<word.length();i++){
//             char c = word.charAt(i);
//             count++;
//             if(prev == c){
//                 if(count == 9){
//                     sb.append(9).append(c);
//                     prev = c;
//                     count = 1;
//                 }
//             }else{
//                 sb.append(count).append(prev);
//                 prev = c;
//                 count = 1;
//             }
//         }
//             char c = word.charAt(word.length()-1);
//                 if(count == 9){
//                     sb.append(9).append(c);
//                 }else{
//                     sb.append(count).append(prev);
//                 }

//         return sb.toString().trim();
//     }
// }

    public String compressedString(String word) {

        StringBuilder comp = new StringBuilder("");

        // pos tracks our position in the input string
        int pos = 0;

        // Process until we reach end of string
        while (pos < word.length()) {
            int consecutiveCount = 0;

            char currentChar = word.charAt(pos);

            // Count consecutive occurrences (maximum 9)
            while (
                    pos < word.length() &&
                            consecutiveCount < 9 &&
                            word.charAt(pos) == currentChar
            ) {
                consecutiveCount++;
                pos++;
            }

            // Append count followed by character to result
            comp.append(consecutiveCount).append(currentChar);
        }

        return comp.toString();
    }
}