import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int giveTemp(int end){
        for(int i=3;i<(end/2);i+=2){
            if(end%i==0) return i;
        }
        return end;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String nn=br.readLine();
		    String nnn[]=nn.split(" ");
		    int X=Integer.parseInt(nnn[0]);
		    int Y=Integer.parseInt(nnn[1]);
		    int count=0,temp=0,W=0;
		    if(X%2!=0){
		        temp=giveTemp(X); 
		        W=1;
		    }
		    X+=temp;
		    if(Y%2!=0){
		        Y++;
		    }
		    int Z=Y-X; 
		    System.out.println((Z/2)+W);
		}
	}
}
