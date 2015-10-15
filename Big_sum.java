import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Big_sum {

    public static void main(String[] args) {
       Scanner br=new Scanner(System.in);
		int i=0;
        long sum=0;
		
		int size=br.nextInt();
		long[] array=new long[size];
		for(i=0;i<size;i++)
		{
			array[i]=br.nextInt();
            
			sum=sum + array[i];
		}
		System.out.println(sum); 
    }
}
