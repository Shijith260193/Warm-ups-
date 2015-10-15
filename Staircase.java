import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) 
    {
        Scanner br=new Scanner(System.in);
        int i=0;
        int j=0;
        int k=0;
        char x=' ';
        char y='#';
        int size=br.nextInt();
        char[] array=new char[size-1];
        char[] array1=new char[size];
        Arrays.fill(array,x);
        Arrays.fill(array1,y);
        
        for(i=0;i<size;i++)
        {
            
            for(j=size-1;j>i;j--)
            {
                System.out.print(array[i]); 
                 
            }
            for(k=0;k<=i;k++)
            {
                System.out.print(array1[i]);    
            }
            
            
            System.out.println();
        }
    }
}
