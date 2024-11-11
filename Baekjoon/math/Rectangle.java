
import java.util.*;
import java.lang.*;
import java.io.*;

// 24-11-12 1min
// https://www.acmicpc.net/problem/27323
class Rectangle
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int x = Integer.parseInt(br.readLine());
int y = Integer.parseInt(br.readLine());

System.out.println(x*y);
	}
}
