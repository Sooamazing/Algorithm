
import java.util.*;
import java.lang.*;
import java.io.*;

// 24-11-29 5min
// https://www.acmicpc.net/problem/1453
class PartTimeJobAtAnInternetCafe
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int num = Integer.parseInt(br.readLine());
StringTokenizer st = new StringTokenizer(br.readLine());
boolean[] isSeated = new boolean[101];

int result =0;
for(int i = 0; i < num ; i++){
int customer = Integer.parseInt(st.nextToken());
if(isSeated[customer]){
result++;
continue;
}
isSeated[customer]= true;

}
System.out.println(result);
	}
}
