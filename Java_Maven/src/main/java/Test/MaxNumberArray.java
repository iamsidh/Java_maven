package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaxNumberArray
{
     public static void main(String args[])throws IOException
      {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter the Nos.:");
         int a[]=new int [10];
         int max;
         for(int i=0;i<=9;i++)
           {
               a[i]=Integer.parseInt(br.readLine());
           }
          max=a[0];
          for(int j=1;j<=9;j++)
             {
                if(max<a[j]) 
                   { 
                      max=a[j];
                    }
             }
        System.out.println(" Max no is="+max);

  }
}