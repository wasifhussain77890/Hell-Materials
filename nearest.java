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
Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		  int X=sc.nextInt();
		  int Y=sc.nextInt();
		  int diff=Math.abs(X-Y);
		  
		  if(diff==1){
		      System.out.println(diff);
		  }else if(diff%2==0){
		      System.out.println(diff/2);
		  }else{
		      System.out.println((diff+1)/2);
		  }
		    
		    
		    
		}
	}
}
