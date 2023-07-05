/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String tT=br.readLine();
        int t=Integer.parseInt(tT);
        while(t-->0){
            String nn[]=br.readLine().split(" ");
            int N=Integer.parseInt(nn[0]);
            int X=Integer.parseInt(nn[1]);
            int K=Integer.parseInt(nn[2]);
            int P=Integer.parseInt(nn[3]);
            if(K==0){
                System.out.println(P);
            }
            else if(K<=X){
                System.out.println(P+K*10);
            }
            else{
                int bonus=(K>=N)?20:0;
                System.out.println(P+(K-X)*5+X*10+bonus);
            }
        }
	}
}
