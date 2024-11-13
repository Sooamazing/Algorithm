
import java.util.*;
import java.lang.*;
import java.io.*;


// 24-11-13 5min
// https://www.acmicpc.net/problem/10807
class CountTheNumbers
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int size = Integer.parseInt(br.readLine());

int[] arr = new int[201];
StringTokenizer st = new StringTokenizer(br.readLine());
for(int i=0;i<size;i++){
int num = Integer.parseInt(st.nextToken());
arr[num+100]++;
}
int goal = Integer.parseInt(br.readLine());

System.out.println(arr[goal+100]);
	}
}
