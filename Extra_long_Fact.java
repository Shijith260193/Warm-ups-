import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Extra_long_Fact {

  public static void main(String[] args) {
  Scanner scn=new Scanner(System.in);
  int n=scn.nextInt();
  BigInteger fact= BigInteger.ONE;

    
  for (int i = 2; i <= n; i++){
  
  fact = fact.multiply(new BigInteger(String.valueOf(i)));

}

     System.out.println(fact);
    }
}
