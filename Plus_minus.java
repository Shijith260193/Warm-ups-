import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Plus_minus {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner br=new Scanner(System.in);

        int size=br.nextInt();
        int[] array=new int[size];
        int count=0;
        double positive;
        double negative;
        double zero;
        int i=0;
        int count1=0,count2=0;
        for(i=0;i<size;i++)
        {
        	array[i]=br.nextInt();
        }
        for(i=0;i<size;i++)
        {
        	if(array[i]>0)
        	{
        		count++;
        	}
        	else if (array[i]<0)
        	{
        		count1++;
        	}
        	else
        	{
        		count2++;
        	}
        }
        positive=(double)count/size;
        negative=(double)count1/size;
        zero=(double)count2/size;
        
        String posstr=String.format("%2.03f",positive);
        String posstr1=String.format("%2.03f",negative);
        String posstr2=String.format("%2.03f",zero);
        System.out.println(posstr);
        System.out.println(posstr1);
        System.out.println(posstr2);



    }
}
