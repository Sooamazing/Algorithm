
import java.util.*;
import java.lang.*;
import java.io.*;

// by online ide
// 24-05-15 35min 
// https://www.acmicpc.net/problem/4889
public class Main
{
// static int goal;
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str;
		int idx = 1;
		while(!(str = br.readLine()).contains("-")){
			
			int result = 0;
			// boolean isPrevOpen = false;
			int length = str.length();
			// Stack<Character> stack = new Stack<>();
			// for(int i = 0 ; i <length ; i++){
			// 	stack.push(str.charAt(i));
			// }

			// Stack<Character> rightStack = new Stack<>();
			// char prevC = stack.pop();	

		int rightNum =0;
			for(int i = length-1; i>=0; i--){
				// charAt으로만 하는 방법 ? 
				char curC = str.charAt(i);
				// char curC = stack.pop();
				if(curC == '}'){
					// rightStack.push('}');
rightNum++;
				}else{
					if(rightNum>0){
						rightNum--;
					}else{
						result++;
						rightNum++;
					}
				}
			}
			
			result+=(rightNum/2);
		
			sb.append(idx).append(". ").append(result).append("\n");
			idx++;
		}

		System.out.println(sb);

	}
}
