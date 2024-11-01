

import java.util.*;
import java.lang.*;
import java.io.*;


class Main
{
	public static void main (String[] args) throws IOException
	{
		// your code goes here
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();

int num = Integer.parseInt(br.readLine());
while(num-- >0){
String str = br.readLine();
int length = str.length();
sb.append(str.charAt(0)).append(str.chatAt(length-1).append("\n");
}

System.out.println(sb);

	}
}
