import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Conversion  
{

    public static void main(String[] args) throws Exception
    {
    	
       Scanner br=new Scanner(System.in);
   		 String time=br.nextLine();
       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
       Date date = parseFormat.parse(time);
       System.out.println(displayFormat.format(date));

    }
}
