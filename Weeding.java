/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{

		// your code goes here
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tT=br.readLine();
        int t=Integer.parseInt(tT);
        while(t-->0){
            String nn[]=br.readLine().split(" ");
            int N=Integer.parseInt(nn[0]);
            int M=Integer.parseInt(nn[1]);
            int K=Integer.parseInt(nn[2]);
            String nnn[]=br.readLine().split(" ");
            int LD=Integer.parseInt(nnn[N-1]);
            if(((LD+K)-M)<=1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
	}
}
